package java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomObjSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> el = new ArrayList<>();
		el.add(new Employee(200, "Ample"));
		el.add(new Employee(400, "Char"));
		el.add(new Employee(100, "Brick"));
		el.add(new Employee(300, "Drago"));
		System.out.println(el);
		Collections.sort(el, (e1, e2) -> e1.getEno() > e2.getEno() ? 1 : e1.getEno() < e2.getEno() ? -1 : 0);
		System.out.println(el);
		Collections.sort(el, (e1, e2) -> e1.getEno() > e2.getEno() ? -1 : e1.getEno() < e2.getEno() ? 1 : 0);
		System.out.println(el);
		Collections.sort(el, (e1, e2) -> e1.getEname().compareTo(e2.getEname()));
		System.out.println(el);
		Collections.sort(el, (e1, e2) -> e1.getEname().compareTo(e2.getEname())*-1);
		System.out.println(el);
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println( el.stream().sorted(Comparator.comparingInt(e1 -> ((Employee) e1).getEno()).reversed())
				.collect(Collectors.toList()));
		System.out.println( el.stream().sorted(Comparator.comparing(e1 -> ((Employee) e1).getEname()).reversed())
				.collect(Collectors.toList()));
		System.out.println("---------------------------------------------------------------------------------------");
		Collections.sort(el, Comparator.comparingInt(e1 -> ((Employee) e1).getEno()).reversed());
		System.out.println(el);
		Collections.sort(el, Comparator.comparing(e1 -> ((Employee) e1).getEname()).reversed());
		System.out.println(el);
	}

}

class Employee {
	
	private int eno;
	private String ename;
	
	Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{" + eno + ":" + ename + "}";
	}
	
	
	
}
