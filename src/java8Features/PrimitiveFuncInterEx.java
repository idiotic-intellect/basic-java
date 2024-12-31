package java8Features;

import java.util.function.BinaryOperator;
import java.util.function.DoubleSupplier;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class PrimitiveFuncInterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// T - data type of first input, U - data type of second input, R - data type of return data

		int[] x = { 0, 5, 10, 15, 20 };	
		
	// **********************************************************************************************************************************************************************************************************	
		
		// Primitive Predicate
		IntPredicate ip = a -> a % 2 == 0;		// IntPredicate, DoublePredicate, LongPredicate
												// gets primitive data type as input, returns boolean
		for (int i : x) {
			System.out.println(ip.test(i));
		}	
		
	// **********************************************************************************************************************************************************************************************************	
		
		// Primitive Function
		IntFunction<Integer> If = a -> a*a;		// IntFunction, DoubleFunction, LongFucntion
												// gets primitive data type as input, returns <R> (Object type specified)
		System.out.println(If.apply(10));
		
		IntToDoubleFunction idf = a -> a * 3.14;  // IntToDoubleFunction, IntToLongFunction, DoubleToIntFunction, DoubleToLongFunction, LongToIntFunction, LongToDoubleFunction
												  // gets particular function's primitive <T> as input data type, <R> as return data type
		System.out.println(idf.applyAsDouble(28));
		
		ToIntFunction<String> tif = str -> str.length(); // ToIntFunction, ToDoubleFunction, ToLongFunction
														// gets specified object type <T> as input, returns particular function's primitive <R> as return data type
		System.out.println(tif.applyAsInt("Java"));
		
		ToIntBiFunction<String, String> tibf = (str1, str2) -> (str1 + str2).length();  // ToIntBiFunction, ToDoubleBiFunction, ToLongBiFunction
																						// gets specified object type <T, U> as two inputs, returns particular function's primitive <R> as return data type
		System.out.println(tibf.applyAsInt("Java", "Springboot"));
		
	// **********************************************************************************************************************************************************************************************************	
		
		// Primitive Consumer
		IntConsumer ic = a -> System.out.println(a*a*a); // IntConsumer, DoubleConsumer, LongConsumer
																 // gets particular function's primitive <T> as input data type, Returns nothing
		ic.accept(2);
		
		ObjIntConsumer<String> oic = (str, a) -> System.out.println(str.length() + a);  // ObjIntConsumer, ObjDoubleConsumer, ObjLongConsumer
																						// gets specified object type <T> and particular function's primitive <R> as input data type, Returns nothing
		oic.accept("Java", 5);
		
	// **********************************************************************************************************************************************************************************************************	
		
		// Primitive Supplier
		DoubleSupplier ds = () -> Math.random();  // IntSupplier, DoubleSupplier, LongSupplier, BooleanSupplier
												  // gets nothing as input, returns data of particular function's primitive <R> data type
		System.out.println(ds.getAsDouble());
		
	// **********************************************************************************************************************************************************************************************************
		
		// Unary Operator and its Primitive types
		UnaryOperator<Integer> uo = a -> a*a;  // Both Input data type and return type are same
												 // UnaryOperator<T> uo = in -> {return <T> data;};
												 // uo.apply(<T> in); 
		System.out.println(uo.apply(10));
		
		IntUnaryOperator iuo = a -> a*a*a;  // IntUnaryOperator, DoubleUnaryOperator, LongUnaryOperator
											// Both Input data type and return type are particular function's primitive <T> data type
		System.out.println(iuo.applyAsInt(17));
		
	// **********************************************************************************************************************************************************************************************************
		
		// Binary Operator and its Primitive types
		BinaryOperator<String> bo = (str1, str2) -> str1 + str2;  // Both two Inputs data type and also return data type are same
																  // BinaryOperator<T> bp = (in1, in2) -> {return <T> data;};
																  // bo.apply(<T> in1, <T> in2);
		System.out.println(bo.apply("Spring", "Boot"));
		
		IntBinaryOperator ibo = (a, b) -> a*a + 2*a*b + b*b;  // IntBinaryOperator, DoubleBinaryOpeator, LongBinaryOperator
															  // Both two Inputs data type and also return data type are particular function's primitive <T> data type
		System.out.println(ibo.applyAsInt(2, 3));
		
	// **********************************************************************************************************************************************************************************************************
	
	}

}
