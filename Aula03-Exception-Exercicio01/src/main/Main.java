package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número inteiro: ");
		int primeiro = scanner.nextInt();
		
		System.out.print("Digite o segundo  número inteiro: ");
		int segundo = scanner.nextInt();
		
		double resultado = 0;
		
		try {
			resultado = primeiro / segundo;
		} catch (ArithmeticException e) {
			System.out.println("Não existe divisão por zero.");
		}
		
		System.out.println(primeiro + " / " + segundo + " = " + resultado);
	}

}
