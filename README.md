Babysitter Kata

To get started, Gradle 5.0 & Eclipse was used on Win 10 OS.

To test in command line:
gradle wrapper
./gradlew test

With this program. The User is a Babysitter that would like to check their nightly earnings.

There are 3 Families total (A, B, C) and the User works for only 1 Family per night.

Working Hours:     1700 hours to 0400 hours
NonWorking Hours:  0401 hours to 1659 hours

The Families consist of:

Family A: 
	Hours & Rates:
		$15.00 | 1700hrs to 2300hrs
		$20.00 | 2300hrs to 0400hrs

Family B:
	Hours & Rates:
		$12.00 | 1700hrs to 2200hrs
		$8.00  | 2200hrs to 000hrs
		$16.00 | 0000hrs to 0400hrs

Family C:
	Hours & Rates:
		$21.00 | 1700hrs to 2100hrs
		$15.00 | 2100hrs to 0400hrs

Test Driven Development was utilized to help create and understand how the Hours, Families, and pay rates would work out.


The way this program was written was so the User would be asked if they worked with a simple Y or N that is not case sensitive. Anything other than an accepted "Y" will cause the program to repeat itself asking the User if work was completed that night.

Once the User enters "Y", the User will be prompted with which Family was worked for. Anything other an A, B, or C will keep asking the User to enter in the correct Family that was worked for. Once a Family is picked then it will also trigger that families pay rate as well.

Once answered, User will be asked to enter in a start time and then an end time.

The hours are then added together startTime + endTime and then divided by 180 (It was a really odd number to divide 24H time with but 1700 and 0400 gives 11.) to create "hours".

Once hours are collected then during the final statement. The Used is told that the User had worked for Family X and worked a total number of X hours earning a total of X wages for that night.

