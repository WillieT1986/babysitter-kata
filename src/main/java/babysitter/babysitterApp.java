package babysitter;

public class BabysitterApp {

	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);

		System.out.println("Intro to this program goes here.\n");

		System.out.println("This is a 24 hour clock time. 1300 to 0000 is 1pm to 12am.");
		System.out.println("To make it easier, if you subtract 12 from 1300 you get 1pm.\n");
		System.out.println("Working Hours:     1700hrs to 0400hrs");
		System.out.println("Non-Working Hours: 0401hrs to 1659hrs\n");

		System.out.println("Pay Rates Per Family");
		System.out.println("Family A: $15.00 - 1700hrs to 2300hrs | $20.00 - 2300hrs to 0400hrs");
		System.out.println(
				"Family B: $12.00 - 1700hrs to 2200hrs | $8.00  - 2200hrs to 0000hrs | $16.00 - 0000hrs to 0400hrs");
		System.out.println("Family C: $21.00 - 1700hrs to 2100hrs | $15.00 - 2100hrs to 0400hrs\n");

		System.out.println("Did you work on this week? Y or N");

	}
}
