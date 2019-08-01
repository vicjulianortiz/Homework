/*******************************************************************
@Title:		Reservation
@Purpose:	To verify the edit, compile, execute function in Textpad
@Author:    Ortiz, Victor
@Date:   	12/2/2017
@Version:	1.0
********************************************************************/

public class Reservation
{
	private int[][] seats = new int[21][4];
	private String passengerName;
	private int ID;
	private String flightNumber;
	private int row;
	private int seat;

	public Reservation(String name, int id, String flight, int requestedRow, char requestedSeat)
	{
		passengerName = name;
		ID = id;
		flightNumber = flight;
		row = requestedRow;
		if(requestedSeat == 'A' || requestedSeat == 'a')
			seat = 0;
		else if(requestedSeat == 'B' || requestedSeat == 'b')
			seat = 1;
		else if(requestedSeat == 'C' || requestedSeat == 'c')
			seat = 2;
		else if(requestedSeat == 'D' || requestedSeat == 'd')
			seat = 3;
	}

	public void setID(int id)
	{
		ID = id;
	}
	public void setRow(int requestedRow)
	{
		row  = requestedRow;
	}

	public void setSeat( char requestedSeat)
	{
		if(requestedSeat == 'A' || requestedSeat == 'a')
			seat = 0;
		else if(requestedSeat == 'B' || requestedSeat == 'b')
			seat = 1;
		else if(requestedSeat == 'C' || requestedSeat == 'c')
			seat = 2;
		else if(requestedSeat == 'D' || requestedSeat == 'd')
			seat = 3;
	}

	public boolean checkSeatAvailability()
	{
		if(seats[row][seat] == 0)
			{
				seats[row][seat] = 1;
				return true;
			}
		else
		{
			return false;
		}
	}

	public void makeReservation()
	{
		seats[row][seat] = ID;
	}

	public String toString()
	{
		char seatLetter = '0';
		if(seat == 0)
			seatLetter = 'A';
		else if (seat == 1)
			seatLetter = 'B';
		else if (seat == 2)
			seatLetter = 'C';
		else if (seat == 3)
			seatLetter = 'D';

		String formatted = "Passenger name: " + passengerName + ", ID: " + ID + ", seat assignment : Row " + row + " Seat: " + seatLetter;
		return formatted;
	}


}