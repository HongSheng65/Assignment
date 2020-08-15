
public class transaction extends order {
	private String transactionID;
	public Payment payment;
	
	public transaction(String transactionID, Product product, double quantity, double subtotal) {
		super(Product.product, quantity, subtotal);
		this.transactionID = transactionID;
		
	}
	
	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	
	public transaction(String transactionID) {
		this.transactionID = transactionID;
	}
	
	public String toString() {
		return super.String.toString();
		return String.format("Transaction ID: %-10s \n Payment: %-20ls", transactionID, payment);
	}
	
}
