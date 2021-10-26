/*5.	Write a program that count occurrence of a given number in the array and its frequency
Definition of Done:
a) The program should ask user to enter the elements of the array.
b) The program should ask the user to enter a number to search and display the frequency of the searched element.*/

import java.util.*;

class Frequency
	{
		public static void main(String args[])
			{
				Scanner x = new Scanner(System.in);

				int a[]=new int[5];
				
				int i,t,j, count=0;

				for(i=0;i<5;i++)
					{
						a[i]=x.nextInt();
					}


				for( i=0 ; i<5 ; i++ )
					{
						t=a[i];
						for(j=i+1;j<5;j++)
						{
							if( a[j]==t )
							{
								count++;
							}
						}
					}	
					System.out.println("\n"+count);
			}
	}
