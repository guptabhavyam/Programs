/*3.	Write a Java program that reads in two floating-point numbers and tests   whether they are the same up to three decimal places. 
Definition of Done:
a) The program should read two float numbers.
b) The program should ask the user to re-enter of the values entered are not numbers.
c) The program should display an appropriate message after comparison of the two numbers.*/
import java.util.*;

class Float

  {
 		public static void main(String[] args)
    		{
        
        		Scanner x = new Scanner(System.in);

		        System.out.print("Input floating-point number: ");
        		double a = x.nextDouble();
        		System.out.print("Input floating-point another number: ");
        		double b = x.nextDouble();

    		    a = Math.round(a * 1000);
	       	    a = a / 1000;

		        b = Math.round(b * 1000);
        		b = b / 1000;

		        if (a == b)
        			{
            			System.out.println("They are the same up to three decimal places");
        			}
        
        		else
        			{
            			System.out.println("They are different");
        			}
    
    }

}