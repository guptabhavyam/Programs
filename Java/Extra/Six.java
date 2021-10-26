import java.util.*;

class Six
	{
		public static void main(String args[])
			{
				Scanner x = new Scanner(System.in);

				int a[]=new int[5];
				int i;

				for(i=0;i<5;i++)
					{
						a[i]=x.nextInt();
					}
	
				int sum=0;
				
				for(i=0 ;i<5;i++)
					{
						sum=sum+a[i];
					}
				
				System.out.println("The Sum is " + sum);

				
				int perc=0;

				perc=(sum/500)*100;

				System.out.println("The Percentage is " + perc);
			}


	}	