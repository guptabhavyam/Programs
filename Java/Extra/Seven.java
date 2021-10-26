import java.util.*;

class Seven
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
	
				int max,min;
				max=a[0];
				min=a[0];

				for(i=0 ;i<5;i++)
					{
						if(max<a[i])
						{
							max=a[i];
						}

						if(min>a[i])
						{
							min=a[i];
						}
					}
				
				System.out.println("The min is " + min);

				System.out.println("The max is " + max);

				}


	}	