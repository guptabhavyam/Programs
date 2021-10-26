import java.util.*;

class Distance
{

	double x1,y1,x2,y2,z;
	
	Distance(int p1,int q1,int p2,int q2)
	{

		x1=p1;
		y1=q1;
		x2=p2;
		y2=q2;

	}
	
	Distance()
	{

		x1=3;
		x2=5;
		y1=7;
		y2=9;

	}
	
	void get( double a1 , double b1 , double a2 , double b2 )
	{

		x1 = a1;
		y1 = b1;
		x2 = a2;
		y2 = b2;

	}

	void display()
	{

		double x,y;
		x = Math.pow ( ( x1 - x2 ) , 2 );
		y = Math.pow ( ( y1 - y2 ) , 2 );
		z = Math.sqrt ( x+y );

		System.out.println("The distance is : "+z);

	}
	
	void set()
	{
		display();
	}
}

class Prog_5
{
	public static void main(String[] args) 
	{

		Scanner x = new Scanner(System.in);
		double a1,b1,a2,b2;
		
		System.out.println("Enter the X of first point");
		a1=x.nextInt();

		System.out.println("Enter the Y of first point");
		b1=x.nextInt();

		System.out.println("Enter the X of second point");
		a2=x.nextInt();

		System.out.println("Enter the Y of second point");
		b2=x.nextInt();

		Distance p = new Distance(a1,b1,a2,b2);
		p.display();
		
		System.out.println();
	
		Distance q = new Distance();
		
		q.get(a1,b1,a2,b2);
		q.set();
		
		
		
		
		
	}
}