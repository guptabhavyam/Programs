import java.util.*;

class Five
	{
		public static void main(String args[])
			{
				Scanner a = new Scanner (System.in);
				
				System.out.println("Enter Your Marks = ");
				int x = a.nextInt();
				
				
				if (x>90)
					{
						System.out.println("The Grade is A");
					}
				else
					{
						if(x>80)
							{
								System.out.println("The Grade is B");
							}
						else
							{
								if(x>70)
									{
										System.out.println("The Grade is C");
									}
								else
									{
										if(x>60)
											{
												System.out.println("The Grade is D");
											}
										else
											{
												System.out.println("The Grade is F");
											}	
									}
							} 
					}                     

				
			}
	}