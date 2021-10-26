import java.util.*;


class Complex
{
	int r;
	int i; 

	void sum(Complex a,Complex b)
	{
		Complex c = new Complex() ;
		c.r = a.r + b.r;
		c.i = a.i + b.i;
		System.out.println("The sum is " + c.r + " + i" + c.i );
	}

	void diff(Complex a,Complex b)
	{
		
		Complex c = new Complex() ;
		c.r = a.r - b.r;
		c.i = a.i - b.i;
		System.out.println("The difference is " + c.r + " + i" + c.i );
	}

	void prod(Complex a,Complex b)
	{
		Complex c = new Complex() ;
		c.r = a.r * b.r;
		c.i = a.i * b.i;
		System.out.println("The product is " + c.r + " + i" + c.i );
	}
}

class Prog_4
{
	public static void main(String args[])
	{
		Scanner x = new Scanner(System.in);

		Complex a = new Complex();
		Complex b = new Complex();
		
		System.out.println("Enter the REAL part of the First Number");
		a.r=x.nextInt();

		System.out.println("Enter the IMAGINARY part of the First Number");
		a.i=x.nextInt();

		System.out.println("Enter the REAL part of the Second Number");
		b.r=x.nextInt();

		System.out.println("Enter the IMAGINARY part of the Second Number");
		b.i=x.nextInt();

		a.sum(a,b);
		a.diff(a,b);
		a.prod(a,b);

	}
}