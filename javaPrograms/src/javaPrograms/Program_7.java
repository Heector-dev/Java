package javaPrograms;

import java.util.Scanner;

public class Program_7 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{	
		System.out.println("Enter two integers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println(n1>n2 ? n1+" is greater than "+n2:n1+" is less than "+n2);
	}
}
