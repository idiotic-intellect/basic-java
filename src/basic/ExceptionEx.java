package basic;

public class ExceptionEx {

	public static void main(String[] args) {
		int num = 1234_5678;
		System.out.println(num);
		System.out.println(num + 10);
		String str = "Java 11";

		switch (str) {
		case "Java 7":
			System.out.println("Java version 7");
			break;
		case "Java 8":
			System.out.println("Java version 8");
			break;
		case "Java 9":
			System.out.println("Java version 9");
			break;
		case "Java 10":
			System.out.println("Java version 10");
			break;
		case "Java 11":
			System.out.println("Java version 11");
			break;
		case "Java 12":
			System.out.println("Java version 12");
			break;
		default:
			System.out.println("Java verison older than 7");
			break;
		}

	}
}
