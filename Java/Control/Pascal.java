/*5.	Write a Java program to display Pascal's triangle. 
Definition of Done:
a) The program asks the user for the number of rows of the pascal’s triangle.
b) The Expected Output for 5 rows should be as follows.
                                   1
                                  1 1
                                 1 2 1
                                1 3 3 1
                               1 4 6 4 1
c) After a successful run, the program should ask the user if he wants to try
the program for some other value, and should exit only when the user
wants to exit (by pressing the character ‘N’).  */

import java.util.*;
class Pascal 
	{

  		public static void main(String[] args)
			{
    
    			int n,c=1,b,i,j;
    			System.out.println("Input number of rows: ");
    			
    			Scanner x = new Scanner(System.in);
		    	n = x.nextInt();
    
    			for( i=0 ; i<n ; i++ )
    				{
        				for( b=1 ; b<=n-i ; b++ )
        					System.out.print(" ");
        
        				for( j=0 ; j<=i ; j++ )
        					{
            		
            					if ( j==0 || i==0 )
                					c=1;
            					
            					else
               						c=c*(i-j+1)/j;
            
            					System.out.print(" "+c);
        					}

        				System.out.print("\n");
    				}
			}
	}