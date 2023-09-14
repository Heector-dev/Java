package javaPrograms;

import java.util.Scanner;

public class Program_3 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter a integer: ");
		int n = sc.nextInt();
		
		System.out.println("Double " +n + " is: " + (n * 2));
		System.out.println("The triple " +n + " is: " + (n * 3));
	}
}
