package br.com.fiap.exercicio1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int operacao = Integer.parseInt(JOptionPane.showInputDialog(
				"O que deseja fazer?" + "\n1. Somar" + "\n2. Subtrair" + "\n3. Dividir" + "\n4. Multiplicar"));
		
		float op1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
		float op2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		/*
		 * Verifica se é uma divisão por zero
		 */
		if(operacao == 3 && op2 == 0) {
			System.out.println("Não existe divisão por zero!");
			return;
		}
		
		Calculadora calculadora = new Calculadora();
		
		switch (operacao) {
		case 1:
			System.out.println(calculadora.somar(op1, op2));
			break;
		case 2:
			System.out.println(calculadora.subtrair(op1, op2));
			break;
		case 3:
			System.out.println(calculadora.dividir(op1, op2));
			break;
		case 4:
			System.out.println(calculadora.multiplicar(op1, op2));
			break;
		default:
			System.out.println("Operacão inválida!");
			break;
		}
	}

}
