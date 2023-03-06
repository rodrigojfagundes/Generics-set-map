package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		PrintService ps = new PrintService();
		
		
		//perguntando quantos valores vao ser testados
		System.out.print("how many values? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
		
			int value = sc.nextInt();
		
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("first: " + ps.first());
		
		sc.close();
		
	}

}
