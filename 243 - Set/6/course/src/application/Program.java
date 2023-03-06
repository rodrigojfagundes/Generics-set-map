package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando um SET/conjunto utilizando a IMPLEMENTACAO LinkedHashSet...
		//o LinkedHashSet mantem os dados ORDENADOS... na sequencia q foi colocado
		Set<String> set = new LinkedHashSet<>();
		
		//add 3 elementos no SET de tipo STRING
		set.add("t");
		set.add("notebook");
		set.add("tablet");
		
		
		//remover qm a primeira letra for igual a T
		set.removeIf(x -> x.charAt(0) == 't');

		for(String p : set) {
			System.out.println(p);
		}
	}

}
