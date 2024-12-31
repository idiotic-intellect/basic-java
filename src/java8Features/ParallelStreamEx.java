package java8Features;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ParallelStreamEx {

	static Supplier<List<Integer>> ss = () -> {
		List<Integer> tl = new ArrayList<>();
		for (int i = 1; i <= 1000000; i++) {
			tl.add(i);
		}
		return tl;
	};
	
	static Predicate<Integer> ip = a -> a%2==0;
	
	public static List<Integer> sequenceStream() {
		return ss.get().stream().filter(ip).collect(Collectors.toList());
	}
	
	public static List<Integer> parallelStream() {
		return ss.get().parallelStream().filter(ip).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		Instant insTime = Instant.now();
		List<Integer> sl = sequenceStream();
		Instant outsTime = Instant.now();
		System.out.println("Sequence Stream - " + Duration.between(insTime, outsTime).toMillis());
		Instant inpTime = Instant.now();
		List<Integer> pl = parallelStream();
		Instant outpTime = Instant.now();
		System.out.println("Paralle Stream - " + Duration.between(inpTime, outpTime).toMillis());
	}

}
