package ecommerce.com;
import java.util.Date;
import java.util.List;
public class Order implements OrderActions {


	//public class Order implements OrderActions {
	    private int orderId;
	    private int customerId;
	    private Date orderDate;
	    private String orderStatus;
	    private List<Product> orderedProducts;

	    public Order(int orderId, int customerId, Date orderDate, String orderStatus, List<Product> orderedProducts) {
	        this.orderId = orderId;
	        this.customerId = customerId;
	        this.orderDate = orderDate;
	        this.orderStatus = orderStatus;
	        this.orderedProducts = orderedProducts;
	    }

	    public int getOrderId() {
	        return orderId;
	    }

	    public int getCustomerId() {
	        return customerId;
	    }

	    public Date getOrderDate() {
	        return orderDate;
	    }

	    public String getOrderStatus() {
	        return orderStatus;
	    }

	    public void setOrderStatus(String orderStatus) {
	        this.orderStatus = orderStatus;
	    }

	    public List<Product> getOrderedProducts() {
	        return orderedProducts;
	    }

	    public String getOrderDetails() {
	        return "Order ID: " + orderId + ", Customer ID: " + customerId + ", Order Date: " + orderDate + ", Order Status: " + orderStatus;
	    }

	    @Override
	    public void placeOrder() {
	        System.out.println("Order placed: " + getOrderDetails());
	    }

	    @Override
	    public void cancelOrder() {
	        setOrderStatus("Cancelled");
	        System.out.println("Order cancelled: " + getOrderDetails());
	    }

	    @Override
	    public void trackOrder() {
	        System.out.println("Tracking Order: " + getOrderDetails());
	    }
	}



