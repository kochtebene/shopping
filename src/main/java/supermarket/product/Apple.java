package supermarket.product;

import java.math.BigDecimal;


public class Apple extends Product {

	
	public Apple() {
		super("Apple", new BigDecimal(0.20).setScale(2,BigDecimal.ROUND_HALF_UP));
	}

}
