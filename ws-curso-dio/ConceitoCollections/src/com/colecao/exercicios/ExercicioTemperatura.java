package com.colecao.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioTemperatura {

	public static void main(String[] args) {
		
		List<Temperatura> temperatura = new ArrayList<>();
		
		
		temperatura.add(new Temperatura(23.5,"Janeiro"));
		temperatura.add(new Temperatura(28.5,"Fevereiro"));
		temperatura.add(new Temperatura(32.0,"Março"));
		temperatura.add(new Temperatura(35.2,"Abril"));
		temperatura.add(new Temperatura(24.7,"Maio"));
		temperatura.add(new Temperatura(22.8,"Junho"));
		
		Iterator<Temperatura> iterator = temperatura.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			double next = iterator.next().getTemperatura();
			soma += next; 
		}
		
		Double temperaturaMedia = soma / temperatura.size();
		System.out.println("Temperatura Média semestral: " + String.format("%.2f", temperaturaMedia));
		System.out.println();
		
		System.out.println("Meses em que a temperatura foi maior do que a média semestral:");
		for (Temperatura temp : temperatura) {
			if(temperaturaMedia < temp.getTemperatura()) {
				System.out.println(temp.getTemperatura() + " // " + temp.getMes());
			}
			
		}
	}
}

class Temperatura{
	
	private double temperatura;
	private String mes;
	
	public Temperatura(double temperatura, String mes) {
		this.temperatura = temperatura;
		this.mes = mes;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	@Override
	public String toString() {
		return "Temperatura: " + temperatura + ", Mês: " + mes;
	}

}