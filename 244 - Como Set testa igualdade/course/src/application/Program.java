package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("tv", 900.0));
		
		set.add(new Product("notebook", 1200.0));
		
		set.add(new Product("tablet", 400.0));
		
		Product prod = new Product("notebook", 1200.0);
		
		//agora vamos verificar se no conjunto contem um PRODUTO PROD (o q foi criado
		//ali em cima)
		
	
		System.out.println(set.contains(prod));
		
		
		
	}
}
