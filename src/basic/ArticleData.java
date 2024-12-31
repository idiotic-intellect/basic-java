package basic;

import java.util.List;

public class ArticleData {

	String productId;
	List articles;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public List getArticles() {
		return articles;
	}
	public void setArticles(List articles) {
		this.articles = articles;
	}
	@Override
	public String toString() {
		return "{ productId: \"" + productId + "\", articles: " + articles + " }";
	}
	
}
