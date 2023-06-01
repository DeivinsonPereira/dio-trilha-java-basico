package com.colecao.desafio_POO_DIO.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Descricao curso java");
		curso1.setCarcaHoraria(8);

		Curso curso2 = new Curso();
		curso2.setTitulo("JS");
		curso2.setDescricao("Descrição curso JavaScript");
		curso2.setCarcaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Java");
		mentoria.setDescricao("Descrição curso Java");
		mentoria.setData(LocalDate.now());

	/*	System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
	*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devDeivinson = new Dev();
		devDeivinson.setNome("Deivinson");
		devDeivinson.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + devDeivinson.getConteudosInscritos());
		
		devDeivinson.progredir();
		devDeivinson.progredir();
		System.out.println("---");
		System.out.println("Conteúdos Inscritos: " + devDeivinson.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: " + devDeivinson.getConteudosConcluidos());
		System.out.println("XP: " + devDeivinson.calcularTotalXp());
		System.out.println("--------------");
		
		Dev devGabriela = new Dev();
		devGabriela.setNome("Gabriela");
		devGabriela.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos: " + devGabriela.getConteudosInscritos());
		
		devGabriela.progredir();
		devGabriela.progredir();
		devGabriela.progredir();
		
		System.out.println("---");
		System.out.println("Conteúdos Inscritos: " + devGabriela.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos: " + devDeivinson.getConteudosConcluidos());
		System.out.println("XP: " + devGabriela.calcularTotalXp());
		
	}

}
