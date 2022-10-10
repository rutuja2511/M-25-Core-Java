package org.tnsindia.abstractkeyword;
//abstract class can have abstract and non-abstract method

abstract class C {
	//non-abstract method
	void print() 
	{
		System.out.println("Non-abstract method ");
	}
abstract void aceept();
abstract void display();
	
}
/*we can't create the object for abstract class to call the method and to provide
the implementation we must have define child class*/
class D extends C
{

	@Override
	void aceept() {
		System.out.println("Abstract method 1");
		
	}
	//we have to provide implementation to all the abstract method
	@Override
	void display() {
		System.out.println("Abstract method 2");
		
	}

	
	}


public class DemoOnAbstractClass {

	public static void main(String[] args)
	{
		C c = new D();
		c.print();
		c.display();
		c.aceept();
		

	}

}
