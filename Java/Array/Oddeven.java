/*3.	Write Java Program to count even and odd numbers in an array.
Definition of Done
a)	The program should ask user to enter the elements of the array.
b)	Even elements will be stored in EvenArray[] and odd elements will be stored in oddArray[].
c)	Display all three arrays along with their length.*/

import java.util.*;

class Oddeven
	{
		public static void main(String args[])
			{
				Scanner x = new Scanner(System.in);

				int a[]=new int[5];
				int i,j,e,o;

				for(i=0;i<5;i++)
					{
						a[i]=x.nextInt();
					}

					


				for( i=0 ; i<5 ; i++ )
					{
						if( a[j]%2==0 )
							{
								e++;
							}
						else
						{
							o++;
						}
					}	
					System.out.println("\nEven = "+count"\nOdd = " + o);
			}
	}
