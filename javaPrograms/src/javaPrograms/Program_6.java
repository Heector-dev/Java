package javaPrograms;

import java.util.Scanner;

public class Program_6 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int hand = 1;
		int paint = 12;
		
		System.out.println("Enter the wall's height: ");
		int height = sc.nextInt();
		
		System.out.println("Enter the wall's broad: ");
		int broad = sc.nextInt();
		
		System.out.println("Enter the hands that will help you: ");
		hand = sc.nextInt();
		
		System.out.println("The paint's liters you'll need: " + (((height * broad)*hand)/paint));
	}
}
