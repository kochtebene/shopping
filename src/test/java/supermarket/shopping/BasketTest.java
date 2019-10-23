package supermarket.shopping;

import org.junit.Test;
import static junit.framework.Assert.*;
import supermarket.product.Apple;


public class BasketTest {


	@Test
	public void testGetProducts() {

		Basket basket = new Basket();
		basket.addProduct(new Apple());
		basket.addProduct(null);
		assertEquals(basket.getProducts().size(), 1);
	}

}
