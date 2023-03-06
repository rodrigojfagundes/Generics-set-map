package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter file full path: ");
		String path = sc.nextLine();
		
		//abrindo o arquivo q ta no caminho passado acima
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			//criando um SET/conjunto do tipo da CLASSE LOGENTRY
			Set<LogEntry> set = new HashSet<>();
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				set.add(new LogEntry(username, moment));
				//lendo a proxima linha
				line = br.readLine();
				
			}
			
			System.out.println("total user" + set.size());
			
		} catch(IOException e){
			System.out.println("error: " + e.getMessage());
		}
		
	}
}
