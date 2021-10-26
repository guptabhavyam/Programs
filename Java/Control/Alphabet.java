/*8.	Write a Java program that asks the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
Definition of Done:
a) The program asks an input from the user.
b) A single character input is taken from the user or an error message is
generated.
c) The program should print “Vowel” if the entered character is a vowel and
“Consonant” if the entered character is a consonant.*/

import java.util.*;

class Alphabet
	{
   		public static void main(String args[])
   			{
      			char c;
      			Scanner x = new Scanner(System.in);char c;
     			System.out.println("Enter the the letter");
     			c = x.next().charAt(0);

   				switch (c)
   					{
        			case 'a': System.out.println("The letter is  a vowel");
                	break;
        			case 'e': System.out.println("The letter is a vowel");
                	break;
        			case 'i': System.out.println("The letter is a vowel");
                	break;
        			case 'o': System.out.println("The letter is a vowel");
                	break;
        			case 'u': System.out.println("The letter is a vowel");
                	break;
       				default : System.out.println("The letter is a consonant");
                	break;
   					}
   			}
   	}		
