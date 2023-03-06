package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

//criando a class program
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criando 2 conjuntos do tipo TreeSet ambos com LISTA de valores NUMERICOS
		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 7, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));		

		//union -> criando um CONJUNTO C... Q recebe os dados do CONJUNTO A + CONJUNTO B
			//o conjunto C é uma COPIA do conjunto A... ai dps nos ADD os dados do con
			//junto B no conjunto C... desta forma unimos C = A + B :)
		Set<Integer> c = new TreeSet<>(a);
		c.retainAll(b);
		System.out.println(c);
		
		//intersection
			//o CONJUNTO D recebe uma COPIA do CONJUNTO A...
		Set<Integer> d = new TreeSet<>(a);
		//Dps nos pegamos APENAS o q ta no CONJUNTO D e TAMBEM tem no CONJUNTO B
		d.retainAll(b);
		//e exibimos
		System.out.println(d);
		
		
		//difference
			//CONJUNTO E recebe uma COPIA do CONJUNTO A
		Set<Integer> e = new TreeSet<>(a);
		//depois nos vamos PEGAR TUDO q esta no CONJUTO E e TBM esta no CONJUNTO B
		//e remover... Ficando assim no CONJUNTO E apenas os valores UNICOS
		e.removeAll(b);
		System.out.println(e);
	}
}
