package com.ferragnez.party;
import java.util.Scanner;

public class CheckGuest {
	public static void main(String[] args) {
		String[] invitatiFesta = {"Dua Lipa" ,"Paris Hilton" ,"Manuel Agnelli" ,"J-Ax" ,"Francesco Totti" ,"Ilary Blasi" ,"Bebe Vio" ,"Luis" ,"Pardis Zarei" ,"Martina Maccherone" ,"Rachel Zeilic"};
		
		System.out.print("Digiti il suo nome per favore: ");
		Scanner scanner = new Scanner(System.in);
		String nome = scanner.nextLine();
		System.out.println("Controllo che " + nome + " sia in lista, mi dia un secondo");
		
		//Procedimento con for
		
		/*for (int i = 0; i < invitatiFesta.length; i++) {
			if (nome.equals(invitatiFesta[i])) {
				System.out.println("Lei è nella lista " + nome + ", prego si accomodi");
				break;
			} else if (i == invitatiFesta.length-1) {
				System.out.println("Le consiglio di andarsene prima che chiamo la sicurezza");
				}
		*/	
		
		//Procedimento con while
		int counter = 0;
		while(counter < invitatiFesta.length) {
			
			if (nome.equals(invitatiFesta[counter])) {
				System.out.println("Lei è nella lista " + nome + ", prego si accomodi");
				break;
			} else if (counter == invitatiFesta.length-1) {
				System.out.println("Le consiglio di andarsene prima che chiamo la sicurezza");
				
			}
			
			counter++;
		}
		
		
		scanner.close();
	}

}
