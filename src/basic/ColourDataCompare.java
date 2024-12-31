package basic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ColourDataCompare {

	public static void main(String[] args) {
		Object obj = null;
		Object obj1 = null;
		String path1 = "C:\\Users\\M1046874\\Downloads\\data_check"
				+ "\\uk\\allcolours\\allColoursV2.eukexp-en.json";
		String path2 = "C:\\Users\\M1046874\\Downloads\\data_check"
				+ "\\uk\\allcolours\\allColoursV2.eukexp-en-DMI.json";
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
		
		List<Map<String, Object>> colours = (List) data.get("colours");
		
		Map<String, String> filtered_colours = colours.stream()
				.collect(Collectors.toMap(c->((JSONObject)c).get("uid").toString(), 
						c->(((JSONObject)c).get("color_id").toString()
								+ "-" + ((JSONObject)c).get("rgb").toString())));
		System.out.println("JSON colours count: " + filtered_colours.size());
		
		List<Map<String, Object>> colours_dmi = (List) data_dmi.get("colors");
		
		Map<String, String> filtered_colours_dmi = new HashMap<>();
		
		colours_dmi.stream().forEach(c -> {
			((List)c.get("colorCollections")).stream().forEach(d -> {
				filtered_colours_dmi.put(((JSONObject)d).get("colorCollectionColorId").toString(), 
						c.get("colorId")+"-"+c.get("rgb"));
			});
		});
		System.out.println("DMI colours count:" + filtered_colours_dmi.size());
		compareColoursData(filtered_colours, filtered_colours_dmi);
		System.out.println("Done");
	}
	
	public static void compareColoursData(Map<String, String> jsonData, Map<String, String> dmiData) {
		jsonData.entrySet().stream().forEach(m -> {
			if(dmiData.containsKey(m.getKey())) {
				if(!dmiData.get(m.getKey()).equals(m.getValue())) {
					System.out.println("Error: " + m.getKey() + " = " + m.getValue());
					System.out.println("       " + m.getKey() + " = " + dmiData.get(m.getKey()));
				}
			} else {
//				System.out.println("Color not present in DMI " + m);
			}
		});
	}

}
