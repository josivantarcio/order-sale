package entities;

public class OrderItem {

	private int quantity;
	private Product product;

	public OrderItem() {
	}

	public OrderItem(int quantity, Product product) {
		this.quantity = quantity;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return quantity * product.getPrice();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product);
		sb.append(", Quantity: ").append(quantity);
		sb.append(", Subtotal: ").append(String.format("%.2f", subTotal()));
		return sb.toString();
	}
}
