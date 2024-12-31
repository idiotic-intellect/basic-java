package basic;

interface A {
	
	default void car() {
		System.out.println("Print A Car");
	}
	
	static void Bike() {
		System.out.println("Print A Bike");
	}
}

interface B extends A{
	
	default void car() {
		System.out.println("Print B Car");
	}
	
	static void Bike() {
		System.out.println("Print B Bike");
	}
}

interface C extends A{
	
	default void car() {
		System.out.println("Print C Car");
	}
	
	static void Bike() {
		System.out.println("Print C Bike");
	}
}

public class DiamondIssue implements B,C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new DiamondIssue();
		B b = new DiamondIssue();
		C c = new DiamondIssue();
		a.car();
		A.Bike();
		b.car();
		B.Bike();
//		c.car();
//		C.Bike();
	}

	@Override
	public void car() {
		// TODO Auto-generated method stub
		B.super.car();
		C.super.car();
	}

}
