package programacaoSequencial;
/* Exercicio 2 - Faça um sistema que leia a idade de uma 
pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
*/
import java.util.Scanner;
	
public class leituraDeIdade2 {

	public static void main(String[] args) {
		
		int dias, meses, anos;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		anos = dias/365;
		meses = (dias%365)/30;
		dias = (dias%365)%30;
		
		System.out.println("você tem " + anos + " anos e " +meses+ " meses e "+dias+" dias.");
		
		ler.close();
		
	}

}
