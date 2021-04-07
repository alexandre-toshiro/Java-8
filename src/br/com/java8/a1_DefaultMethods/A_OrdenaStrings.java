package br.com.java8.a1_DefaultMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A_OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();

		palavras.add("alura online");
		palavras.add("editora cada do c�digo");
		palavras.add("caelum");

		Comparator<String> comparador = new ComparadorPorTamanho();
		//Collections.sort(palavras, comparador);
		palavras.sort(comparador);
		System.out.println(palavras);
				
		/*
		 * O m�todo sort e o m�todo foreach, s�o exemplo de defaut methods
		 * que � um recurso que foi implementado no Java 8, no qual permite que interfaces
		 * implementem m�todos concretos(que possuem corpo e n�o s� a assinatura)
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
