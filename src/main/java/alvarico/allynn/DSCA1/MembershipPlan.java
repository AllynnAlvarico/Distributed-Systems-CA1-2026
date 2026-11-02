package alvarico.allynn.DSCA1;

public class MembershipPlan {
	
	private int id;
	
	private String description;
	
	private double cost;
	
	public MembershipPlan() {}
	
	public MembershipPlan(String description) {
		this.description = description;
		this.cost = 0.0;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public double getCost() {
		return cost;
	}
	
}
