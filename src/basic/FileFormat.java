package basic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileFormat {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		 StringBuilder sb = new StringBuilder();
	        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\M1046874\\Downloads\\check\\ru.json"), "UTF8"))) {

	            String sCurrentLine;

	            while ((sCurrentLine = br.readLine()) != null) {
	                System.out.println(sCurrentLine);
	                sb.append(sCurrentLine);
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        System.out.println( sb.toString());
	}

}
