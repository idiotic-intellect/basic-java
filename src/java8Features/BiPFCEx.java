package java8Features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPFCEx {

	public static void main(String[] args) {
		// Similar to its preceded ones but accepts two arguments as input
		// T - data type of first input, U - data type of second input, R - data type of return data
		
		BiPredicate<Integer, Integer> bp = (a, b) -> (a + b) % 2 == 0;	// BiPredicate<T, U> bp = (in1, in2) -> {return <boolean> data;};
																		// bp.test(<T> in1, <U> in2);
		
		BiFunction<Integer, Integer, Double> bf = (a, b) -> Math.pow(a+b, 2);  // BiFunction<T, U, R> bf = (in1, in2) -> {return <R> data;};
																			   // bf.apply(<T> in1, <U> in2);
		
		BiConsumer<Integer, Integer> bc = (a, b) -> {				// BiConsumer<T, U> bc = (in1, in2) -> {};
			String res = "Addition of "+ a + " and " + b;			// bc.accept(<T> in1, <U> in2);
			if(bp.test(a, b)) {
				res += " is even ";
			} else {
				res += " is not even ";
			}
			res += " and it's square result is " + bf.apply(a, b);
			System.out.println(res);
		};
		
		bc.accept(2, 4);
		bc.accept(7, 4);
	}

}
