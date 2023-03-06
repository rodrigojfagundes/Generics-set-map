package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("tv", 900.0);
		Product p2 = new Product("notebook", 1200.0);
		Product p3 = new Product("tablet", 400.0);
		
		//agora nos vamos ADD os PRODUTOS feito acima o P1, P2 e P3 no nosso MAP
		//de nome STOCK... E vamos por a QUANTIDADE de cada um desses produto p1, p2, p3
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		//vamos criar um novo PRODUTO, mas NAO VAMOS ADD ELE NO MAP STOCK
		Product ps = new Product("tv", 900.0);
		
		System.out.println("contains 'ps' key: " + stock.containsKey(ps));
		
	}
}
