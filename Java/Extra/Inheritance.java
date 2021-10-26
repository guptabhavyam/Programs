import java.util.*;

class Parent
{
	void A()
	{
		System.out.println("This is Parent class");
	}
}

class Child extends Parent
{
	void B()
	{
		System.out.println("This is Child class");
	}
}

class Inheritance
{
	public static void main(String args[])
	{
		System.out.println("bhavyam");
		Parent x = new Parent();
		Child y = new Child();
		x.A();
		y.B();
		y.A();
	}
}
