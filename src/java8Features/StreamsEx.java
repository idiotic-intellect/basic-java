package java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		l.add(0); l.add(10); l.add(20);
		l.add(5); l.add(15); l.add(25);
		
		List<String> al = new ArrayList<>();
		al.add("Chan"); al.add("Ahan"); al.add("Khan");
		al.add("Jhan"); al.add("Zhan"); al.add("Mhan");
		
		System.out.println(l);
		System.out.println(al);
		
		// sorted
		List<Integer> sl = l.stream().sorted().collect(Collectors.toList());
		System.out.println(sl);
		List<String> sal = al.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); 
//				al.stream().sorted((a,b) -> a.compareTo(b) * -1).collect(Collectors.toList());
		System.out.println(sal);
		
		// filter, map - 1 to 1, collect
		List<Integer> nl = l.stream().filter(in -> in%2==0).map(in -> in * 2).collect(Collectors.toList());
		System.out.println(nl.stream().count());
		System.out.println(nl);
		
		// reduce
		int n = nl.stream().reduce(0, Integer::sum);
		System.out.println(n);
		
		// min, max
		System.out.println(l.stream().min((a, b) -> a.compareTo(b)).get());
		System.out.println(l.stream().max((a, b) -> a.compareTo(b)).get());
		
		// forEach
		l.stream().forEach(System.out::print);
		System.out.println();
		
		// toArray
		System.out.println(l.toArray()[1]);
		System.out.println(l.toArray(new Integer[0])[2]);
		System.out.println(l.stream().toArray()[3]);
		System.out.println(l.stream().toArray(Integer[] :: new)[4]);
		
		// Stream.of
		String[] arr = { "Chane", "Ahan", "Khane", "Jhan", "Zhane", "Mhan" };
		List<String> asl =Stream.of(arr).filter(in -> in.length()>=5).map(in -> in.toUpperCase()).collect(Collectors.toList());
		System.out.println(asl);
		List<Integer> anl = Stream.of(0, 10, 20, 5, 15, 25).filter(in -> in%2==0).map(in -> in * 2).collect(Collectors.toList());
		System.out.println(anl);
		
		// flatMap - 1 to Many
		List<String> version = Arrays.asList("Java 7", "Java 8", "Java 9", "Java 10", "Java 11", "Java 12");
		List<String> flatMapResult = version.stream()
				.flatMap(ver -> Stream.of(ver.toUpperCase(), ver.toLowerCase(), ver+" Pk"))
				.collect(Collectors.toList());
		System.out.println(flatMapResult);
	}

}
