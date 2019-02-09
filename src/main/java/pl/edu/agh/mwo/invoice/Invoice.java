package pl.edu.agh.mwo.invoice;

import java.math.BigDecimal;
import java.util.Collection;

import pl.edu.agh.mwo.invoice.product.Product;

public class Invoice {
	private Collection<Product> products;
	

	public void addProduct(Product product, Integer quantity) {
		for(int i=0; i<quantity; i++) {
			products.add(product);
		}
	}

	public void addProduct(Product product) {
		this.addProduct(product, 1);
	}
	
	
	public BigDecimal getTotalNetPrice() {
		BigDecimal subtotal = BigDecimal.ZERO;
		for (Product product : this.products) {
			subtotal.add(product.getPrice());
		}
		return subtotal;
	}

	public BigDecimal getTax() {
		return null;
	}

	public BigDecimal getTotal() {
		return null;
	}
}
