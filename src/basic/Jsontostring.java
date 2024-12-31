package basic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Jsontostring {

	public static void main(String[] args) throws Exception {
		String unprettyJSON = null;

		try {
		    unprettyJSON = Files.readAllLines(Paths
		    		.get("D:\\Akzo\\docs\\Roadmap_2022\\questionare\\expert\\eseexp-sv.json"))
		                        .stream()
		                        .map(String::trim)
		                        .reduce(String::concat)
		                        .orElseThrow(FileNotFoundException::new);
		} catch (IOException e) {
		    e.printStackTrace();
		}
		System.out.println(unprettyJSON);
	}

}
