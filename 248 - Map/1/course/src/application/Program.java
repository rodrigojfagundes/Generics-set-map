package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {


		Map<String, String> cookies = new TreeMap<>();
		
		//inserindo VALORES, para isso vamos precisar informar a
		//CHAVE"username" e dps o VALOR"Maria"
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		//informando uma CHAVE para removermos do MAP COOKIE
		cookies.remove("email");
		
		
		System.out.println("all cookies");
		
		for(String key : cookies.keySet()){
			System.out.println(key + ": " + cookies.get(key));
		}
		
	}
}
