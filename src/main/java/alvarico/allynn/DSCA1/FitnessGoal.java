package alvarico.allynn.DSCA1;

public class FitnessGoal {
	
	private int id;
	
	private int code;
	
	private String description;
	
	public FitnessGoal() {}
	
	public FitnessGoal(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
}
