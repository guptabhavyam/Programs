import java.util.*;
Scanner x=new Scanner(System.in);

class Rectangle
{
	int l,b;

	Rectangle()
	{
	 System.out.println("Enter Length and Breadth");
	  l=x.nextInt();
	  b=x.nextInt();
	}
	void area()
	{
		int a;
		a = l*b;
		System.out.println("Area is = " + a); 

	}

	void parameter()
	{
		int p;
		p = 2*(l+b);
		System.out.println("Parameter is = "+p); 
	}
} 

class Prog_3
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		area();
		parameter();
			
	}
}