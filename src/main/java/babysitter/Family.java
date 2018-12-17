package babysitter;

public class Family {
	private String familyName;
	private int payRate;

	public Family(String familyName, int payRate) {
		this.familyName = familyName;
		this.payRate = payRate;
	}

	public String getFamilyName() {
		return familyName;
	}

	public int getPayRate() {
		return payRate;
	}

}
