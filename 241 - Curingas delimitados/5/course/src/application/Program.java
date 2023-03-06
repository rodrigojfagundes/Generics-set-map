package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//criando a class program
public class Program {
	public static void main(String[] args) {
		
		
		//algoritmo q tem uma FUNCAO COPY q recebe uma LISTA MAIS ESPECIFICA
		//e COPIA os valores dessa LISTA para um LISTA MAIS GENERICA
		//o MAIS GENERICO DE TODOS È O OBJS (OBJECT)
		//
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		
		//metodo para copiar a lista de INTEIROS para a lista de OBJS(OBJECTS)
		copy(myInts, myObjs);
		
		//chamando o metodo para imprimir
		printList(myObjs);
		
		//metodo para copiar a LISTA de DOUBLES para lista de OBJS (OBJECTS)
		copy(myDoubles, myObjs);
		
		//chamando o metodo para imprimir
		printList(myObjs);

	}
	

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}