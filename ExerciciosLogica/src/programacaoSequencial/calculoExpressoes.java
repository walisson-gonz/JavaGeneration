package programacaoSequencial;
	// Exercicio 4 - 
import java.util.Scanner;

public class calculoExpressoes {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);		
		System.out.println("Digite o valor de a: ");
		int a = ler.nextInt();	

		System.out.println("Digite o valor de b: ");
		int b = ler.nextInt();
	
		System.out.println("Digite o valor de c: ");
		int c = ler.nextInt();
			
		double r = ((a + b) ^ 2 );
		double s = ((b + c) ^ 2 );
		double d = (r + s / 2);
		
		System.out.println("O resultado da expressão é: " + d);
		
		ler.close();
	}
}