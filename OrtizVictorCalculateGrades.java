/**
@Title:		OrtizVictorCalculateGrades
@Purpose:	To practice java loop and conditional statements.
@Author:    Ortiz, Victor
@Date:   	10/7/2014
@Version:	1.0
*/

import java.util.Scanner;

public class OrtizVictorCalculateGrades
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		char killSwitch = '0';

		do
		{
		System.out.print("Please enter five assignment grades: ");

		int assignment1 = keyboard.nextInt();
		int assignment2 = keyboard.nextInt();
		int assignment3 = keyboard.nextInt();
		int assignment4 = keyboard.nextInt();
		int assignment5 = keyboard.nextInt();

		if (assignment1 < assignment2 && assignment1 < assignment3 && assignment1 < assignment4 && assignment1 < assignment5)
			assignment1 = 0;
		else if (assignment2 < assignment3 && assignment2 < assignment4 && assignment2 < assignment5)
			assignment2 = 0;
		else if (assignment3 < assignment4 && assignment3 < assignment5)
			assignment3 = 0;
		else if (assignment4 < assignment5)
			assignment4 = 0;
		else
			assignment5 = 0;

		double assignmentAverage = (assignment1 + assignment2 + assignment3 + assignment4 + assignment5) / 4.0;
		System.out.println("After the lowest grade is dropped, your assignment average is : " + assignmentAverage);

		System.out.print("Please enter 2 exam grades: ");
		int exam1 = keyboard.nextInt();
		int exam2 = keyboard.nextInt();

		System.out.print("Please enter the lab grade: ");
		int lab1 = keyboard.nextInt();

		System.out.print("Please enter the grade of your final exam: ");
		int finalExam1 = keyboard.nextInt();
		System.out.println();

		double finalGrade = assignmentAverage * 0.20 + exam1 * 0.15 + exam2 * 0.20 + lab1 * .20 + finalExam1 * 0.25;

		System.out.println("The weighted average is :");
		System.out.println(assignmentAverage + " * 20% + " + exam1 + " * 15% + " + exam2 + " * 20% + " + lab1 + " * 20% + " + finalExam1 + " * 25% = " + finalGrade);

		char letterGrade = '0';

		if (finalGrade >= 90)
			letterGrade = 'A';
		else if (finalGrade >=	80)
			letterGrade = 'B';
		else if (finalGrade >=	70)
			letterGrade = 'C';
		else if (finalGrade >=	60)
			letterGrade = 'D';
		else if (finalGrade < 60)
			letterGrade = 'F';

		System.out.println("You will receive a " + letterGrade + "\n");

		System.out.println("Do you want to calculate for another student?  Please type Y for yes and N for no.");
		String killSwitchHolder = keyboard.next();
		killSwitch = killSwitchHolder.charAt(0);

		} while(killSwitch == 'Y' || killSwitch == 'y');

		System.out.println("Bye, bye!");

	}
}
