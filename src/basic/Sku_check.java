package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.parser.JSONParser;

public class Sku_check {

	public static void main(String[] args) {
		Object obj = null;
		String path1 = "D:\\check\\sku.eukexp-en.json";
		String[] fileName = path1.split("\\.");
		try {
			BufferedReader f1 = new BufferedReader(new InputStreamReader(new FileInputStream(path1), "UTF-8"));
			obj = new JSONParser().parse(f1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Map<String, Map> initial_data = (Map<String, Map>) obj;
		Map<String, List> articles = new HashMap<>();
		Map<String, Object> articleProducts =  new HashMap<>();
		Map<String, Object> articleColors =  new HashMap<>();
		List<ArticleData> artColorsList = new ArrayList<>();
		List<ArticleData> artProductsList = new ArrayList<>();
		
		
		for (Map<String, Object> ac : ((List<Map<String, Object>>)initial_data.get("product_sku_map"))) {
			List<ArticleColor> result=  new ArrayList<>();
			Set<String> keys = ((Map)ac.get("articles_for_colours")).keySet();
			ArticleData articleProduct =  new ArticleData();
			ArticleData articleColor =  new ArticleData();
			
			for (String colorId: keys) {
				ArticleColor articleColorId = new ArticleColor();
				articleColorId.setColorId(colorId.toString());
				articleColorId.setArticles((List)((Map)ac.get("articles_for_colours")).get(colorId));
				result.add(articleColorId);
			}
			articleColor.setArticles(result);
			articleColor.setProductId(ac.get("product_id").toString());
			articleProduct.setArticles((List)ac.get("articles_for_product"));
			articleProduct.setProductId(ac.get("product_id").toString());
			artColorsList.add(articleColor);
			artProductsList.add(articleProduct);
		}
		articles.put("articles", (List) initial_data.get("articles"));
		articleProducts.put("articles_for_product", artProductsList);
		articleColors.put("articles_for_colours", artColorsList);
		
		
		try {
			BufferedWriter bff1 = new BufferedWriter(new FileWriter(fileName[0]+"1."+fileName[1]+"."+fileName[2]));
			BufferedWriter bff2 = new BufferedWriter(new FileWriter(fileName[0]+"2."+fileName[1]+"."+fileName[2]));
			BufferedWriter bff3 = new BufferedWriter(new FileWriter(fileName[0]+"3."+fileName[1]+"."+fileName[2]));
			bff1.write(articles.toString());
			System.out.println("Completed!");
			bff2.write(articleProducts.toString());
			System.out.println("Completed!!");
			bff3.write(articleColors.toString());
			bff1.close();
			bff2.close();
			bff3.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Completed!!!");
		

	}

}
