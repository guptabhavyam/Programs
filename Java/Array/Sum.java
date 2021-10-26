/*4.	Write a Java program to read numbers in an integer array of size 5 and display the following (using functions for each functionality):
i)	Sum of all the elements
ii)	Sum of alternate elements in the array.
Definition of Done
a) The program should ask user to enter the elements of the array.
b) The program should display a menu with the above choices and ask the user to choose one of the choices.
c) The program should display the result.*/
import java.util.*;

class Sum
	{
		public static void main(String args[])
			{
				Scanner x = new Scanner(System.in);

				int a[]=new int[5];
				
				int i,j,suma=0,sum=0,b;

				for(i=0;i<5;i++)
					{
						a[i]=x.nextInt();
					}

				System.out.println("\nEnter 1 for sum of alternate & 0 for the other \n");	
				b=x.nextInt();
				
				if (b==0)
				{
				for( i=0 ; i<5 ; i++ )
					{
						sum=sum+a[i];
					}
				System.out.println("\nSum is "+sum+"\n");
		
				}
				else
				{
					for( i=0 ; i<5 ; i=i+2 )
					{
						suma=suma+a[i];
					}
						
					System.out.println("\nSum of alternate is "+suma+"\n");
				}
						}
	}
