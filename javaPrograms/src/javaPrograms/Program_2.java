package javaPrograms;

import java.util.Scanner;

public class Program_2 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Enter two integers: ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("The result of the sum is: " +(n1 + n2));
		System.out.println("The result of the substraction is: " +(n1 - n2));
		System.out.println("The result of the multiplication is: " +(n1 * n2));
		System.out.println("The result of the division is: " +(n1 / n2));
	}
}
