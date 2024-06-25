package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf_date = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		/* Cadastro de Cliente */

		System.out.println("Enter Cliente Data:");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.next();

		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birth = LocalDate.parse(sc.next(), dtf_date);

		Client client = new Client(name, email, birth);

		/* Cadastro de Pedido */

		System.out.println();
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.next();
		Order order = new Order(OrderStatus.valueOf(status));
		OrderItem item = null;

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();

		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data");
			System.out.print("Product name: ");
			String prodName = sc.nextLine();

			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();

			System.out.print("Quantity: ");
			int prodQuant = sc.nextInt();

			item = new OrderItem(prodQuant, new Product(prodName, prodPrice));
			order.addItem(item);

			System.out.println();
			sc.nextLine();
		}

		/* Summary */

		System.out.println("ORDER SUMMARY:");
		System.out.println("Client: " + client);
		System.out.println(order);

		sc.close();
	}

}
