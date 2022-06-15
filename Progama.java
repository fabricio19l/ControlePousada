package model;

import java.util.Scanner;

import entites.Aluguel;

public class Progama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//double[] aluguel = new double[10]
		Aluguel[] vetor =  new Aluguel[10];
		
		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Aluguel #"+i+":");
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Aluguel(nome, email);
		}
		
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i<10; i++) {
			if (vetor[i] != null) {
				System.out.println(i+": "+vetor[i]);
				
			}
		}
	}

}
