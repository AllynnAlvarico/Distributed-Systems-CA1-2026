package alvarico.allynn.DSCA1;

public class Payment {

	private int id;
	
	private String date;
	
	private double amount;
	
	public Payment() {}
	
	public Payment(String date, double amount) {
		this.date = date;
		this.amount = amount;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}
	
}
