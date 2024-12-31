package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 Map<String, Object> m1 = new HashMap<>();
	      Map<String, Object> m2 = new HashMap<>();
	      Map<String, Object> m3 = new HashMap<>();
	      Map<String, Object> m4 = new HashMap<>();
	      Map<String, Object> m5 = new HashMap<>();
	      Map<String, Object> m6 = new HashMap<>();
	      Map<String, Object> m7 = new HashMap<>();
	      List<Map<String,Object>> li = new ArrayList<>();
	      
	      m1.put("sample","issue");
	      m2.put("sample","issue2");
	      m3.put("sample","issue2");
	      m4.put("sample","issue2");
	      m5.put("sample","issue2");
	      m6.put("sample","issue3");
	      m7.put("sample","issue3");
	      li.add(m1);
	      li.add(m2);
	      li.add(m3);
	      li.add(m4);
	      li.add(m5);
	      li.add(m6);
	      li.add(m7);
	      
	      System.out.println(li);
	      
	      List<Map<String,Object>> lres = new ArrayList<>();
	      AtomicInteger k = new AtomicInteger();
	     
	      li.stream().forEach(l -> {
	    	  k.incrementAndGet();
		      int index = li.subList(k.get(),li.size()).stream()
		          .anyMatch(l2-> l2.get("sample").equals(l.get("sample"))) ?
		           1 : -1;
		         if(index==-1) {
		        	 lres.add(l);
		         }
	      });
	      System.out.println(lres);
	}
	
}
