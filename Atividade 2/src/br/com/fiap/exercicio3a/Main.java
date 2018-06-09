package br.com.fiap.exercicio3a;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Verdadeiro, pois a classe ChowChow herda da classe Cachorro, então é uma
		 * instãncia da classe Cachorro, tendo como abstração do mundo real onde ChowChow é uma
		 * raça de cachorro.
		 */
		
		ChowChow chowChow = new ChowChow();
		Boolean valor = chowChow instanceof Cachorro;
		System.out.println("Verdadeiro ou Falso: " + valor);

	}

}
