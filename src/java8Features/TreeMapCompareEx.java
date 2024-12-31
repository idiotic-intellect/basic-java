package java8Features;

import java.util.TreeMap;

public class TreeMapCompareEx {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<>((a,b)-> a>b ? -1 : b>a ? 1:0);
		tm.put(20, "Sample");
		tm.put(5, "Simple");
		tm.put(9, "Shell");
		System.out.println(tm);
		TreeMap<Integer, String> tm1 = new TreeMap<>();
		tm1.put(20, "Sample");
		tm1.put(5, "Simple");
		tm1.put(9, "Shell");
		System.out.println(tm1);
	}
}
