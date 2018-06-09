package br.com.fiap.exercicio3b;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Falso, pois a classe Cachorro é superclasse da classe ChowChow, então não é uma
		 * instãncia da classe ChowChow, tendo como abstração do mundo real onde um cachorro pode ter uma
		 * raça diferente de ChowChow e não todo cachorro é necessariamente um ChowChow.
		 */
		
		Cachorro cachorro = new Cachorro();
		Boolean valor = cachorro instanceof ChowChow;
		System.out.println("Verdadeiro ou Falso: " + valor);
		
	}

}
