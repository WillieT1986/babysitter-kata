package babysitter;

import java.util.Scanner;

public class BabysitterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// String decision = "";
		// while (!decision.equalsIgnoreCase("Yes")) {

		System.out.println("This is my version of the Babysitter Kata.");
		System.out.println("\tThank You for your time.\n");

		System.out.println("This is a 24 hour clock time. 1300 to 0000 is 1pm to 12am.");
		System.out.println("To make it easier, if you subtract 12 from 1300 you get 1pm.\n");
		System.out.println("Working Hours:     1700hrs to 0400hrs");
		System.out.println("Non-Working Hours: 0401hrs to 1659hrs\n\n");

		System.out.println("\t\t\tPay Rates Per Family");
		System.out.println("Family A: $15.00 - 1700hrs to 2300hrs | $20.00 - 2300hrs to 0400hrs");
		System.out.println(
				"Family B: $12.00 - 1700hrs to 2200hrs | $8.00  - 2200hrs to 0000hrs | $16.00 - 0000hrs to 0400hrs");
		System.out.println("Family C: $21.00 - 1700hrs to 2100hrs | $15.00 - 2100hrs to 0400hrs\n");

		System.out.println("Did you work on this week? Y or N");
		String weekDecision = input.nextLine();
		if (weekDecision.equalsIgnoreCase("Y")) {

		} else {
			weekDecision.equalsIgnoreCase("N");
		}

		// String dayDecision = input.nextLine();
		// System.out.println("Did you work on Sunday? ");
		// if (dayDecision.equalsIgnoreCase("Y")) {
		// System.out.println("Which Family did you work for: Family A, B, or C?");
		//
		// }

		// } // End of While Loop
		input.close();
	}
}
