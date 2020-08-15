
public class payment {
	private double amount;
	private double change;
	
	public payment(double amount, double change) {
		this.amount = amount;
		this.change = change;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	
	public String toString() {
		return String.format("Amount: %-20lf \n Change: %-20ls \n", amount, change);
	}
	
}
