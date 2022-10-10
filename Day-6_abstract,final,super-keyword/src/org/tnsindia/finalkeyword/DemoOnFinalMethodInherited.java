package org.tnsindia.finalkeyword;

class A
{  //final method
	final void display()
	{
		System.out.println("Final Method is inherited but not override");
	}
	
}
class B extends A 
{
	
	void print() 
	{
		System.out.println("Child class");
	}
}
public class DemoOnFinalMethodInherited {

	public static void main(String[] args) {
		
		B b = new B();
		b.display();
		b.print();
	}

}
