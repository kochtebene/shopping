package supermarket.product;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ProductFactory {

	
	final static Map<String, Supplier<Product>> map = new HashMap<>();
	  static {
	    map.put("A", Apple::new);
	    map.put("O", Orange::new);
	    map.put("W", Watermelon::new);
	  }   
	  public Product getProduct(String productCode){
	     Supplier<Product> product = map.get(productCode.toUpperCase());
	     if(product != null) {
	       return product.get();
	     }
	     throw new IllegalArgumentException("No such product " + productCode.toUpperCase());
	  }
}
