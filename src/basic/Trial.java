package basic;

import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		JSONArray ad = new JSONArray();
//		JSONObject aa1 = new JSONObject();
//		JSONObject aa2 = new JSONObject();
//		JSONObject aa3 = new JSONObject();
//		aa1.put("Sample", "Serve");
//		aa1.put("Sample1", "Serve1");
//		aa2.put("Sample", "Serve");
//		aa2.put("Sample1", "Serve1");
//		aa3.put("Sample", "Serve");
//		aa3.put("Sample1", "Serve2");
//		ad.add(aa1);
//		ad.add(aa2);
//		ad.add(aa3);
//		System.out.println(ad);
//		List<Map<String, String>> hm = ad;
//		System.out.println(hm);
//		System.out.println(hm.stream().filter(ss -> ss.get("Sample1")
//				.equalsIgnoreCase("Serve23")).findFirst().orElse(null));
//		String sample = "1";
//		int convert = Integer.parseInt(sample);
//		System.out.println(convert);
		
		String ss = "內漆";
		String res = ss.substring(0,1).toUpperCase()+ss.substring(1);
		System.out.println(res);
	}

}
