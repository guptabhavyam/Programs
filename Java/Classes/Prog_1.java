/* 
create class name student with string variable name and integer variable roll no. assign the value of roll no. as 2 and tha name as john while creating the class object of class student
*/

class Student
{
	String name;
	int r;

	Student()
	{
		name = "John";
		r = 2; 
	}
} 

class Prog_1
{
	public static void main(String args[])
	{
		Student s = new Student();
		System.out.println(s.name); 
		System.out.println(s.r);
	}
}
