package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.enums.OrderStatus;

public class Order {

	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

	private LocalDateTime moment;
	private OrderStatus status;

	private Client client;

	private List<OrderItem> items = new ArrayList<>();

	public Order(OrderStatus status) {

		this.moment = LocalDateTime.now(); // date and time in the moment of instance
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
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

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {

		return items.stream().collect(Collectors.summingDouble(OrderItem::subTotal));
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
