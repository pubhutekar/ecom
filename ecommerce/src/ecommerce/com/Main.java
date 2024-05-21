package ecommerce.com;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
        // Create some products
        Product product1 = new Product(1, "Laptop", 999.99, 10, "Electronics");
        Product product2 = new Product(2, "Smartphone", 499.99, 20, "Electronics");

        // Create a customer
        Customer customer = new Customer(1, "Pradumn", "password123", "Pradumn@gmail.com");

        // Customer adds products to cart
        customer.addToCart(product1);
        customer.addToCart(product2);

        // Customer views profile
        customer.viewProfile();

        // Customer updates profile
        customer.updateProfile("sagar@gmail.com", "sagar_updated");

        // Customer checks out
        customer.checkout();

        // Create an admin
        Admin admin = new Admin(2, "admin", "adminpass", "admin@example.com");

        // Admin adds a product
        admin.addProduct(product1);

        // Admin removes a product
        admin.removeProduct(product2);

        // Admin updates a product
        admin.updateProduct(product1);

        // Admin views profile
        admin.viewProfile();

        // Admin updates profile
        admin.updateProfile("admin_new@gmail.com", "admin_updated");

        // Create an order
        List<Product> orderedProducts = new ArrayList<>();
        orderedProducts.add(product1);
        Order order = new Order(1, customer.getUserId(), new Date(), "Processing", orderedProducts);

        // Place the order
        order.placeOrder();

        // Track the order
        order.trackOrder();

        // Cancel the order
        order.cancelOrder();
    }
}
