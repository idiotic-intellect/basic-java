package basic;

public class Marketnamecheck {

	public static void main(String[] args) {
		printRequired("Papua New Guinea Visualiser");
		printRequired("South Africa Visualiser");
		printRequired("South Africa Expert");
		printRequired("Netherlands Visualiser");
		printRequired("Netherlands Expert");
		printRequired("Hong Kong Visualiser");
		printRequired("Sri Lanka Visualiser");
	}
	
	static void printRequired(String marketName) {
		String[] splited = marketName.trim().split("\\s+");
		String result = splited[splited.length - 1];

		System.out.println("MarketName: "+ marketName + " - words - "+ splited.length +" - Result: "+result);
	}

}
