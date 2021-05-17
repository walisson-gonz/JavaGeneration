package lacoDeRepeticao;
//Exercicio 3 

import java.util.Scanner;

public class relacaoDeIdade {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		int idade = 0;
		int maiores21 = 0;
		int menores50 = 0;
		
		System.out.println("Para encerrar a contagem, digite -99.\n");
		
		while(idade>-99) {
			System.out.println(" Insira sua idade: ");
			idade = ler.nextInt();
			
			
		
			if(idade<21){
				maiores21++;	
			}
			
			else if(idade>50){
				menores50++;
			}
		}
		System.out.println("Pessoas com menos de 21 anos: " + maiores21 + "\nE maiores de 50 anos: " + menores50);
		
		ler.close();
			

	}

}