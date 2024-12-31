package basic;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.Scanner;

import javax.imageio.ImageIO;

public class Base64Filepathtoimage {

	public static void main(String[] args) {
		String path = "D:\\check\\Base64Filepathtoimage\\Systemmaling av hus.txt";
		try {
			 System.out.println(btoi(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static String btoi(String inputFilePath) throws IOException {
		File file = new File(inputFilePath);
		String basePath = inputFilePath.substring(0, inputFilePath.lastIndexOf(".")+1);
		Scanner sc = new Scanner(file);

		sc.useDelimiter("\\Z");

		String bi1 = sc.next();
		
		String extension = bi1.split("/")[1].split(";")[0];
		String data = bi1.split(",")[1];
		byte[] image = Base64.getDecoder().decode(data);
		ByteArrayInputStream bis = new ByteArrayInputStream(image);
        BufferedImage bImage2 = ImageIO.read(bis);
        ImageIO.write(bImage2, extension, new File(basePath + extension));
		sc.close();
		return "Image Created Successfully";
	}

}
