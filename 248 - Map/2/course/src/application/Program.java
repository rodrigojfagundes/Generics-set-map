package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "maria");
		
		cookies.put("email", "maria@gmail.com");
		
		cookies.put("phone", "99711122");
		
		cookies.remove("email");
		
		cookies.put("phone", "99771133");
		
		System.out.println("containes 'phone' key " + cookies.containsKey("phone"));
		
		
		System.out.println("phone number" + cookies.get("phone"));
		
		//tentar pegar um valor q nao existe
		System.out.println("email " + cookies.get("email"));
		
		//vendo o tamanho do map
		System.out.println("size" + cookies.size());
		
		
		//exibindo os dados cadastrados no MAP
		System.out.println("all cookies");
		//for para percorrer o MAP e dps imprimir os valores
		for(String key : cookies.keySet()){
			System.out.println(key + ": " + cookies.get(key));
		}
		
	}
}
