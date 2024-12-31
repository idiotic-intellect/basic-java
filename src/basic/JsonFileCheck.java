package basic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonFileCheck {

	public static void main(String[] args) {
		Object obj = null;
		String path1 = "C:\\Users\\M1046874\\Downloads\\allColoursV2.enlflx-nl_qa.json";
		try {
			BufferedReader f1 = new BufferedReader(new InputStreamReader(new FileInputStream(path1), "UTF-8"));
		
			obj = new JSONParser().parse(f1);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

		JSONObject data = (JSONObject) obj;
		List<Map<String, Object>> colours = (List) data.get("colours");
		
		Map<String, Set<String>> colors_data = colours.stream().collect(
				Collectors.groupingBy(x -> ((JSONObject)x).get("primary_label").toString().toLowerCase(), 
						Collectors.mapping(
								x->((JSONObject)x).get("rgb").toString().toLowerCase() + "-" 
										+ ((JSONObject)x).get("default_color_family").toString().toLowerCase(),
								Collectors.toSet()
								)
						)
				);
//		System.out.println(colors_data);
		Map<String, Set<String>> filtered_data = new HashMap<>();
				colors_data.forEach((name,val) -> {
					if(val.size() > 1) {
						filtered_data.put(name, val);
					}
				});
		System.out.println(filtered_data);
	}

}
