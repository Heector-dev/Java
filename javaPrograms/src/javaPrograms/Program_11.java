package javaPrograms;

import java.util.Scanner;

public class Program_11 
{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Selecciona quin plat vols menjar: "
							+"\n" +"carn"
							+"\n" +"pasta"
							+"\n" +"risotto");
		String operador = sc.next();
		
		System.out.println("Tens alguna intolerancia?");
		String operador1 = sc.next();
		
		System.out.println((operador.equals("carn"))||(operador.equals("pasta"))||(operador.equals("risotto"))&&(operador1.equals("no"))
				?"Perfecte, comanda correcta.":"Voste no pot menjar aquest plat.");
	}
}
