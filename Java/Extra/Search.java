import java.util.*;

class Search
	{
		public static void main(String args[])
			{
				Scanner x = new Scanner(System.in);

				int a[]=new int[5];
				
				int i,j,f,b;

				for(i=0;i<5;i++)
					{
						a[i]=x.nextInt();
					}

					System.out.println("Enter the number to search\n");
					b=x.nextInt();


				for( i=0 ; i<5 ; i++ )
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
					System.out.println(f);
			}
	}
