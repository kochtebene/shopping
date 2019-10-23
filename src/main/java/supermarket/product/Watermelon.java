package supermarket.product;

import java.math.BigDecimal;


public class Watermelon extends Product {

	public Watermelon() {
		super("Watermelon", new BigDecimal(0.80).setScale(2,BigDecimal.ROUND_HALF_UP));
	}

}
