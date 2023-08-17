package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		String numero_string = scanner.next();
		
		int numero_inteiro = 0;
		
		try {
			numero_inteiro = Integer.parseInt(numero_string);
			System.out.println("O número digitado foi convertido para inteiro.");
		} catch (NumberFormatException e) {
			System.out.println("Você não digitou um número.");
		} finally{
			System.out.println(".: FIM :.");
		}
		
		
	}

}
