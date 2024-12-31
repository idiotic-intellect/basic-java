package java8Features;

import java.util.TreeSet;

public class TreeSetCompareEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> tr = new TreeSet<>((a,b)-> a>b ? -1 : b>a ? 1:0);
		tr.add(20);
		tr.add(5);
		tr.add(9);
		System.out.println(tr);
		TreeSet<Integer> tr1 = new TreeSet<>();
		tr1.add(20);
		tr1.add(5);
		tr1.add(9);
		System.out.println(tr1);
	}

}
