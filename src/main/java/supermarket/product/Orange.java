package supermarket.product;

import java.math.BigDecimal;


public class Orange extends Product {

	public Orange() {
		super("Orange", new BigDecimal(0.50).setScale(2,BigDecimal.ROUND_HALF_UP));
	}

}
