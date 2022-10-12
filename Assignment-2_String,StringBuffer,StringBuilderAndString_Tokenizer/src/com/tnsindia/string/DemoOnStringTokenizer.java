package com.tnsindia.string;

import java.util.StringTokenizer;

public class DemoOnStringTokenizer {


public static void main(String args[])
{  
	StringTokenizer st = new StringTokenizer("Lets try this");  
    System.out.println(st.nextToken());  
    System.out.println(st.nextToken());
    System.out.println(st.nextToken());
}  
} 