package basic;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

public class EncodeBase64 {

	public static void main(String[] args) {
		String sample = "Create a harmonious, joyful space with Vivechrom Colour of the Year 2023"
				+ "^" +LocalDateTime.now().format(DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss.SSSSSSSSS"));
		String sample1 = "Create a harmonious, joyful space with Vivechrom Colour of the Year 2023"
				+ "^" +LocalDateTime.now().format(DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss.SSSSSSSSS"));
		String sample2 = "Create a harmonious, joyful space with Vivechrom Colour of the Year 2023"
				+ "^" +LocalDateTime.now().format(DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss.SSSSSSSSS"));
		
		MessageDigest msd = null;
		try {
			msd = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sampleres = Base64.getEncoder().encodeToString(msd.digest(sample.getBytes(StandardCharsets.UTF_8)));
		String sampleres1 = Base64.getEncoder().encodeToString(msd.digest(sample1.getBytes(StandardCharsets.UTF_8)));
		String sampleres2 = Base64.getEncoder().encodeToString(msd.digest(sample2.getBytes(StandardCharsets.UTF_8)));
		
		String samplecurr = Base64.getEncoder().encodeToString(sample.getBytes());
		String samplecurr1 = Base64.getEncoder().encodeToString(sample1.getBytes());
		String samplecurr2 = Base64.getEncoder().encodeToString(sample2.getBytes());
		
		System.out.println(sampleres);
		System.out.println(sampleres1);
		System.out.println(sampleres2);
		
		System.out.println(samplecurr);
		System.out.println(samplecurr1);
		System.out.println(samplecurr2);
		
	}

}
