package br.com.dio.java.io.IOBytes.IOData;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
 * Crie um arquivo "peca-de-roupa.bin" e armazene:
 * 1. Nome do Produto, tamanho (P/M/G/U), quantidade e preço.
 * 2. Leia este arquivo e imprima no console.	
 */
public class ExemploIOData {

	
	public static void incluirProduto() throws IOException {
		File file = new File("C:/projetos/dio-trilha-java-basico/ws-curso-dio/ArquivosInputOutput/src/br/com/dio/java/io/IOBytes/IOData/peca-de-roupa.bin");
		
		/*OutputStream os = new FileOutputStream(file.getPath());
		DataOutputStream dos = new DataOutputStream(os);*/
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(file.getPath()));
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o nome do produto: ");
		String nomeProd = sc.nextLine();
		dos.writeUTF(nomeProd);
		
		System.out.println("Digite o Tamanho (P/M/G/U): ");
		char tamanhoProd = sc.next().charAt(0);
		dos.writeChar(tamanhoProd);
		
		System.out.println("Digite a quantidade: ");
		int quantidadeProd = sc.nextInt();
		dos.writeInt(quantidadeProd);
		
		System.out.println("Digite o preço: ");
		double precoProd = sc.nextDouble();
		dos.writeDouble(precoProd);
		
		
		System.out.printf("O arquivo %s foi criado com %d bytes no diretório '%s'.\n",
				file.getName(), file.length(), file.getPath());
		
		LerProduto(file.getPath());
	
		dos.close();
		sc.close();
	}
	
	public static void LerProduto(String caminhoArquivo) throws IOException {
		File f = new File(caminhoArquivo);
		
		/*InputStream is = new FileInputStream(f.getPath());
		DataInputStream dis = new DataInputStream(is);*/
		DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));
		
		String nome = dis.readUTF();
		char tamanho = dis.readChar();
		int quantidade = dis.readInt();
		double preco = dis.readDouble();
		
		
		System.out.printf("\nNome........................: %s\n",nome);
		System.out.printf("Tamanho.....................: %s\n",tamanho);
		System.out.printf("Quantidade..................: %s\n",quantidade);
		System.out.printf("Preço.......................: %s\n",String.format("%.2f", preco));
		System.out.print("Total do Valor das Peças: " + preco * quantidade);
		
		dis.close();
	}
	
	public static void main(String[] args) throws IOException {

		incluirProduto();
	}
}
