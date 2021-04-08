package br.com.java8.a4_streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.java8.Curso;

public class Streams {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));// compara baseado no n� de alunos
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		 //stream, seria algo como uma fluxo/corrente de objetos
		// � um m�todo que tem na cole��es e partir dele obtemos diversos novos recursos do java 8
		
		cursos.stream().filter(c -> c.getAlunos() >= 100);
		
		// Tudo que � feito no stream,n�o impacta diretamente a lista original do stream
		// Se fizermos a impress�o dos cursos agora, ter�amo o mesmo resultado de antes do stream
		// Ent�o o pr�prio stream possui o "foreach" e ali mesmo iremos fazer a impress�o com a modifica��o.
		
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.forEach(c -> System.out.println(c.getNome()));
		
		System.out.println("--------------------------------------------");
		
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.map(c -> c.getAlunos())
		.forEach(total -> System.out.println(total));
		
		System.out.println("--------------------------------------------");
		
		//https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html - documenta��o
		//m�todo mais usados:
		/*filter()
		 * map()
		 * findFirst()
		 * findAny()
		 * collect()
		 * forEach()
		 * */
		
	}

}
