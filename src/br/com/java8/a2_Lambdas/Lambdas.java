package br.com.java8.a2_Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambdas {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("alura online");
		palavras.add("editora cada do código");
		palavras.add("caelum");

		Comparator<String> comparador = new ComparadorPorTamanho();
		palavras.sort(comparador);
		System.out.println(palavras);
		
		
	
	// 1 - Se o método foreach recebe APENAS um consumer, então é óbvio que dentro dele estara um consumer.
	// 2 - E se esse consumer possui APENAS um método, é óbvio que esse método que será chamado.
	// 3 - Então a partir disso o java disponibilizou o novo recurso chamado lambda.
	// 4 - Onde não será necessário explicitar o consumer nem o seu método, dando um "new", por ex.
		palavras.forEach(s -> System.out.println(s));	
	// 5 - O símbolo que indica uma lambda é a setinha "->"
	// 6 - Podemos simplificar as lambdas. por algumas coisas que ja são óbvias	
	// 7 - A lista é apenas de strings, então não precisamos declarar que o "s" é do tipo String.
	// 8 - Como é apenas um retorno não precisamos utilizar a palavra "return", também não é preciso usar chaves.
	// 9 - Claro que dependendo da ocasião será melhor/necessário, deixar o código mais explícito, podemos fazer essa simplificação.
		
	}

}


class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) {
			return -1;
		}
		if (s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}

}