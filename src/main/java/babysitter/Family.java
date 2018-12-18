package babysitter;

public class Family {
	private String familyName;
	private int payRate;
	private int hours;

	public Family(String familyName, int payRate, int hours) {
		this.familyName = familyName;
		this.payRate = payRate;
		this.hours = hours;
	}

	public String getFamilyName(String letter) {
		if (letter == "A" || letter == "B" || letter == "C");
		return familyName;
	}

	public int getPayRate() {
		return payRate;
	}

	public int getFamilyHours() {
		return hours;
	}
}