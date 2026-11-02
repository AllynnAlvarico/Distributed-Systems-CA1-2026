package alvarico.allynn.DSCA1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MembershipPlan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String description;
	
	private double cost;
	
	public MembershipPlan() {}
	
	public MembershipPlan(String description, double cost) {
		this.description = description;
		this.cost = cost;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public int getId() {
		return this.id;
	}

	public String getDescription() {
		return description;
	}

	public double getCost() {
		return cost;
	}
	
}
