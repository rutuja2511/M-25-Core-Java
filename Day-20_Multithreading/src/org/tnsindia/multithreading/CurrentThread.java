package org.tnsindia.multithreading;

public class CurrentThread {
	public static void main(String[] args) {
		Thread t=Thread.currentThread();
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
