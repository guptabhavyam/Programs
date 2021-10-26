import java.util.*;

class Eight
	{
		public static void main(String args[])
			{
				Scanner x = new Scanner(System.in);

				int a[]=new int[5];
				int i,j,t;

				for(i=0;i<5;i++)
					{
						a[i]=x.nextInt();
					}


				for( i=0 , j=4 ; i<5/2 ; i++,j-- )
					{
						t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				
				for(i=0;i<5;i++)
					{
						System.out.println(a[i]);
					}
			}


	}	