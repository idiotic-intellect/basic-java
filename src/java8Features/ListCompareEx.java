package java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListCompareEx {

	public static void main(String[] args) {
		List<String> s1 = new ArrayList<String>();
		s1.add("Sample");
		s1.add("Simple");
		s1.add("Kaggle");
		System.out.println(s1);
//		Collections.sort(s1, new nameCompare());
		Collections.sort(s1, (a,b) -> a.compareTo(b)*-1 );
		System.out.println(s1);
		System.out.println("**********************************************************************");
		Collections.sort(s1);
		System.out.println(s1);
		Collections.sort(s1, Comparator.reverseOrder());
		System.out.println(s1);
		System.out.println("**********************************************************************");
		System.out.println(s1.stream().sorted().collect(Collectors.toList()));
		System.out.println(s1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		System.out.println("**********************************************************************");
	}
}

//class nameCompare implements Comparator<String> {
//
//	@Override
//	public int compare(String o1, String o2) {
//		// TODO Auto-generated method stub
//		return o1.compareTo(o2);
//	}
//
//	
//}
