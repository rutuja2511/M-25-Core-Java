package superkeyword;

class Person 
{
	//super class Constructor
	Person()
	{
		System.out.println("Parent class constructor");
	}
}
class Student extends Person
{
	Student()
	{
		// to all the parent class constructor
		super();
		System.out.println("child class Constructor");
	}
}
public class DemoOnSuperClassConstructor {

	public static void main(String[] args) 
	{
		Student s=new Student();
	}

}
