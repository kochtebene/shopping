package supermarket.shopping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import supermarket.product.Product;

public class Basket {

	private List<Product> products = new ArrayList<Product>();
	private BigDecimal price =  BigDecimal.ZERO;
	
	public void addProduct(Product product) {
		if(product != null){
			getProducts().add(product);
		}
	}

	public List<Product> getProducts() {
		return products;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
