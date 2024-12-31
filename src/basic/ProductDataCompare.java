package basic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ProductDataCompare {

	public static void main(String[] args) {
		Object obj = null;
		Object obj1 = null;
		String path1 = "C:\\Users\\M1046874\\Downloads\\data_check\\brands.ebelev-fr.json";
		String path2 = "C:\\Users\\M1046874\\Downloads\\data_check\\brands.ebelev-fr-DMI.json";
		String market = path1.split("\\.")[1];
		try {
			BufferedReader f1 = new BufferedReader(new InputStreamReader(new FileInputStream(path1), "UTF-8"));
			BufferedReader f2 = new BufferedReader(new InputStreamReader(new FileInputStream(path2), "UTF-8"));
			obj = new JSONParser().parse(f1);
			obj1 = new JSONParser().parse(f2);
		} catch (Exception e) {
			e.printStackTrace();
		}

		JSONObject data = (JSONObject) obj;
		JSONObject data_dmi = (JSONObject) obj1;
		List<Map<String, Object>> products_dmi = (List) data_dmi.get("products");
		products_dmi = removeDuplicate(products_dmi,"globalId");
		
		Map<String, String> filtered_products_dmi = (Map<String, String>) products_dmi.stream()
				.collect(Collectors.toMap(d-> ((JSONObject)d).get("globalId").toString(),
						d-> ((JSONObject)d).get("name").toString()));
		System.out.println(market + ": ");
		System.out.println("----------");
		System.out.println("DMI products count: " + filtered_products_dmi.size());
		
		List<JSONObject> categories = (List<JSONObject>) ((JSONObject)((JSONArray)data.get("brands")).get(0)).get("categories");
		
		List<Map<String, Object>> products = new ArrayList<>();
		for(JSONObject d: categories) {
			products.addAll(((List)d.get("products")));
		}
		
		products = removeDuplicate(products, "product_id");
		
		Map<String, String> filtered_products = (Map<String, String>) products.stream()
				.collect(Collectors.toMap(d-> ((JSONObject)d).get("product_id").toString(),
						d-> ((JSONObject)d).get("name").toString()));
		System.out.println("JSON products count: " + filtered_products.size());
		
		System.out.println("=> Products not in DMI but in Mobile app JSON data");
		compareProductsData(filtered_products, filtered_products_dmi);
		System.out.println("=> Products in DMI but not in Mobile app JSON data");
		compareProductsData(filtered_products_dmi, filtered_products);
		System.out.println("Done");
	}
	
	public static List<Map<String, Object>> removeDuplicate(List<Map<String, Object>> inputList, String attribute) {
		List<Map<String, Object>> outputList = new ArrayList<>();
		
		AtomicInteger counter = new AtomicInteger();
	     
	      inputList.stream().forEach(oList -> {
	    	  counter.incrementAndGet();
		      int index = inputList.subList(counter.get(),inputList.size()).stream()
		          .anyMatch(iList-> iList.get(attribute).toString()
		        		  .equals(oList.get(attribute).toString())) ?
		           1 : -1;
		         if(index==-1) {
		        	 outputList.add(oList);
		         }
	      });
		return outputList;
	}
	
	public static void compareProductsData(Map<String, String> jsonData, Map<String, String> jsonData1) {
		jsonData.entrySet().stream().forEach(m -> {
			if(!jsonData1.containsKey(m.getKey())) {
				System.out.println(m.getKey() + " - " + m.getValue());
			}
//			if(jsonData1.containsKey(m.getKey())) {
//				if(!jsonData1.get(m.getKey()).equals(m.getValue())) {
//					System.out.println("Error: " + m.getKey() + " = " + m.getValue());
//					System.out.println("       " + m.getKey() + " = " + jsonData1.get(m.getKey()));
//				}
//			} else {
//				System.out.println("Product not present in DMI " + m);
//			}
		});
	}

}
