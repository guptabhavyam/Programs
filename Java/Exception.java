import java.util.*;
class Exception
{
	public static void main (String args[])
	{
		Scanner x = new Scanner(System.in);

		try
		{
			int a=100;
			int b;
			System.out.println("Enter the value of b to divide 100");
			b = x.nextInt();
			a = a/b;
		}

		catch(ArithmeticException e)
		{
			System.out.println("   ArithmeticException  -->  "+e);
		}

		try
		{
			int a[] = new int [10];
			for(int i=0 ; i<11 ; i++)
				System.out.println(a[i]);
		}
		
		catch(ArrayIndexOutofBoundsException e)
		{
			System.out.println("    ArrayIndexOutOfBoundsException   -->  "+e);
		}

		try
		{
			String s = new String();
			s = "abc";
			int i = Integer.parseInt(s);
		}

		catch(NumberFormatException e)
		{
			System.out.println("     NumberFormatException    -->    "+e);
		}

		try
		{	
			int j = 0 ;
			b = 2 ;
			b = b*j ;
		}

		catch(NullPointerException e)
		{
			System.out.println("     NullPointerException    -->    "+e);
		}
		
		finally
		{
		System.out.println("   End of program   ");
		}
	}
}