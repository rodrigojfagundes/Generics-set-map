package application;

import entities.Client;

public class Program {
	public static void main(String[] args) {
		
		Client c1 = new Client("maria", "maria@gmail.com");
		Client c2 = new Client("alex", "alex@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());

		System.out.println(c1.equals(c2));
		
		//verificando se o OBJETO/VARIAVEL c1 é == ao objeto c2...
		//da FALSE... pois NAO VAI COMPRAR O CONTEUDO MAS SIM A REFENCIA DE MEMORIA
		//e OS 2 objetos cada um ta em uma posicao de memoria
		System.out.print(c1 == c2);
		
	}
}