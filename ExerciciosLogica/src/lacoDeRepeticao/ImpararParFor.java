package lacoDeRepeticao;
//Exercicio 2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares.
import java.util.Scanner;

public class ImpararParFor {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int contador, numero, par=0, impar=0;
		
		for(contador=0; contador<10; contador++) {
			System.out.println("Insira seu número: ");
			numero = ler.nextInt();
			
			if(numero%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("O número de números pares é: " + par);
		System.out.println("O número de números impares é: " + impar);
		
	}
}




