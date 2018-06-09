package br.com.fiap.exercicio4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int operacao = 0;
		float op1 = 0;
		float op2 = 0;
		
		try {
			operacao = Integer.parseInt(JOptionPane.showInputDialog(
					"O que deseja fazer?" + "\n1. Somar" + "\n2. Subtrair" + "\n3. Dividir" + "\n4. Multiplicar"));
			
			op1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
			op2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
		} catch (Exception e) {
			System.out.println("Erro! A entrada de dados deve ser numérica!");
			return;
		}
		
		Calculadora calculadora = new Calculadora();
		
		switch (operacao) {
		case 1:
			try {
				System.out.println(calculadora.somar(op1, op2));
			} catch (Exception e) {
				System.out.println("Ocorreu um erro na operação de soma -> " + e);
			}
			break;
		case 2:
			try {
				System.out.println(calculadora.subtrair(op1, op2));
			} catch (Exception e) {
				System.out.println("Ocorreu um erro na operação de subtração -> " + e);
			}
			break;
		case 3:
			try {
				System.out.println(calculadora.dividir(op1, op2));
			} catch (Exception e) {
				System.out.println("Ocorreu um erro na operação de divisão -> " + e);
			}
			break;
		case 4:
			try {
				System.out.println(calculadora.multiplicar(op1, op2));
			} catch (Exception e) {
				System.out.println("Ocorreu um erro na operação de multiplicação -> " + e);
			}
			break;
		default:
			System.out.println("Operacão inválida!");
			break;
		}
	}

}
