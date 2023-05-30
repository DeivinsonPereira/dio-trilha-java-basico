package com.colecao.exercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DesafioMap {

	public static void main(String[] args) {
		
		int quantidadeLancamentos = 100;
		
		List<Integer> valoresLancados = new ArrayList<>();
		
		Random geradorDeLancamento = new Random();
		
		for (int i = 0; i < quantidadeLancamentos; i++) {
			int number = geradorDeLancamento.nextInt(9) + 1;
			valoresLancados.add(number);
			
		}
		
		Map<Integer, Integer> lancamentos = new HashMap<>();
        for (Integer resultado : valoresLancados) {
            if (lancamentos.containsKey(resultado))
                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
            else lancamentos.put(resultado, 1);
        }  
       
        System.out.println("Valores " + " Quantidade de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
		
	}
}
