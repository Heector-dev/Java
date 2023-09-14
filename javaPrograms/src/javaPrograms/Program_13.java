package javaPrograms;

import java.util.Scanner;

public class Program_13 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		String n = "si";
		
		System.out.println("Introdueix la teva edat: ");
		int edat = sc.nextInt();
		
		System.out.println("Tens titol universitari? Digues si o no: ");
		String titolUniversitari = sc.next();
		
		System.out.println("Ets a l'atur? Digues si o no: ");
		String atur = sc.next();
		
		System.out.println(((edat >= 18) && (titolUniversitari.equals(n))) || atur.equals(n) ?"Tens beca":"No reps beca" );
	}
}
