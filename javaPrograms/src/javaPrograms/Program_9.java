package javaPrograms;

import java.util.Scanner;

public class Program_9 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int n;
		do 
		{
			System.out.println("Enter a number from 1 to 10: ");
			n = sc.nextInt();
			
				switch (n) 
				{
				case 1:
					System.out.println("one");
					break;
				case 2:
					System.out.println("two");
					break;
				case 3:
					System.out.println("three");
					break;
				case 4:
					System.out.println("four");
					break;
				case 5:
					System.out.println("five");
					break;
				case 6:
					System.out.println("six");
					break;
				case 7:
					System.out.println("seven");
					break;
				case 8:
					System.out.println("eight");
					break;
				case 9:
					System.out.println("nine");
					break;
				case 10:
					System.out.println("ten" + "See you soon...!");
					break;
				}
		}while (n != 10);
	}
}
