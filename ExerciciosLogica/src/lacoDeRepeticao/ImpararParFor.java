package lacoDeRepeticao;
//Exercicio 2 - Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
import java.util.Scanner;

public class ImpararParFor {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int contador, numero, par=0, impar=0;
		
		for(contador=0; contador<10; contador++) {
			System.out.println("Insira seu n�mero: ");
			numero = ler.nextInt();
			
			if(numero%2==0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("O n�mero de n�meros pares �: " + par);
		System.out.println("O n�mero de n�meros impares �: " + impar);
		
	}
}




