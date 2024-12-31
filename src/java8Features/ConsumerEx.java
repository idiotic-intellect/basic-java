package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		List<Movie> ml = new ArrayList<>();
		ml.add(new Movie("Thuppakki", "Vijay", "Kajal"));
		ml.add(new Movie("Kaththi", "Vijay", "Samantha"));
		ml.add(new Movie("Sarkar", "Vijay", "KS"));
		
		Consumer<Movie> c = m -> System.out.println("First function: " + m);
		Consumer<Movie> c1 = m -> System.out.println("Second function: " + m);
		for(Movie m: ml) {
			c.andThen(c1).accept(m);
		}

	}

}

class Movie {
	
	private String name;
	private String honame;
	private String hename;
	
	public Movie(String name, String hename, String honame) {
		super();
		this.name = name;
		this.honame = honame;
		this.hename = hename;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHoname() {
		return honame;
	}
	public void setHoname(String honame) {
		this.honame = honame;
	}
	public String getHename() {
		return hename;
	}
	public void setHename(String hename) {
		this.hename = hename;
	}

	@Override
	public String toString() {
		return name + " : " + hename + " : " + honame;
	}
	
	
	
}
