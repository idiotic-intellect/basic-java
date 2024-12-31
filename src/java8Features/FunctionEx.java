package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> st = new ArrayList<>();
		st.add(new Student("sam", 80));
		st.add(new Student("ram", 69));
		Function<Student, String> f1 = stu -> {
			int mark = stu.getMark();
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
		
		for(Student s: st) {
			System.out.println(s + " - " + f1.apply(s));
		}
	}

}

class Student {
	private String name;
	private int mark;
	
	public Student(String name, int mark) {
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
