import java.util.*;

class Circle
{
	private int r;

	Circle()
	{
		r=2;
	}

	Circle(int x)
	{
		r=x;
	}

	void setRadius(int a )
	{
		r=a;
	}


	void findArea()
	{
		double a;
		a = 3.14*r*r;
		displayArea(a);
	}


	void displayArea( double a)
	{
		System.out.println("The area is " + a);
	}

}

class Circles
{
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);
		
		Circle b = new Circle();
		Circle c = new Circle(5);
		
		int r;
		
		System.out.println("Enter the Radius ");
		r=x.nextInt();

		c.setRadius(r);
		c.findArea();
		b.findArea();

	}	
