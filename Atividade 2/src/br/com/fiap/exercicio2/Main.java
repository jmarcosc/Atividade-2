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
		
		//a. Convers�o expl�cita
		objeto = equipamento;
		
		//b. Convers�o expl�cita
		objeto = movel;
		
		//c. Convers�o expl�cita
		equipamento = tablet2;
		
		//d. Convers�o expl�cita
		equipamento = smartphone2;
		
		//e. Convers�o expl�cita
		smartphone = tablet;
		
		//f. Convers�o imposs�vel
		smartphone2 = tablet2;
		
		//g. Convers�o impl�cita
		equipamento = (Equipamento) tablet;
		
		//h. Convers�o impl�cita
		movel = (Movel) tablet;
		
		//i. Convers�o impl�cita
		tablet = (EquipamentoEletronico) equipamento;
		
	}

}
