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
