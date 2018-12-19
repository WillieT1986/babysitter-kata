package babysitter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Family {
	private String familyName;
	private int payRate;
	private int hours;

	public Map<String, Family> families = new HashMap<>();

	public Collection<Family> familiyLetters() {
		return families.values();
	}

	public Family(String familyName) {
		this.familyName = familyName;
	}

	public Family(String familyName, int payRate, int hours) {
		this.familyName = familyName;
		this.payRate = payRate;
		this.hours = hours;
	}

	public String getFamilyName(String letter) {
		if (letter == "A" || letter == "B" || letter == "C") {
			return familyName;
		} else {
			return "Try Again";
		}
	}

	public int getPayRate() {
		return payRate;
	}

	public int getFamilyHours() {
		return hours;
	}

	@Override
	public String toString() {
		return familyName;
	}

}