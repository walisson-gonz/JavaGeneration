package lacoDeDecisao;
//Exercicio 1 - Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
import java.util.Scanner;

public class maiorInteiro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, maior;
		
		System.out.println("insira o valor de a: ");
		a = ler.nextInt();
		maior = a;
		
		
		System.out.println("insira o valor de b: ");
		b = ler.nextInt();
		
		System.out.println("insira o valor de c: ");
		c = ler.nextInt();
	
		if(b > maior) {
			maior = b;
		}
		if(c > maior) {
			maior = c;
		}
	System.out.println("o Maior inteiro �: "+ maior);
	
	ler.close();
	}
}
