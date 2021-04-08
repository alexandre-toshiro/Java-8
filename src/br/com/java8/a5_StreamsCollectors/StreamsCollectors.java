package br.com.java8.a5_StreamsCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.java8.Curso;

public class StreamsCollectors {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 201));

		//cursos.stream().filter(c -> c.getAlunos() >= 200).findAny().ifPresent(c -> System.out.println(c.getNome()));

		// uma nova lista utilizando collect.
		
		cursos = cursos.stream()
		.filter(c -> c.getAlunos() >=100)
		.collect(Collectors.toList());// converte para lista, aqui de fato alteramos a coleção original.
		
		
		cursos.stream()
		.forEach(c -> System.out.println(c.getNome()));
	}

}
