/*2.  Write a Java program that takes a number from the user between 1 and 12 and displays the name of the corresponding month until the user wants to exit the program.
Definition of Done:
a) The program asks the user to enter a number between 1 and 12.
b) The program should display an error message if the number entered is not between 1 and 12.
c) The corresponding month should be display for the number entered.
d) The program should not exit unless the user wants to exit the program.*/
import java.util.Scanner;

 

class Month 
{

      public static void main(String args[])
       {

            Scanner x = new Scanner(System.in);

            System.out.print("Enter month's number: ");

            int monthNumber =  x.nextInt();

            if (monthNumber == 1)

                  System.out.println("January");

            else if (monthNumber == 2)

                  System.out.println("February");

            else if (monthNumber == 3)

                  System.out.println("March");

            else if (monthNumber == 4)

                  System.out.println("April");

            else if (monthNumber == 5)

                  System.out.println("May");

            else if (monthNumber == 6)

                  System.out.println("June");

            else if (monthNumber == 7)

                  System.out.println("July");

            else if (monthNumber == 8)

                  System.out.println("August");

            else if (monthNumber == 9)

                  System.out.println("September");

            else if (monthNumber == 10)

                  System.out.println("October");

            else if (monthNumber == 11)

                  System.out.println("November");

            else if (monthNumber == 12)

                  System.out.println("December");

            else

                  System.out.println("Invalid month."+ continue());

      }

}