package com.colecao.exercicios;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExerciciosMap {

	public static void main(String[] args) {
		
		System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos:");
		System.out.println();
		
		Map<String, Double> carrosPopulares = new HashMap<>();
		carrosPopulares.put("gol", 14.4);
		carrosPopulares.put("uno", 15.6);
		carrosPopulares.put("mobi", 16.1);
		carrosPopulares.put("hb20", 14.5);
		carrosPopulares.put("kwid", 15.6);
		
		System.out.println(carrosPopulares );
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();

		System.out.println("Substitua o consumo do gol por 15,2 km/l:");
		System.out.println();
		
		carrosPopulares.replace("gol", 15.2);
		// ou carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("Confira se o modelo tucson está no dicionário: ");
		System.out.println();
		
		System.out.println("Contém tucson: " + carrosPopulares.containsKey("tucson"));
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("Exiba o consumo do uno: ");
		System.out.println();
		
		System.out.println("Consumo do Uno: " + carrosPopulares.get("uno") + "km/l");
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("Exiba o terceiro elemento adicionado: ");
		System.out.println();
		System.out.println("Não é possível, pois, o map não tem essa função");
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("Exiba os modelos:");
		System.out.println();
		System.out.println("Modelos: " + carrosPopulares.keySet());
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("Exiba o consumo dos carros: ");
		System.out.println();
		System.out.println("Consumo dos carros: " + carrosPopulares.values());
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("Exiba o modelo mais econômico e seu consumo: ");
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";
		
		for (Map.Entry<String, Double> entry : entries) {
			if(entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais eficiente " + modeloMaisEficiente + " - " + consumoMaisEficiente);
			}
		}
		
		carrosPopulares.entrySet();
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("Exiba o modelo menos econômico e seu consumo: ");
		System.out.println();
		
		double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		String modeloMenosEconomico = "";
		
		for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if(entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEconomico = entry.getKey();
				System.out.println("Modelo menos eficiente: " + modeloMenosEconomico + " - " + consumoMenosEficiente);
			}
		}
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("Exiba a soma dos consumos: ");
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println("Soma: " + soma);
		
		System.out.println("Exibas a média dos consumos deste dicionário de carros: ");
		System.out.println();
		
		System.out.println("Média: " + soma / carrosPopulares.size());
		
		System.out.println("Remova os modelos com o consumo igual a 15,6 km/L: ");
		System.out.println();
		Iterator<Double> iterator2 = carrosPopulares.values().iterator();
		while(iterator2.hasNext()) {
			if(iterator2.next().equals(15.6)) {
				iterator2.remove();
			}
		}
		System.out.println(carrosPopulares);
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("Exiba todos os carros na ordem em que foram informados: ");
		System.out.println();
		
		Map<String, Double> carrosPopulares2 = new LinkedHashMap<>();
		carrosPopulares2.put("gol", 14.4);
		carrosPopulares2.put("uno", 15.6);
		carrosPopulares2.put("mobi", 16.1);
		carrosPopulares2.put("hb20", 14.5);
		carrosPopulares2.put("kwid", 15.6);
		
		System.out.println(carrosPopulares2);
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("Exiba o dicionário ordenado pelo modelo: ");
		System.out.println();
		
		Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
		System.out.println(carrosPopulares3);
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("Apague o dicionário de carros: ");
		System.out.println();
		
		carrosPopulares3.clear();
		System.out.print(carrosPopulares3);
		System.out.println();
		
		System.out.println();
		System.out.println("--------------");
		System.out.println();
		
		System.out.println("Confira se a lista está vazia: ");
		System.out.println();
		
		System.out.println("Lista está vazia: " + carrosPopulares3.isEmpty());
	}
}
