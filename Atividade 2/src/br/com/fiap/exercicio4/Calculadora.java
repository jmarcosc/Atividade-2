package br.com.fiap.exercicio4;

public class Calculadora implements CalculadoraBasica {

	public float somar(float op1, float op2) throws Exception {
		if(op1 == 0) {
			throw new Exception("O primeiro operador não pode ser igual a 0!");
		}
		else {
			return op1 + op2;
		}
	}

	public float subtrair(float op1, float op2) throws Exception {
		if(op1 == 0) {
			throw new Exception("O primeiro operador não pode ser igual a 0!");
		}
		else {
			return op1 - op2;
		}
	}

	public float dividir(float op1, float op2) throws Exception {
		if(op1 == 0) {
			throw new Exception("O primeiro operador não pode ser igual a 0!");
		}
		else {
			return op1 / op2;
		}
	}

	public float multiplicar(float op1, float op2) throws Exception {
		if(op1 == 0) {
			throw new Exception("O primeiro operador não pode ser igual a 0!");
		}
		else {
			return op1 * op2;
		}
	}

}
