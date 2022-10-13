package com.cg.array;

class Student
{
	public int roll_no;
	public String name;
	//construtor
	Student(int roll_no, String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
}
public class StudentArray {

	public static void main(String[] args) {
		Student[] arr = new Student[4];
		arr[0]=new Student(101, "Rutuja");
		arr[1]=new Student(102, "Tina");
		arr[2]=new Student(103, "Aishu");
		arr[3]=new Student(101, "Harshu");
		for (int i=0;i<arr.length;i++)
		{
		System.out.println("Enter the "+i+" index: " +arr[i].roll_no+" "+arr[i].name);
		}
	}

}
