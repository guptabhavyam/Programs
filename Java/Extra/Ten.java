import java.util.*;

class Circle
	{
		int r;

		void area ()
		{
			double A;
			A=3.14*r*r;
			System.out.println(A);
		}		

		Circle ( int r )
			{
				this.r = r;
			}
	}	

class Ten
	{
		public static void main(String args[])
			{
				Circle x = new Circle();
				x.r=5;
				x.area();

				Circle c[5] = new Circle();
			}
	}