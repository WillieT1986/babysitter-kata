package babysitter;

import java.util.Scanner;

public class BabysitterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Family families = new Family("", 0, 0);

		Family familyA = new Family("A", 15, 0);
		Family familyB = new Family("B", 8, 0);
		Family familyC = new Family("C", 21, 0);

		families.add(familyA);
		families.add(familyB);
		families.add(familyC);

		String decision = ("");
		while (!decision.equalsIgnoreCase("Yes")) {

			System.out.println("\t\t\tBabysitter Kata.");
			System.out.println("\t\tThank You for your time.\n");

			System.out.println("This is a 24 hour clock time. 1300 to 0000 is 1pm to 12am.");
			System.out.println("To make it easier, if you subtract 12 from 1300 you get 1pm.\n");
			System.out.println("Working Hours:     1700hrs to 0400hrs");
			System.out.println("Non-Working Hours: 0401hrs to 1659hrs\n\n");

			System.out.println("\t\t\tPay Rates Per Family");
			System.out.println("Family A: $15.00 - 1700hrs to 2300hrs | $20.00 - 2300hrs to 0400hrs");
			System.out.println(
					"Family B: $12.00 - 1700hrs to 2200hrs | $8.00  - 2200hrs to 0000hrs | $16.00 - 0000hrs to 0400hrs");
			System.out.println("Family C: $21.00 - 1700hrs to 2100hrs | $15.00 - 2100hrs to 0400hrs\n");

			System.out.println("Did you work Tonight? Y or N");
			String optionEntered = input.nextLine();
			if (optionEntered.equalsIgnoreCase("Y")) { // Start of Sunday Decision
				System.out.println("\nChoose a Family: A, B, C");
				String familyName = input.next();
				int payRate = -1;
				if (familyName.equalsIgnoreCase("A") || familyName.equalsIgnoreCase("B")
						|| familyName.equalsIgnoreCase("C")) {
					switch (familyName) {
					case "A":
						payRate = 15;
						break;
					case "B":
						payRate = 8;
						break;
					case "C":
						payRate = 21;
					}
				} else if (!familyName.equalsIgnoreCase("A") || !familyName.equalsIgnoreCase("B")
						|| !familyName.equalsIgnoreCase("C")) {
					System.out.println("Enter in the the correct Family Letter: A, B, C");
				}

				System.out.println("\nEnter Start Time:");
				int startTime = input.nextInt();
				if (startTime >= 1700 && startTime <= 2359 && startTime >= 0000 && startTime <= 0400) {
				} else {
					System.out.println("Please Enter a Working Hour and not a Non-Working Hour.");
					input.nextInt();
				}

				System.out.println("\nEnter End Time: ");
				int endTime = input.nextInt();
				if (endTime >= 1700 && endTime <= 2359 && endTime >= 0000 && endTime <= 0400) {

				} else {
					System.out.println("Please Enter a Working Hour and not a Non-Working Hour.\n");
					input.nextInt();
				}

				int hours = ((startTime + endTime) / 180);

				System.out.println("\nYou worked for family " + familyName + " for a total of " + hours
						+ " hour's tonight and made a total of $" + hours * payRate + " tonight.\n\n");

			} else if (optionEntered.equalsIgnoreCase("N")) {
				System.out.println("Maybe Next Time...\n\n\n\n");
			}

		}
		input.close();
	}
}