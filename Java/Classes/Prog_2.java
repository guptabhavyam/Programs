class Triangle
{
	int l,b,h;

	Triangle()
	{
		l=3;
		b=4;
		h=5; 
	}	
	
	void area()
	{
 		int a;
 		a=(h*b)/2;
 		System.out.println("Area is = "+a); 
	}

	void parameter()
	{
		int p;
		p = l+b+h;
		System.out.println("Parameter is = "+p); 
	}
} 

class Prog_2
{
	public static void main(String args[])
	{
		Triangle s = new Triangle();
		s.area();
		s.parameter();	
	}
}