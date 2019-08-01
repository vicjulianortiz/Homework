import java.util.Scanner;

public class NumberTranslator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please a telephone number in the format xxx-xxx-xxxx");

		String phoneNumber = sc.nextLine();

		System.out.println("This phone number is equivalent to: ");

		for(int i = 0; i < phoneNumber.length(); i++)
		{
			char ch = phoneNumber.charAt(i);

			if(Character.isLetter(ch))
			{
				switch(Character.toUpperCase(ch))
				{
					case 'A':
					case 'B':
					case 'C': System.out.print("2");
								break;
					case 'D':
					case 'E':
					case 'F':System.out.print("3");
								break;
					case 'G':
					case 'H':
					case 'I':System.out.print("4");
								break;
					case 'J':
					case 'K':
					case 'L':System.out.print("5");
								break;
					case 'M':
					case 'N':
					case 'O':System.out.print("6");
								break;
					case 'P':
					case 'Q':
					case 'R':
					case 'S':System.out.print("7");
								break;
					case 'T':
					case 'U':
					case 'V':System.out.print("8");
								break;
					case 'W':
					case 'X':
					case 'Y':
					case 'Z':System.out.print("9");
								break;
				}
			}
			else
				System.out.print(ch);

		}
		System.out.println();

	}
}
