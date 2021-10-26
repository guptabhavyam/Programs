/*6.	 Write a program that reads a 2-D integer array with each element of
		maximum 2 digits and prints the following:
		a) Elements of the entered array.
		b) elements of the array after each element is multiplied by 2 if it is an odd number.
          
             Definition of Done:
            a) The program should generate an error message if the number of digits in the array is more than two and ask the user to re-enter the number.
            b) The program should use continue statement for ignoring even elements.
            c) The array elements should be displayed in tabular form with width set to  . */



import java.util.*;

class Odd
	{
		public static void main(String args[])
			{
				Scanner x = new Scanner(System.in);

				int a[][]=new int[2][5];
				int i,j,e,o;

				for(i=0;i<2;i++)
					{
					for(j=0;j<5;j++)
						{
						
						a[i][j]= x.nextInt();
						
						if( 10 < a[i][j] < 100 )
							break;
						
						else
							{
								System.out.println("Error  Try  again");
								continue;
						
						}
					}

					

				for(i=0;i<2;i++)
					{
					for(j=0;j<5;j++)
						{
				
						if( a[i][j]%2!=0 )
						{
								a[i][j]=a[i][j]*2;
						}
						
						
					System.out.println("\nEven = "+count"\nOdd = " + o);
			}
	}
