/*4.	Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits in the same order and prints the digits separated from one another by three spaces each. 
Definition of Done:
a) The program should ask the user to input the integer.
b) If the number of digits in the integer is not equal to 5, the program should generate an error message and ask the use to re-enter the integer.
c) After a successful run, the program should ask the user if he wants to try the program for some other value, and should exit only when the user wants to exit (by pressing the character ‘N’).*/


import java.util.*;

class Space
	{
 	public static void main(String[] args)
    	{
    		int i,j,a,b,c=0,d;

    		Scanner x = new Scanner(System.in);
    		
    		System.out.println(" Input the number ");
    		a=x.nextInt();	

			b=a;     
			
			for( i=10 ; b != 0 ; i=i*10 )
        		{
            	b = a/i;
            	c++;
         		}
         	
         	if (c<5)
         		{
         		System.out.print("ERROR" + continue() );
        		}
        	
        	else
        		{
        		p=a;
        		for( i=0 ; i<c ; i++ )
         			i=i*10;

        		for( j=1 ; p!=0 ; j++ )
         			{
             		d = p/i ;
             		p = p%i ;
             		i = i/10 ;
                  
         			System.out.printf(d + "   ");
         			}
        		}
      	}        
    }  	