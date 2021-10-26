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
