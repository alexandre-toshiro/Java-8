package br.com.java8.a2_Lambdas;

import java.util.ArrayList;
import java.util.List;

public class Lambdas2 {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("alura online");
		palavras.add("editora cada do código");
		palavras.add("caelum");

		// Lambda referente a classe anonima utilizar na a1.
		// Nessa caso precisamos dos "()", pois é mais de um argumento.
		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length()) {
				return -1;
			}
			if (s1.length() > s2.length()) {
				return 1;
			}
			return 0;

		});
		
		// Simplificando mais ainda a lambda.
		// utilizando o método compare da Integer, que ja devolve -1,0 ou 1 comparando 
		// o tamanho das strings.
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		System.out.println(palavras);
		
		// Uma interface que possui apenas um método abstrato é agora conhecida como interface funcional
		// Para trabalhar com lambda uma interface funcional deve estar envolvida.
	}

}
