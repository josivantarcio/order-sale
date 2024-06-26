# Order Management System

This is a simple order management system written in Java. It allows for the registration of clients, products, and orders, as well as generating a detailed order summary.

## Project Structure

The project is divided into different packages and classes, each responsible for a specific part of the system:

### Packages and Classes

- `entities`
  - `Client`: Represents a client with name, email, and birth date.
  - `Order`: Represents an order, with date, status, and items.
  - `OrderItem`: Represents an order item, containing a product and quantity.
  - `Product`: Represents a product with name and price.
  
- `entities.enums`
  - `OrderStatus`: Enumeration that defines the possible statuses of an order (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED).
  
- `application`
  - `Program`: Main class containing the `main` method, responsible for running the program.

## Features

- Client Registration
- Order Registration
- Adding Items to Order
- Generating Order Summary

## How to Run

1. Clone the repository:

   ```sh
   git clone https://github.com/josivantarcio/order-sale
   ```

2. Navigate to the project directory:

   ```sh
   cd your-repository
   ```

3. Compile the Java classes:

   ```sh
   javac application/Program.java
   ```

4. Run the program:

   ```sh
   java application.Program
   ```

## Usage Example

When running the program, you will be prompted to enter the client's data, such as name, email, and birth date. Then, you can register an order and add items to it. Finally, an order summary will be generated, displaying the client's details, order items, and the total amount.

### Example Output

```
Enter Client Data:
Name: John Doe
Email: john@example.com
Birth date (DD/MM/YYYY): 15/04/1985

Enter order data:
Status: PROCESSING
How many items to this order? 2
Enter #1 item data
Product name: Laptop
Product price: 1200.00
Quantity: 1

Enter #2 item data
Product name: Mouse
Product price: 50.00
Quantity: 2

ORDER SUMMARY:
Order moment: 25/06/2024 14:45:30
Status: PROCESSING
Name: John Doe, Birth Date: 15/04/1985, Email: john@example.com
Name: Laptop, Price: 1200.00, Quantity: 1, Subtotal: 1200.00
Name: Mouse, Price: 50.00, Quantity: 2, Subtotal: 100.00
Total: 1300.00
```

## Guidance

This project was developed with guidance from [Professor Nelio Alves](https://github.com/acenelio) as part of the "Object-Oriented Programming and Object Composition in Java" course.

## Contributions

Contributions are welcome! Feel free to open issues and pull requests.

## License

This project is licensed under the [MIT License](LICENSE).
