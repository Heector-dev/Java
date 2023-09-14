package javaPrograms;

import java.util.Scanner;

public class Program_8 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your years at work: ");
		int years = sc.nextInt();
		
		if(years < 2) 
		{
			System.out.println(name+" your salary is: 25.000€");
		}
		
		
		if((years >= 2) && (years <= 4)) 
		{
			System.out.println(name+" your salary is: 35.000€");
		}
		
		
		if((years > 4) && (years <= 7)) 
		{
			System.out.println(name+" your salary is: 50.000€");
		}
		
		
		if((years > 7 ) && (years <= 10)) 
		{
			System.out.println(name+" your salary is: 65.000€");
		}
		
		if(years > 10) 
		{
			System.out.println(name+" your salary is: 80.000€");
		}
	}
}
