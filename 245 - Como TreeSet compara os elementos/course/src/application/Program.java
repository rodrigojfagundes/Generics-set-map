package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Product> set = new TreeSet<>();

		set.add(new Product("tv", 900.0));
		set.add(new Product("notebook", 1200.0));
		set.add(new Product("tablet", 400.0));
		
		//percorrendo o conjunto e imprimindo os produtos q estao dentro deles
		for(Product p : set) {
			System.out.println(p);
		}
		
	}
}
