package br.com.dio.java.io.IOBytes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Faça uma cópia do arquivo "recomendacoes-copy.txt".
public class ExemploIOBytes {
	
	public static void copiarArquivo() throws IOException {
		File file = new File("recomendacoes-copia.txt");
		String nomeArquivo = file.getName();
		
		/*InputStream is = new FileInputStream(nomeArquivo);
		BufferedInputStream bis = new BufferedInputStream(is);*/
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nomeArquivo));
		
		String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("-copy2.txt");
		File fcopy = new File(nomeArquivoCopy);
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopy));
		
		
		int line = 0;
		while((line = bis.read()) != -1) { 
			bos.write((char)line);
			bos.flush();
		}
		System.out.printf("Arquivo \"%s\" copiado com sucesso e está no diretório %s com %d bytes. ",
				fcopy.getName(), fcopy.getPath(), fcopy.length());
		
		bis.close();
		bos.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		
		copiarArquivo();
		
	}
	
}
