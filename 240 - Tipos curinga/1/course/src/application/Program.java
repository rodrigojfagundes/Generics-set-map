// USANDO GENERICS DELIMITADOS PARA ENCONTRAR O MAIOR NUMERO DENTRE UM CONJUNTO
//DE NUMEROS INTEIROS

package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//OBS: A o OBJECT é a SUPER CLASSE de INTEGER(e de varios outros tipos tbm)
		//MAS a LIST DE OBJECT nao pode HERDAR algo de INTEGER...
		//
			//List<Object> myObjs = new ArrayList<Object>();
			//List<Integer> myNumbers = new ArrayList<Integer>();
			//myObjs = myNumbers;
		
			//MAS NO EXEMPLO A BAIXO FUNCIONA, POIS O OBJECT OBJ ELE PODE HERDAR VALORES
			//DE INTEGER NO CASO, HERDOU O VALOR 10 Q TA NO X
			//ISSO ACONTECE PQ NAAAOO É UM LIST
		//Object obj;
		//Integer x = 10;
		//obj = x;
		
		
		//JA NO EXEMPLO A BAIXO UTILIZANDO O (????) NO LUGAR DE OBJECT
		//A LISTA (????) E A SUPER CLASSE DE TODOS OS OUTROS TIPOS DE LISTAS
		//DE OBJETOS
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
		
	 		
	}

}
