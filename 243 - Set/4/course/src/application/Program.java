package application;

import java.util.LinkedHashSet;
import java.util.Set;

//criando a class program
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando um SET/conjunto utilizando a IMPLEMENTACAO LinkedHashSet...
		//o LinkedHashSet mantem os dados ORDENADOS... na sequencia q foi colocado
		Set<String> set = new LinkedHashSet<>();
		

		set.add("TV");
		set.add("notebook");
		set.add("tablet");
		
		//removendo o tablet do conjunto
		set.remove("tablet");

		for(String p : set) {
			System.out.println(p);
		}
	}

}
