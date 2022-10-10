package org.tnsindia.interfaceexample;

import java.util.Scanner;

//program on 
interface InterfaceOuter{
	//abstract method by default
	void print();
	interface InnerInterface
	{
		//abstract method by default
		void display();
	}
}
class Implementableclass implements org.tnsindia.interfaceexample.InterfaceOuter.InnerInterface 
{

	@Override
	public void display() 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the batch: ");
		String str=s.nextLine();
		System.out.println("The batch is: "+str);
		s.close();
		}
}

class ImplementableClassP implements InterfaceOuter
{

	@Override
	public void print() {
		System.out.println("Working on Nested Interface");
		
	}

}

public class NestedInteface {

	public static void main(String[] args) {
		
		Implementableclass i=new Implementableclass();
		i.display();
		ImplementableClassP i1=new ImplementableClassP();
		i1.print();

	}

}


