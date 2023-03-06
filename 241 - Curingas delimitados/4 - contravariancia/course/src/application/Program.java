package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		
		//criando uma LIST de OBJECTS... Como é uma lista de OBJECTS pode ser ADD
		//elementos/valores de QUALQUER TIPO... NUMEROS, BOOL, STRING, etc...
		List<Object> myObjs = new ArrayList<Object>();
		//e nela estamos add STRINGS, ou seja 2 nomes...
		myObjs.add("maria");
		myObjs.add("alex");
		
		//criando uma LISTA chamada MYNUMS que é do tipo QUALQUER TIPO SUPERCLASSE
		//DE NUMBER... Ou seja a UNICA classe que é SUPERCLASSE de NUMBER é o OBJECT
		//por isso que o MYNUMBS ele vai receber myOBJS ou seja OBJECT
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
		//mas nao podemos acessar os valores da lista...
		//isso acontece pois o valor q nos estamos lendo PODE SER um OBJECT
		//ou seja um SUPERTIPO de NUMBER... dai para previnir isso o compilador
		//da erro
		Number x = myNums.get(0);
	}
}