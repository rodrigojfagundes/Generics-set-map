package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);

		//criando uma LISTA de QUALQUER TIPO Q SEJA SUBTIPO DE NUMBER... ex INT, INTEGER
		//DOUBLE, etc... e vamos fazer essa variavel/lista LIST receber o LIST INT
		//q é uma lista de INTEGER... Ou seja estmaos fazendo uma variavel do tipo
		//MAIS GENERICO (NUMBER) receber uma de um tipo MAIS ESPECIFICO (INTEGER)
		//e até ai tudo ok :)
		List<? extends Number> list = intList;
		
		//podemos pegar elementos com o GET
		Number x = list.get(0);
		
		//mas NAO CONSEGUIMOS ADD
		list.add(20);
		
	}
}