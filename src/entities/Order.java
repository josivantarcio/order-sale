package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

	private LocalDateTime moment;
	private OrderStatus status;

	private List<OrderItem> items = new ArrayList<>();

	public Order(OrderStatus status) {

		this.moment = LocalDateTime.now(); // date and time in the moment of instance
		this.status = status;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {

		double sum = 0;
		for (OrderItem o : items) {
			sum += o.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ").append(moment.format(dtf)).append("\n");
		sb.append("Status: ").append(status).append("\n");
		for (OrderItem item : items) {
			sb.append(item).append("\n");
		}
		sb.append("Total: ").append(String.format("%.2f", total()));
		return sb.toString();
	}

}
