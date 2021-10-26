/*5.	Write a program that takes two integers (values to be given within the program) and displays the output of the following operators: addition, subtraction, multiplication, division and modulus.
Definition of Done:
a)	Assign two numbers to two variables.
b)	Use separate variables to store the results.*/
import java.util.*;

class Calc
	{
		public static void main(String args[])
			{
				Scanner x = new Scanner(System.in);
 
    int a,b;
    char o;
    System.out.println("Enter the desired operator (+,-,*,/) \n ");
    o=x.next().charAt(0);
    System.out.println("Enter the two operands\n");
    a=x.nextInt();
    b=x.nextInt();

    switch(o)
    { 
        case '+': System.out.println("%d + %d = %d" + a + b + (a+b));
              break;
        case '-': System.out.println("%d + %d = %d" + a + b + (a-b));
              break;
        case '*': System.out.println("%d + %d = %d" + a + b + (a*b));
              break;
        case '/': System.out.println("%d + %d = %d" + a + b + ((a/b));
              break; 
        case '%': System.out.println("%d + %d = %d" + a + b + ((a%b));
              break;            
    }
    
    


