package alvarico.allynn.DSCA1;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Member {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String membershipId;
	
	private String name;
	
	private String phoneNumber;
	
	private String address;
	
	@ManyToOne
	private FitnessGoal fg;
	
	@OneToOne
	private MembershipPlan mp;
	
	@OneToMany
	private List<Payment> payments = new ArrayList<>();
	
	public Member() {}

	public Member(String membershipId, String name, String phoneNumber, String address, FitnessGoal fg, MembershipPlan mp) {
		this.membershipId = membershipId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.fg = fg;
		this.mp = mp;
	}
	
	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setFitnessGoal(FitnessGoal fg) {
		this.fg = fg;
	}
	
	public void setMembershipPlan(MembershipPlan mp) {
		this.mp = mp;
	}
	
	public void addPayment(Payment payment) {
		this.payments.add(payment);
	}
	
	public int getId() {
		return this.id;
	}

	public String getMembershipId() {
		return this.membershipId;
	}

	public String getName() {
		return this.name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public String getAddress() {
		return this.address;
	}

	public FitnessGoal getFitnessGoal() {
		return this.fg;
	}

	public MembershipPlan getMembershipPlan() {
		return this.mp;
	}
	
	public List<Payment> getPayments(){
		return this.payments;
	}
}
