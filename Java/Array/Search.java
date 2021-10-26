/*2.	Write a Java program to find the index of an array element in an array of size 10. The program should not use any function other than main ( ) functions.
Definition of Done:
a) The program should ask user to enter the elements of the array.
b) The program should ask the user to enter a number to search.
c) The program should display the elements of the array entered.
d) The program should display the index of the number if the item is present or display -1 of the element is not present.*/

import java.util.*;

class Search
	{
		public static void main(String args[])
			{
				Scanner x = new Scanner(System.in);

				int a[]=new int[10];
				
				int i,j,f,b;

				for(i=0;i<10;i++)
					{
						a[i]=x.nextInt();
					}

					System.out.println("Enter the number to search\n");
					b=x.nextInt();


				for( i=0 ; i<10 ; i++ )
					{
						if( a[j]==b )
							{
								f=j;
							}
						else
						{
							f=-1;
						}
					}	
					System.out.println("\n"+f);
			}
	}
