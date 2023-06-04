package br.com.dio.java.io.IOcharacter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Exercicio3IOCaracter {

	public static void copiarArquivo() throws IOException {
		File file = new File("recomendacoes.txt");
		String nomeArquivo = file.getName();
		
		/*Reader r = new FileReader(nomeArquivo);
		BufferedReader br = new BufferedReader(r);*/
		
		BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
		String line = br.readLine();
		String nomeArquivoCopia = nomeArquivo.substring(0, nomeArquivo.indexOf(".")).concat("-copy.txt");
		
		File fcopy = new File(nomeArquivoCopia);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));
		
		
		while(!(line == null)) {
			bw.write(line);
			bw.newLine();
			bw.flush();
			line = br.readLine();
		}
		
		System.out.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho: '%d' bytes.", file.getName(), file.length());
		System.out.printf("\nArquivo \"%s\" copiado com sucesso! Com o tamanho: '%d' bytes.", fcopy.getName(), fcopy.length());
		
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("\nRecomende 3 Jogos:  ");
		pw.flush();
		
		adicionarInfoNoArquivo(fcopy.getName());
		
		pw.printf("Arquivo \"%s\" copiado com sucesso! Com o tamanho: '%d' bytes.", fcopy.getName(), fcopy.length());
		
		br.close();
		bw.close();
		pw.close();
	}
	
	public static void adicionarInfoNoArquivo(String arquivo) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
		
		while(!line.equalsIgnoreCase("Fim")) {
			bw.write(line);
			bw.newLine();
			
			line = br.readLine();
		}
		bw.flush();
		
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws IOException {
		copiarArquivo();
	}
}
