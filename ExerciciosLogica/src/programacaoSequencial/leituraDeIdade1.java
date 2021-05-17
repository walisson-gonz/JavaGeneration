package programacaoSequencial;
/* Exercicio 1 - Faça um sistema que leia a idade de uma pessoa
 * expressa em anos, meses e dias e mostre-a expressa apenas em dias.
*/
import java.util.Scanner;
	
public class leituraDeIdade1 {

	public static void main(String[] args) {
		
		int diasAnos=365, diasMes=30;
		int dias, meses, anos, bi, diasTotais;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe quantos anos, meses e dias você tem!");
		System.out.println("\nAnos: ");
		anos = ler.nextInt();
		
		System.out.println("Meses: ");
		meses = ler.nextInt();
		
		System.out.println("Dias: ");
		dias = ler.nextInt();
		
		bi = anos/4;
		diasTotais = bi + (anos * diasAnos) + (meses * diasMes) + dias;
		System.out.println("Você viveu dias " + diasTotais + " ate agora!");
		
		ler.close();
		

	}

}
