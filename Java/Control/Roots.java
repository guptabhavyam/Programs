/*7.	Write a Java program to solve quadratic equations (use if, else if and else).
Definition of Done:
a) The program asks the values of coefficients of a quadratic equation.
b) The program should display the roots or an appropriate message.*/
import java.util.*;

class Roots
	{
   		public static void main(String args[])
   			{
      			double s = 0, f = 0;  // f = first root , s = second root
      			Scanner x = new Scanner(System.in);
      
      			System.out.println("Enter the value of a ::");
    			double a = x.nextDouble();

      			System.out.println("Enter the value of b ::");
      			double b = x.nextDouble();

		      	System.out.println("Enter the value of c ::");
      			double c = x.nextDouble();

			    double d = (b*b)-(4*a*c);  // d = determint
      			double sq = Math.sqrt(determinant);  // sq = square root

     			if(determinant>0)
      				{
         				f = (-b + sqrt)/(2*a);
         				s = (-b - sqrt)/(2*a);
         			
         				System.out.println("Roots are :: "+ f +" and "+ s );
      				}

      			else if(determinant == 0)
      				{
         				System.out.println("Root is :: "+(-b + sq)/(2*a));
      				}
   			}
	}
