package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		
		try {
			if (numero < 0) {
				throw new InputMismatchException("O número informado é negativo.");
			}
			
			int fatorial = 1;
	        for (int i = 1; i <= numero; i++) {
	            fatorial *= i;
	        }
	        
	        System.out.print("O fatorial de " + numero + " é " + fatorial);
		} catch(InputMismatchException e) {
			System.out.print(e.getMessage());
		}
	}

}
