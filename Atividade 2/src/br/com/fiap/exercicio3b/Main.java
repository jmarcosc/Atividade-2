package br.com.fiap.exercicio3b;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Falso, pois a classe Cachorro � superclasse da classe ChowChow, ent�o n�o � uma
		 * inst�ncia da classe ChowChow, tendo como abstra��o do mundo real onde um cachorro pode ter uma
		 * ra�a diferente de ChowChow e n�o todo cachorro � necessariamente um ChowChow.
		 */
		
		Cachorro cachorro = new Cachorro();
		Boolean valor = cachorro instanceof ChowChow;
		System.out.println("Verdadeiro ou Falso: " + valor);
		
	}

}
