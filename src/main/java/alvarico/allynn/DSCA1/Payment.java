package alvarico.allynn.DSCA1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
