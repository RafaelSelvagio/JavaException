package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome de usuário: ");
		String nome = scanner.nextLine();
		
		try {
			if (nome.isEmpty()) {
				throw new IllegalArgumentException("O nome de usuário não pode ser vazio.");
			}
			
			if (nome.length() > 10) {
				throw new IllegalArgumentException("O nome de usuário não pode ter mais do que 10 caracteres.");
			}
			
			System.out.print("Nome de usuário cadastrado.");
		} catch(IllegalArgumentException e) {
			System.out.print(e.getMessage());
		}
	}

}
