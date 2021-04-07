package br.com.java8.a2_Lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambdas {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("alura online");
		palavras.add("editora cada do c�digo");
		palavras.add("caelum");

		Comparator<String> comparador = new ComparadorPorTamanho();
		palavras.sort(comparador);
		System.out.println(palavras);
		
		
	
	// 1 - Se o m�todo foreach recebe APENAS um consumer, ent�o � �bvio que dentro dele estara um consumer.
	// 2 - E se esse consumer possui APENAS um m�todo, � �bvio que esse m�todo que ser� chamado.
	// 3 - Ent�o a partir disso o java disponibilizou o novo recurso chamado lambda.
	// 4 - Onde n�o ser� necess�rio explicitar o consumer nem o seu m�todo, dando um "new", por ex.
		palavras.forEach(s -> System.out.println(s));	
	// 5 - O s�mbolo que indica uma lambda � a setinha "->"
	// 6 - Podemos simplificar as lambdas. por algumas coisas que ja s�o �bvias	
	// 7 - A lista � apenas de strings, ent�o n�o precisamos declarar que o "s" � do tipo String.
	// 8 - Como � apenas um retorno n�o precisamos utilizar a palavra "return", tamb�m n�o � preciso usar chaves.
	// 9 - Claro que dependendo da ocasi�o ser� melhor/necess�rio, deixar o c�digo mais expl�cito, podemos fazer essa simplifica��o.
		
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