package basic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch.Diff;

public class StringDifferenceCheck {

	public static void main(String[] args) {
		String src = "Taubmans CP4 Reduced Papua New Guinea (Columbus), Tranquil Dawn™- Dulux Colour of the Year 2020, Taubmans CP4 Extended Papua New Guinea (Columbus), Taubmans Ready Mixed Papua New Guinea (Columbus), Bright Skies™ - Taubmans Colour of the Year 2022, Wild Wonder™ - Taubmans Colour of the Year 2023, ";
		String upd = "Taubmans CP4 Reduced Papua New Guinea (Columbus), Taubmans CP4 Extended Papua New Guinea (Columbus), Taubmans Ready Mixed Papua New Guinea (Columbus), Bright Skies™ - Taubmans Colour of the Year 2022, Wild Wonder™ - Taubmans Colour of the Year 2023, Tranquil Dawn™- Dulux Colour of the Year 2021, ";
		System.out.println(resultChanges(src, upd));
		
//	      System.out.println(StringUtils.difference(a, b));
//	      System.out.println(StringUtils.difference("xyzabc", "abc"));
//	      System.out.println(StringUtils.difference(b, a));
//	      String text1 = "ABCDELMNOP";
//	      String text2 = "ABCLMN";
//	      DiffMatchPatch dmp = new DiffMatchPatch();
//	      LinkedList<Diff> diff = dmp.diffMain(text1, text2, false);
//	      System.out.println(diff);
//	      System.out.println(diff.get(1).operation.toString().equalsIgnoreCase("delete"));
	      
	}
	
	public static  String resultChanges(String src, String upd) {
		List<String> srcList = new LinkedList<>(Arrays.asList(src.split(", ")));
		List<String> updList = new LinkedList<>(Arrays.asList(upd.split(", ")));
		
		String removedItems = String.join(", ",srcList.stream()
				.filter(cc -> !updList.contains(cc))
				.collect(Collectors.toList()));
		String addedItems = String.join(", ",updList.stream()
				.filter(cc -> !srcList.contains(cc))
				.collect(Collectors.toList()));
		
		String result = "";
		result += removedItems.length() == 0 ? "" : "Removed Items: " + removedItems + ";\n";
		result += addedItems.length() == 0 ? "" : "Added Items: " + addedItems + ";";
		return result.length() == 0 ? "Order (or) internal parameters of items might be changed" : result;
	}

}
