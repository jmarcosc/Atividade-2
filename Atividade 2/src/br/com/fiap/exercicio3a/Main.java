package br.com.fiap.exercicio3a;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Verdadeiro, pois a classe ChowChow herda da classe Cachorro, ent�o � uma
		 * inst�ncia da classe Cachorro, tendo como abstra��o do mundo real onde ChowChow � uma
		 * ra�a de cachorro.
		 */
		
		ChowChow chowChow = new ChowChow();
		Boolean valor = chowChow instanceof Cachorro;
		System.out.println("Verdadeiro ou Falso: " + valor);

	}

}
