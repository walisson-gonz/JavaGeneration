package lacoDeRepeticao;

import java.util.Scanner;

//Exercicio 5

public class somaDasEntradas {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num, soma = 0;
		
		System.out.println("Caso deseje parar, digite 0.\n");
		
		do {
			System.out.println("Digite um número:");
			num = ler.nextInt();
			soma += num;	
		}
		
		while(num != 0);
	
		System.out.println("A soma dos números inseridos é: " + soma);
		
		ler.close();
		
	}
	
}
