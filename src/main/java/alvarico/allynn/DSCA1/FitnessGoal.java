package alvarico.allynn.DSCA1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FitnessGoal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
