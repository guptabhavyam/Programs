import java.util.*;

class Box
	{
		double w;
		double h;
		double d;

		Box () 
			{
				w=-1;
				h=-1;
				d=-1;
			}
	

		Box( double x, double y, double z)
			{
				w=x;
				h=y;
				d=z;
			}

		double findArea()
		{
			double A;
			A = w*h*d;
			return(A);
		}
	}	

class Overloading
	{
		public static void main(String args[])
			{
				Box x = new Box() ;
				Box y = new Box( 2.5 , 3.5 , 4.5 );
				double A = x.findArea();
				double B = y.findArea();
				System.out.println("\n"+"The Area is x " + A );
				System.out.println("\n"+"The Area is y " + B );
			
			}
	}