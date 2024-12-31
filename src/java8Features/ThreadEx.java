package java8Features;

public class ThreadEx {
	
	public static void main(String[] args) {
		Runnable rt =() -> {
			for(int i=0; i<10; i++) {
				System.out.println("Child thread");
			}
		};
		Thread th = new Thread(rt);
		th.start();
		for(int i=0; i<10; i++) {
			System.out.println("Parent thread");
		}
	}
}

//class myRun implements Runnable {
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		for(int i=0; i<10; i++) {
//			System.out.println("Child thread");
//		}
//	}
//	
//} 

