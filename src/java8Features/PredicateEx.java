package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		
		List<SE> softE = new ArrayList<>();
		softE.add(new SE("APK", 19, true));
		softE.add(new SE("LLk", 19, false));
		softE.add(new SE("HMT", 18, true));
		softE.add(new SE("MLK", 18, false));
		softE.add(new SE("HSE", 15, true));
		softE.add(new SE("HSL", 15, false));
		
		Predicate<SE> auth = se -> se.getAge() >= 18 && se.isHaveGF();
		for(SE pro : softE) {
			System.out.print(pro);
			if(auth.test(pro)) {
				System.out.println(" allowed");
			} else {
				System.out.println(" not allowed");
			}
			
		}
	}

}

class SE {
	private String name;
	private int age;
	private boolean isHaveGF;
	
	public SE(String name, int age, boolean isHaveGF) {
		super();
		this.name = name;
		this.age = age;
		this.isHaveGF = isHaveGF;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHaveGF() {
		return isHaveGF;
	}

	public void setHaveGF(boolean isHaveGF) {
		this.isHaveGF = isHaveGF;
	}

	@Override
	public String toString() {
		return name;
	}
	
	
	
}
