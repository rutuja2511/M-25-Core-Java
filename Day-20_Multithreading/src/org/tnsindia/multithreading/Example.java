package org.tnsindia.multithreading;

public class Example {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("Current thread: "+t);
		t.setName("Priya");
		t.setPriority(9);
		System.out.println("Current thread: "+t);
		try
		{
			Thread.sleep(1);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}

	}

}