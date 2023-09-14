package javaPrograms;

import java.util.Scanner;

public class Program_10 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{		
		System.out.println("Enter two numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("Show me what operation do you want to do: +, -, * o /");
		String operador = sc.next();
		
		switch(operador) {
		case "+":
			int suma = suma(n1, n2);
			mostrarSuma(suma);
		break;		
		case "-":
			int resta = resta(n1, n2);
			mostrarResta(resta);
			break;
		case "*":
			int multiplicar = multiplicar(n1, n2);
			mostrarMultiplicar(multiplicar);
			break;
		case "/":
			int divisio = divisio(n1, n2);
			mostrarDivisio(divisio);
		break;
		} sc.close();
	}
	
	public static int suma(int n1, int n2) 
	{
		int suma = n1 + n2;
		return suma;
	}
	
	public static void mostrarSuma(int suma) 
	{
		System.out.println("El resultat es: "+ suma);
	}
	
	public static int resta(int n1, int n2) 
	{
		int resta = n1 - n2;
		return resta;
	}
	
	public static void mostrarResta(int resta) 
	{
		System.out.println("The result is: "+ resta);
	}
	
	public static int multiplicar(int n1, int n2) 
	{
		int multiplicar = n1 * n2;
		return multiplicar;
	}
	
	public static void mostrarMultiplicar(int multiplicar) 
	{
		System.out.println("The result is: "+ multiplicar);
	}
	
	public static int divisio(int n1, int n2) 
	{
		int divisio = n1 / n2;
		return divisio;
	}
	
	public static void mostrarDivisio(int divisio) 
	{
		System.out.println("The result is: "+ divisio);
	}
}
