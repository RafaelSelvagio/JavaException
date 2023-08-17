package main;

public class Main {

	public static void metodo1() {
		
		System.out.println("Início da metodo1.");
		
		int[] vetor = new int[5];
		
		for (int i = 0; i < 10; i++) {
			
			try {
				vetor[i] = i;
				System.out.println("Posição -> " + i);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição -> " + i + " não existe no array.");
			}
			
			
		}
		System.out.println("Início da metodo2.");
	}

	public static void main(String[] args) {
		System.out.println("Início da main.");
		metodo1();
		System.out.println("Fim da main.");
	}

}
