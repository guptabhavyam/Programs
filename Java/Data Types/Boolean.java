/*
6.	Write a program to display the results of different relational operators and logical operators in Java on two Integer values and two Boolean values. Input values to be given within the program.
Definition of Done:
a)	Assign two numbers to two variables.
b)	Display messages accordingly for displaying the result of the relational and logical operators.*/

//Write a program to display the results of different relational operators and logical operators in Java
//on two Integer values and two Boolean values. Input values to be given within the program.

class Boolean
{
	public static void main(String[] args) 
	{
		boolean z=true;
		boolean k=true;
		int x=5;
		int y=7;
		if(x>=y)
			System.out.print("X is greator ");
		else
			System.out.print("Y is Greator ");
		if(z&&k)
			System.out.print("They are Equal");
		else
			System.out.print("They are not equal");
	}
}
