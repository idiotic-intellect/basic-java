package java8Features;

import java.util.function.BiFunction;

public class BiFunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiFunction<Integer, Integer, Double> bf = (a, b) -> Math.pow(a+b, 2);
		System.out.println(bf.apply(2, 4));
		System.out.println(bf.apply(7, 4));
	}

}
