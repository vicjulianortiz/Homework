import java.lang.*;
import java.util.Scanner;

public class CalcTime{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		char loopSwitch = 'Y';

		while(loopSwitch == 'Y' || loopSwitch == 'y'){
			System.out.println("Enter an angle: ");

			double angle = sc.nextDouble();
			double timeStart = System.nanoTime();
			double arctan = Math.atan(Math.toRadians(angle));

			double timeEnd = System.nanoTime();
			double timeTotal = timeEnd - timeStart;

			System.out.println("Arctan: " + arctan);
			System.out.println("Time to calculate in nanoseconds: " + timeTotal);
			System.out.println("Want to enter another angle? (Y/N)");
			loopSwitch = sc.next().charAt(0);
		}
	}
}