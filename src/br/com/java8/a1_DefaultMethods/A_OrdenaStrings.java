package br.com.java8.a1_DefaultMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A_OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("alura online");
		palavras.add("editora cada do código");
		palavras.add("caelum");

		Comparator<String> comparador = new ComparadorPorTamanho();
		//Collections.sort(palavras, comparador);
		palavras.sort(comparador);
		System.out.println(palavras);
				
		/*
		 * O método sort e o método foreach, são exemplo de defaut methods
		 * que é um recurso que foi implementado no Java 8, no qual permite que interfaces
		 * implementem métodos concretos(que possuem corpo e não só a assinatura)
		 * 
		 * */
		
		

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
