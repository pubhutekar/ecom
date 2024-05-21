package ecommerce.com;

public class Product {
	private int productId;
    private String productName;
    private double price;
    private int quantity;
    private String category;

    public Product(int productId, String productName, double price, int quantity, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be positive.");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
    }

    public String getCategory() {
        return category;
    }

    public String getProductDetails() {
        return "Product ID: " + productId + ", Name: " + productName + ", Price: $" + price + ", Quantity: " + quantity + ", Category: " + category;
    }
	

}
