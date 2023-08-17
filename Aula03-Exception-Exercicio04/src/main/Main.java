package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem vindo ao cadastro de senha. ");
		System.out.print("Digite uma senha: ");
		String senha = scanner.next();
		
		System.out.print("Repita a senha: ");
		String senha_repete = scanner.next();
		
		try {
			if (!senha.equals(senha_repete)) {
				throw new SenhaDiferenteException("As senhas não conferem.");
			}
			
			System.out.print("Senha cadastrada.");
		} catch(SenhaDiferenteException e) {
			System.out.print(e.getMessage());
		}
	}

}
