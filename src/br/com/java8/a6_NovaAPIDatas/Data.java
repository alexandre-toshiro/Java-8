package br.com.java8.a6_NovaAPIDatas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Data {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		// Calculo de datas

		LocalDate olimpiadas = LocalDate.of(2024, Month.APRIL, 5);

		int anos = olimpiadas.getYear() - hoje.getYear();
		System.out.println(anos);

		Period periodo = Period.between(hoje, olimpiadas);
		System.out.println(periodo.getDays());

	}

}
