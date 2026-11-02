package alvarico.allynn.DSCA1;

public class Member {
	
	private int id;
	
	private String membershipId;
	
	private String name;
	
	private String phoneNumber;
	
	private String address;
	
	private FitnessGoal fg;
	
	private MembershipPlan mp;
	
	private Payment payment;
	
	public Member() {}

	public Member(String membershipId, String name, String phoneNumber, String address, FitnessGoal fg, MembershipPlan mp, Payment payment) {
		this.membershipId = membershipId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.fg = fg;
		this.mp = mp;
		this.payment = payment;
	}
	
	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}
	
	public void setName(String name, String surname) {
		this.name = name + " " + surname;
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
	
	public void setPayment(Payment payment) {
		this.payment = payment;
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

	public MembershipPlan getMp() {
		return this.mp;
	}
	
}
