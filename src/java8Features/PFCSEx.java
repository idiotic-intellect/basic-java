package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PFCSEx {

	public static void main(String[] args) {
		// T- Type of input parameter, R- Type of returning data
														// Populate some data
														// No input data, return data any type
		Supplier<List<Students>> s1 = () -> {			// Supplier<R> s = () -> {return <R> data;};
			List<Students> stu= new ArrayList<>();		// s.get();
			stu.add(new Students("sam", 80));
			stu.add(new Students("ram", 59));
			stu.add(new Students("Kam", 60));
			return stu;
		};
																// Performs condition check
																// Input data any type, return data only boolean type
		Predicate<Students> p1 = stu -> stu.getMark() >= 60;	// Predicate<T> p = in -> {return <boolean> data;};
																// p.test(<T> in);
		
															// Execute some operations
															// Input data any type, return data any type
		Function<Students, String> f1 = stu -> {			// Function<T, R> f = in -> {return <R> data;};
			int mark = stu.getMark();						// f.apply(<T> in);
			if(mark >= 80) {
				return mark + " - A - Distinction";
			} else if(mark >=70) {
				return mark + " - B - First";
			} else if(mark >= 60) {
				return mark + " - C - Second";
			} else if(mark >= 50) {
				return mark + " - D - Third";
			} else if(mark >= 40) {
				return mark + " - E - Fourth";
			} else {
				return mark + " - F - Fail";
			}
		};
																						// Get input data not return anything
																						// Input data any type, no return data
		Consumer<Students> c1 = stu -> System.out.println(stu +" - " +f1.apply(stu));	// Consumer<T> c = in -> {};
																						// c.accept(<T> in);
		List<Students> st = s1.get();
		
		for(Students s: st) {
			if(p1.test(s)) {
				c1.accept(s);
			}
		}

	}

}

class Students {
	private String name;
	private int mark;
	
	public Students(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
