package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//instanciando um PRINTSERVICE do tipo INTEGER chamado de PS
		//ou SEJA o PS só ira receber valores do tipo INTEGER, EMBORA o PRINTSERVICE
		//seja GENERIC e portanto o PRINTSERVICE recebe QUALQUER tipo de VALOR
		//mas o PS é INTEGER entao só podemos usar ele para trabalhar com NUMEROS
		//
		//PrintService<Integer> ps = new PrintService<>();

		PrintService<String> ps = new PrintService<>();
		
		System.out.print("how many values? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
		
			String value = sc.next();
		
			ps.addValue(value);
		}
		
		//chamando o metodo PRINT do PS... para imprimir os valores
		ps.print();
		
		String x = ps.first();
		System.out.println("first: " + x);
		
		sc.close();
		
	}

}
