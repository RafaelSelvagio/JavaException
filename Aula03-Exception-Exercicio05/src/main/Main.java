package main;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista = new ArrayList<>();

		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		System.out.println("O primeiro elemento da lista é o " + lista.get(0));
		
		try {
			System.out.println("O quinto elemento da lista é o " + lista.get(4));
		} catch (IndexOutOfBoundsException e) {
			System.out.println("A lista não tem 5 elementos.");
		}
	}

}
