package java8Features;

public class MethodReferEx {

	public static void main(String[] args) {
		MethodReferEx re = new MethodReferEx();
		Intref i = re :: m2;						// ObjName :: MethodName (if implementation is non-static method)
		Intref1 i1 = MethodReferEx :: k2;			// ClassName :: MethodName (if implementation is static method)
		i.m1();										// argument count and type should match
		i1.k1(10);									// different return type and access modifiers allowed
	}
	
	public static void k2(int s) {
		System.out.println("Method Reference2");
	}
	
	private int m2() {
		System.out.println("Method Reference");
		return 10;
	}
}

interface Intref {
	
	public void m1();
}

interface Intref1 {
	
	public void k1(int n);
}