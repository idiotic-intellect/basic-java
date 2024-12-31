package basic;

import java.util.List;

public class ArticleColor {

	String colorId;
	List articles;
	public String getColorId() {
		return colorId;
	}
	public void setColorId(String colorId) {
		this.colorId = colorId;
	}
	public List getArticles() {
		return articles;
	}
	public void setArticles(List articles) {
		this.articles = articles;
	}
	@Override
	public String toString() {
		return "{ colorId: \"" + colorId + "\", articles: " + articles + " }";
	}
	
	
}
