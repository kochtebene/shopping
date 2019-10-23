package supermarket.shopping;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

import supermarket.exception.NotValidBasketException;
import supermarket.offer.*;
import supermarket.product.Product;
import supermarket.product.ProductFactory;

public class Shopping {

	
	
	public static void main(String[] args) throws NotValidBasketException {
		Shopping shopping = new Shopping();
		Basket basket = shopping.constructBasket(args);
		shopping.calculateTolalPrice(basket);
		System.out.println("price "+basket.getPrice());
	}

	public void calculateTolalPrice(Basket basket) throws NotValidBasketException {
		if(basket == null) throw new NotValidBasketException("null basket");
		//if product has offer in offers we apply it 
		basket.getProducts().stream().forEach(product -> {
										Consumer<Product> offer = Offers.getOffer(product.getName());
										if(offer != null){
											offer.accept(product);
										} else {
											product.setTotalPrice(product.getPrice().multiply(new BigDecimal(product.getQuantity())));
									    }
										basket.setPrice( basket.getPrice().add(product.getTotalPrice()));
										                 });
										
		
	}

	public Basket constructBasket(String[] args) {
		//format of arg : productCode concatenated to the number example A3 ==> 3 apples 
		Basket basket = new Basket();
		Stream<String> argsStream = Arrays.stream(args);
		ProductFactory productFactory = new ProductFactory();
		
		argsStream.forEach(arg -> {
			String productCode = arg.substring(0, 1);
			int quantity = Integer.parseInt(arg.substring(1));
			Product product = productFactory.getProduct(productCode);
			product.setQuantity(quantity);
			basket.addProduct(product);
								  });
		return basket;
		
	}

}
