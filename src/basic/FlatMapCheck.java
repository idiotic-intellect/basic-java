package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Map> mainList = new ArrayList<>();
		String ccId = "15450-edkexp-da";
		Map<String, Object> a1 = new HashMap<>();
		Map<String, Object> a2 = new HashMap<>();
		List<Map> b1 = new ArrayList<>();
		List<Map> b2 = new ArrayList<>();
		Map<String, String> c1 = new HashMap<>();
		Map<String, String> c2 = new HashMap<>();
		Map<String, String> c3 = new HashMap<>();
		Map<String, String> c4 = new HashMap<>();
		
		c1.put("colorCollectionColorId", "1854715");
		c1.put("displayName", "322 Light");
		c1.put("rgb", "#EEEBE1");
		
		c2.put("colorCollectionColorId", "1854716");
		c2.put("displayName", "334 Rød");
		c2.put("rgb", "#74271D");
		
		c3.put("colorCollectionColorId", "1854750");
		c3.put("displayName", "322 Dark");
		c3.put("rgb", "#EEEBEF");
		
		c4.put("colorCollectionColorId", "1854790");
		c4.put("displayName", "334 Random");
		c4.put("rgb", "#74271F");
		
		b1.add(c1);
		b1.add(c2);
		
		b2.add(c3);
		b2.add(c4);
		
		a1.put("colors", b1);
		a1.put("colorCollectionId", "15495-edkexp-da");
		
		a2.put("colors", b2);
		a2.put("colorCollectionId", "15450-edkexp-da");
		
		mainList.add(a1);
		mainList.add(a2);
		
		List<String> colorLookUpIds = (List<String>) mainList.stream()
				.filter(cc -> ((Map) cc).get("colorCollectionId").toString().equals(ccId))
				.flatMap(cc->((List)((Map)cc).get("colors")).stream())
				.map(ccc-> ((Map) ccc).get("colorCollectionColorId").toString())
				.collect(Collectors.toList());
		System.out.println(colorLookUpIds);
		
	}

}
