/*1.	Compute the sum of the series: 1+x+x2 /2!+x3/3!+…The program should ask the user to enter the value of x. The program should ask the user to enter the number of terms for which the sum is to be calculated.
Definition of Done:
a) The program should ask the user to enter the value of x.
b) The program should ask the user to enter the number of terms for which the sum is to be calculated.*/
import java.util.*;

class Sequence 
	{
	int fact(int f)
	{
		int t=1,j;
		if (f==0)
		{
			return(1);
		}
		else
		{
			for (j=f;j>0;j++)
			{
				t=t*j;
			}
			return(t);
		}	
	}
	public static void main(String args[])
			{
				Scanner s = new Scanner(System.in);

				int a[]=new int[5];
				int i,f,j,n,sum = 0;

				System.out.println("\nEnter the value of x");
				int x=s.nextInt();
				System.out.println("\nEnter the range");
				n=s.nextInt();


				for( i=0 ; i<n ; i++ )
					{
						sum = sum + (  (i*x) / fact(i)  );
						
					}	
					System.out.println("\n"+count);
			}
	}
