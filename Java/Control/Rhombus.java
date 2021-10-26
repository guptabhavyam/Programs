/*6.	Write a Java program to display the following character rhombus structure.   
Definition of Done: 
a)	The program asks the user for the number of rows for the rhombus structure from the user
b)	The Expected Output for 7 rows should a rhombus structure. 
c)	After a successful run, the program should ask the user if he wants to try the program for some other value, and should exit only when the user wants to exit (by pressing the character ‘N’).*/
import java.util.*;

class Rhombus

  {
 		public static void main(String[] args)
    		{
    			 int i,j,k;
    
    			for(i=4;i>=1;i--)
    				{
        				for(j=1;j<i;j++)
       				 		{
            					System.out.print(" ");
        					}
        
       					 for(k=i;k<=7-(i-1);k++)
        					{
         						System.out.print("%d",k);
        					}
        
    					System.out.print("\n");
    				}
    

    			for(i=2;i<=4;i++)
    				{
         				for(j=1;j<i;j++)
        					{
            					Sustem.outprint(" ");
        					}
        
        				for(k=i;k<=(7-(i-1));k++)
        					{
         						printf("%d",k);
        
        					}
    
    				    System.out.print("\n");
    				}
    		}
}
    