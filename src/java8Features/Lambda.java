package java8Features;

public class Lambda {

	public static void main(String[] args) {
		m1 s = a -> a.length();
		System.out.println(s.k1("Sample Studies"));
		System.out.println(s.k2() +"  "+ m1.k3());
	}
	
	interface m1 {
		int k1(String s1);
		default int k2() {
			return 11;
		}
		static int k3() {
			return 12;
		}
	} 
	
	
}
