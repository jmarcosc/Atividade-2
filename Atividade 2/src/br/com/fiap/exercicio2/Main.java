package br.com.fiap.exercicio2;

public class Main {

	public static void main(String[] args) {

		EquipamentoEletronico tablet = new Tablet();
		EquipamentoEletronico smartphone = new Smartphone();
		Equipamento equipamento = new Equipamento();
		Object objeto = new Object();
		Movel movel = new Movel();
		Tablet tablet2 = new Tablet();
		Smartphone smartphone2 = new Smartphone();
		
		//a. Conversão explícita
		objeto = equipamento;
		
		//b. Conversão explícita
		objeto = movel;
		
		//c. Conversão explícita
		equipamento = tablet2;
		
		//d. Conversão explícita
		equipamento = smartphone2;
		
		//e. Conversão explícita
		smartphone = tablet;
		
		//f. Conversão impossível
		smartphone2 = tablet2;
		
		//g. Conversão implícita
		equipamento = (Equipamento) tablet;
		
		//h. Conversão implícita
		movel = (Movel) tablet;
		
		//i. Conversão implícita
		tablet = (EquipamentoEletronico) equipamento;
		
	}

}
