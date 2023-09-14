package javaPrograms;

import java.util.Scanner;

public class Program_5 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{		
		System.out.println("Introdueix un numero sencer: ");
		
		int n = sc.nextInt();
		int varInt = (n < 10)?n:1;
		for(int i = 1; i <= 10; ++i) 
		{
			System.out.printf("%d * %d = %d \n", varInt, i, varInt * i);
		}
	}
}
