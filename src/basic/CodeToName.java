package basic;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CodeToName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> langCode = Arrays.asList("it", "uk");
		langCode.forEach(lc -> {
			Locale loc = new Locale(lc);
			System.out.print(lc+"("+loc.getDisplayLanguage()+"), ");
		});
	}

}
