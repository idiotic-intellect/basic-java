package java8Features;

import java.util.function.BiPredicate;

public class BiPredicateEx {

	static BiPredicate<Integer, Integer> kp = (a, b) -> (a + b) % 2 == 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer, Integer> bp = (a, b) -> (a + b) % 2 == 0;
		System.out.println(bp.test(2, 4));
		System.out.println(BiPredicateEx.kp.test(7, 4));
	}

}
