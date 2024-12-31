package basic;

import java.util.Arrays;
import java.util.List;

public class FindAdd {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,4,3,5);
		int target = 7;
		for(int i=0;i<numbers.size();i++) {
			if(numbers.subList(i, numbers.size()-1).contains(target-numbers.get(i))) {
//				int index = numbe
			}
		}
	}

}
