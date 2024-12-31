//package basic;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.regex.*;
//
//public class Pattern {
//
//	public static void main(String[] args) {
//		 int x=10;
//	      int y=25;
//	      int z=x+y;
//	      Pattern MY_PATTERN = Pattern.compile("\\{\\.*\\}");
//	      Matcher m = MY_PATTERN.matcher("{title:[Title],  {data:Data, {foo: 'Bar'}}}");
//	      Map<String, String> data = new HashMap();
//	while (m.find()) {
//	    String s = m.group();
//	    System.out.println(m);
//	   
//	    System.out.println(s);
//	    
//	}
//
//	// System.out.println(data);
//	    //   System.out.println(Pattern.matches("(\\w+):(\\d+)","{title:'Title',  {data:'Data', {foo: 'Bar'}}}"));
//	}
//
//}
