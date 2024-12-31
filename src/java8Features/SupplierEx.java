package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "Sunny", "Bunny", "Chinny", "Vinny" };
		Supplier<String> s1 = () -> s[ (int)(Math.random() * 4 ) ];
		System.out.println(s1.get());
		System.out.println((int)(Math.random() * Math.pow(10, 6)));
		Random rnd = new Random();
		int number = rnd.nextInt(999999);
		String otp = String.format("%06d", number);
		System.out.println(otp);
		String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
		System.out.println(symbols.charAt((int)(Math.random()*28)));
		String symbols1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ~`!@#$%^&*()_-+={[}]|\\;:?/\"\'<,>.123456789abcdefghijklmnopqrstuvwxyz";
//		System.out.println(symbols1.length());
		System.out.println(symbols1.charAt((int)(Math.random()*92)));
		
		Supplier<String> ch = () -> "" + symbols1.charAt((int)(Math.random()*92));
		
		
		String otp1 = Arrays.asList(ch.get(), ch.get(), ch.get(), ch.get(), ch.get(), ch.get())
										.stream().reduce("", (part, val) -> part + val);
		System.out.println(otp1);
//		String otp2 = String.join("", (CharSequence) Arrays.asList(otpArr));
	}

}
