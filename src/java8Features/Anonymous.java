package java8Features;

public class Anonymous {

	int x = 888;
	public void pk2() {
//		jp s1 = new jp() {
//			int x = 999;
//			@Override
//			public void pk1() {
//				// TODO Auto-generated method stub
//				System.out.println(x);
//				System.out.println(this.x);
//				System.out.println(Anonymous.this.x);
//			}
//			
//		};
		
		jp s1 = () -> {	// defining function as it has only one abstract method
			int x = 999;
				// TODO Auto-generated method stub
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(Anonymous.this.x);
		};
		s1.pk1();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous a1 = new Anonymous();
		a1.pk2();
	}

}

interface jp {
	public void pk1();
}
