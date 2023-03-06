//
// COM O GENERIC PODEMOS PARAMETIZAR OS TIPOS E OS BENEFICIOS SAO O REUSO,
//TYPE SAFETY E PERFORMANCE... NO EXEMPLO A BAIXO TANTO PODEMOS USAR COM NUMEROS
// COM O INTEGER QUANTO COM PALAVRAS/NOMES COM O STRING
//





package services;

import java.util.ArrayList;
import java.util.List;

//classe PRINTSERVICE do TIPO T... Ou seja é um GENERICS
public class PrintService<T> {

	//lista do tipo T
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("list is empity");
		}

		return list.get(0);
	}
	public void print() {
		System.out.print("[");
	
		if(!list.isEmpty()) {
	
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
