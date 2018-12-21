package babysitter;

import java.util.Scanner;

public class BabysitterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String decision = input.nextLine();
		while (!decision.equalsIgnoreCase("Yes")) {

			System.out.println("\t\tThis is my version of the Babysitter Kata.");
			System.out.println("\t\t\tThank You for your time.\n");

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
			String dayDecision = input.nextLine();
			if (dayDecision.equalsIgnoreCase("Y")) { // Start of Sunday Decision
				System.out.println("\nChoose a Family: A, B, C");
				String familyName = input.next();
				if (familyName.equalsIgnoreCase("A") || familyName.equalsIgnoreCase("B")
						|| familyName.equalsIgnoreCase("C")) {

				} else if (!familyName.equalsIgnoreCase("A") || !familyName.equalsIgnoreCase("B")
						|| !familyName.equalsIgnoreCase("C")) {
					System.out.println("Enter in the the correct Family Letter: A, B, C");
				}

				System.out.println("\nEnter Start Time:");
				int startTime = input.nextInt();
				if (!(startTime >= 1700 && startTime <= 2359 && startTime >= 0000 && startTime <= 0400)) {
				} else {
					System.out.println("Please Enter a Working Hour and not a Non-Working Hour.");
				}

				System.out.println("\nEnter End Time: ");
				int endTime = input.nextInt();
				if (endTime >= 1700 && endTime <= 2359 && endTime >= 0000 && endTime <= 0400) {
				} else {
					System.out.println("Please Enter a Working Hour and not a Non-Working Hour.\n");
				}

				System.out.println(
						"\nYou work for a total of " + "hour's tonight and made a total of $" + " tonight.\n\n");
				System.out.println("Would you like to Continue?");
				System.out.println("Y or N");

			} else if (!dayDecision.equalsIgnoreCase("Y")) {
				System.out.println("Maybe Next Time...\n");
			} else {
				System.out.println("Would you like to exit this program?");
				System.out.println("Enter Yes or No");
				if (decision.equalsIgnoreCase("Yes\n")) {
					System.out.println("Program Terminated...\n");
				} else {
					System.out.println("What would you like to do now?\n");
				}
			}
		}
		input.close();
	}
}
