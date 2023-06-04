package br.com.dio.java.io.IOcharacter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//Faça uma cópia do arquivo “recomendacoes.txt” e agora adicione 3 recomendações de livros.
public class TreinoExercicio3 {

	
	public static void copiarArquivo() throws IOException {
		File file = new File("Recomendacoescopiadas.txt");
		String nomeArquivo = file.getName();		
		BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
		String line = br.readLine();
		
		String copiaArquivo = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copia.txt");
		File fcopia = new File(copiaArquivo);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fcopia.getName()));
		
		while(line != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
			line = br.readLine();
		}
		
		System.out.printf("Arquivo \"%s\" Tamanho: %d bytes.\n", nomeArquivo, nomeArquivo.length());
		System.out.printf("Arquivo copia \"%s\" concluída com sucesso! Tamanho: %d bytes.\n", fcopia.getName(), fcopia.length());
		
		System.out.println("Digite o nome de 3 cidades");
		colocarInfoNoArquivo(fcopia.getName());
		
		System.out.printf("Arquivo copia \"%s\" concluída com sucesso! Tamanho: %d bytes.\n", fcopia.getName(), fcopia.length());
		
		br.close();
		bw.close();
	}
	
	public static void colocarInfoNoArquivo(String arquivo) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
		while(!line.equalsIgnoreCase("Fim")) {
			bw.write(line);
			bw.newLine();
			bw.flush();
			line = br.readLine();
		}
		
		bw.close();
		br.close();
	}
	
	public static void main(String[] args) throws IOException {
		copiarArquivo();
	}
}
