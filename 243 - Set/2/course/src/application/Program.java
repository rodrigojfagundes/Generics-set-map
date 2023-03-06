package application;

import java.util.Set;
import java.util.TreeSet;

//criando a class program
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando um SET/conjunto utilizando a IMPLEMENTACAO TREESET...
		//o TREESET mantem os dados ORDENADOS... na sequencia q foi colocado
		Set<String> set = new TreeSet<>();
		
		//add 3 elementos no SET de tipo STRING
		set.add("TV");
		set.add("notebook");
		set.add("tablet");
		
		//verificando se no SET/conjunto existe o NOTEBOOK
		System.out.println(set.contains("notebook"));
		
		//percorrendo o SET/conjunto e imprimindo elementos por elementos
		for(String p : set) {
			System.out.println(p);
		}
	}

}
