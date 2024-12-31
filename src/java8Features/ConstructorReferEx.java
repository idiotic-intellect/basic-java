package java8Features;

public class ConstructorReferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				// Constructor refers creates object
		Intref2 i2 = ConstructorReferEx :: new;			// ClassName :: new
		ConstructorReferEx cr = i2.give();				// return type, arg type,  arg count should same

	}
	
	ConstructorReferEx() {
		System.out.println("Constructor of sample class to create object");
	}

}

interface Intref2 {
	public ConstructorReferEx give();
}

//class Sample {
//	
//	Sample() {
//		System.out.println("Constructor of sample class to create object");
//	}
//}
