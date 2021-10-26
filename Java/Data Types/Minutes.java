/*4.  Write a Java program to convert minutes into the number of years, months and days.
Definition of Done:
a)  Ask the user to input the minutes
b)  Display years and months and days in the sequence yy-mm-dd.*/

import java.util.*;

class Minutes 
{
  public static void main(String args[])
   {
    Scanner i = new Scanner(System.in);
    
    System.out.println("Enter the number of minutes:");
    int m = i.nextInt();

     
    int y = m / 525600;
    int d = m / 1440;
    int r = d % 525600;  //  r = Remaining Minutes
 

    System.out.println(m + " minutes is " + y + " years and "  +  r + " days ");
    }

   }