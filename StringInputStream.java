import java.util.Scanner;

public class StringInputStream {
   public static void main(String[] args) {

      String userInfo = "Amy Smith 19"; // Input string
      String firstName;            // First name
      String lastName ;            // Last name
      int userAge ;                  // Age

      // Init scanner object with string
      Scanner inSS = new Scanner(userInfo);

      // Parse name and age values from string
      firstName = inSS.next();
      lastName = inSS.next();
      userAge = inSS.nextInt();

      // Output parsed values
      System.out.println("First name: " + firstName);
      System.out.println("Last name: " + lastName);
      System.out.println("Age: " + userAge);

      return;
   }
}