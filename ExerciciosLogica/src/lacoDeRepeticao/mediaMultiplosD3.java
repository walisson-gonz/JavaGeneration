package lacoDeRepeticao;

import java.util.Scanner;

//Exercicio 6

public class mediaMultiplosD3 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, quantidade = 0, soma = 0, media;
		
		System.out.println("Caso deseje parar, digite 0.\n");
		
		do {
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
			
			if (num % 3 == 0 && num != 0){
				
				soma = soma + num;
				quantidade++;	
			}
			
		}
		
		while(num != 0);
		
		media = soma/quantidade;
		System.out.println("A media dos números inseridos multiplos de 3 é de: " + media);
		
		ler.close();
		             	
	}

}