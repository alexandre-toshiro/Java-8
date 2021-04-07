package br.com.java8.a3_MethodReferences;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class A3_MethodReferences {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("alura online");
		palavras.add("editora cada do código");
		palavras.add("caelum");
//
//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length()) {
//				return -1;
//			}
//			if (s1.length() > s2.length()) {
//				return 1;
//			}
//			return 0;
//
//		});

	//	palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		// Deixando esse código ainda mais curto
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		// Agora vamos desmembra-lo para melhor compreensão.
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador = Comparator.comparing(funcao);
		palavras.sort(comparador);
		
		// Agora iremos deixar o método ainda menor.(method reference)
		palavras.sort(Comparator.comparing(String::length));
		
		
		System.out.println(palavras);

	}

}
