/*******************************************************************
@Title:		ReservationDemo
@Purpose:	To verify the edit, compile, execute function in Textpad
@Author:    Ortiz, Victor
@Date:   	12/2/2017
@Version:	1.0
********************************************************************/


import java.util.Scanner;

public class ReservationDemo
{
	public static void main(String[] args)
	{
		int killSwitch = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Input the following information for your reservation. Please key in 'Enter' after every input.\n1)Name \n2)ID\n3)Flight number\n4)Preferred row (1-21)\n5)Preferred row (A-D)\n");
		Reservation r1 = new Reservation(sc.next(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0));

		do
		{
			if(r1.checkSeatAvailability() == true)
			{
				System.out.println("\nReservation successful\n" + r1);
				System.out.println("Do you wish to enter another reservation? (Enter Y or N)");
				char refCheck = sc.next().charAt(0);
				if(refCheck == 'N' || refCheck == 'n')
				{
					killSwitch = 1;
				}
				else
				{
					System.out.println();
					killSwitch = 2;
				}
			}
			else if(r1.checkSeatAvailability() == false)
			{
				System.out.println("The seat is not available, do you want to continue to reserve an available seat?(Enter Y or N)");

				char refCheck = sc.next().charAt(0);
				if(refCheck == 'N' || refCheck == 'n')
					killSwitch = 1;
				else
					System.out.println();
			}

			while(killSwitch == 2)
			{
				System.out.println("Input the following information for your next reservation. Please key in 'Enter' after every input.\n1)ID\n2)Preferred row (1-21)\n3)Preferred row (A-D)\n");
				int guestID = sc.nextInt();
				int guestRow = sc.nextInt();
				char guestSeat = sc.next().charAt(0);

				r1.setRow(guestRow);
				r1.setSeat(guestSeat);
				r1.setID(guestID);

				if(r1.checkSeatAvailability() == true)
					System.out.println("Reservation Successful\n" + r1);
				else if(r1.checkSeatAvailability() == false)
				{
					System.out.println("The seat is not available.");
				}

				System.out.println("\nDo you wish to make another reservation? Enter Y or N");
				char refCheck = sc.next().charAt(0);
				if(refCheck == 'N' || refCheck == 'n')
					killSwitch = 1;
			}

		}while(killSwitch != 1);

		System.out.println();
		System.out.println("Thank you, Goodbye.");
	}
}