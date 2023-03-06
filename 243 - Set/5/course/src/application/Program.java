package application;

import java.util.LinkedHashSet;
import java.util.Set;

//criando a class program
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("notebook");
		set.add("tablet");
		
		//removendo o tablet do conjunto, apenas os q satisfazem o predicado
		//de TER no MINIMO 3 CARACTERES na PALAVRA
		set.removeIf(x -> x.length() >=3);

		//percorrendo o SET/conjunto e imprimindo elementos por elementos
		for(String p : set) {
			System.out.println(p);
		}
	}

}
