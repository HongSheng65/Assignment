
public class order {
	private String orderID;
	public Product productName;
	public Product productPrice;
	public Product productCat;
	private double quantity;
	private double subtotal;
	
	public order(String orderID, double quantity, double subtotal) {
		this.orderID = orderID;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}
	
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	public String toString() {
		return String.format("Order ID: %-7s \nProduct Name: %-20s \n Product Price: %-15lf \n Product Category: %-10s \n Quantity: %-15lf \n SubTotal: %-20lf", orderID, productName, productPrice, productCat, quantity, subtotal);
	}
	
	
	
}
