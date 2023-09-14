package javaPrograms;

import java.util.Scanner;

public class Program_12 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Introdueix dos numeros sencers: ");
		int dividend = sc.nextInt();
		int divisor = sc.nextInt();
		
		System.out.println((divisor >= 2)&&(divisor<=7)?(dividend%divisor == 0 ? "Es multiple.":"No ho es.")
				:"El divisor ha d'estar comprès entre 2 i 7.");
	}
}
