package ecommerce.com;
import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
	

	//public class Customer extends User {
	    private List<Product> cart;

	    public Customer(int userId, String username, String password, String email) {
	        super(userId, username, password, email);
	        this.cart = new ArrayList<>();
	    }

	    public void addToCart(Product product) {
	        cart.add(product);
	        System.out.println(product.getProductName() + " added to cart.");
	    }

	    public void removeFromCart(Product product) {
	        cart.remove(product);
	        System.out.println(product.getProductName() + " removed from cart.");
	    }

	    public void checkout() {
	        if (cart.isEmpty()) {
	            System.out.println("Cart is empty.");
	        } else {
	            System.out.println("Checkout complete.");
	            cart.clear();
	        }
	    }

	    @Override
	    public void viewProfile() {
	        System.out.println("Customer Profile: " + getUsername() + ", Email: " + getEmail());
	    }

	    @Override
	    public void updateProfile(String email, String username) {
	        setEmail(email);
	        setUsername(username);
	        System.out.println("Profile updated: " + getUsername() + ", Email: " + getEmail());
	    }
	}

	 class Admin extends User {
	    public Admin(int userId, String username, String password, String email) {
	        super(userId, username, password, email);
	    }

	    public void addProduct(Product product) {
	        // Implementation to add product to the inventory
	        System.out.println(product.getProductName() + " added to inventory.");
	    }

	    public void removeProduct(Product product) {
	        // Implementation to remove product from the inventory
	        System.out.println(product.getProductName() + " removed from inventory.");
	    }

	    public void updateProduct(Product product) {
	        // Implementation to update product in the inventory
	        System.out.println(product.getProductName() + " updated in inventory.");
	    }

	    @Override
	    public void viewProfile() {
	        System.out.println("Admin Profile: " + getUsername() + ", Email: " + getEmail());
	    }

	    @Override
	    public void updateProfile(String email, String username) {
	        setEmail(email);
	        setUsername(username);
	        System.out.println("Profile updated: " + getUsername() + ", Email: " + getEmail());
	    }
	}



