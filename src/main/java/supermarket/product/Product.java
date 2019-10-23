package supermarket.product;

import java.math.BigDecimal;


public class Product {

	private String name;
	private BigDecimal price;
	private int quantity;
	private BigDecimal totalPrice;
	
	
	public Product(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	
}
