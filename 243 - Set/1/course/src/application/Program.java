package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Set<String> set = new HashSet<>();
		
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
