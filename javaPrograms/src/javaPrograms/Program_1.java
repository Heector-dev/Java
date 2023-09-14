package javaPrograms;

import java.util.Scanner;

public class Program_1 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Write your name: ");
		String name = sc.nextLine();
		
		System.out.println("Write your last name: ");
		String lastName = sc.nextLine();
		
		System.out.println("Write your age: ");
		int age = sc.nextInt();
		
		System.out.println("I'm " + name +" " + lastName + " and I'm "+ age + " old.");
	}
}
