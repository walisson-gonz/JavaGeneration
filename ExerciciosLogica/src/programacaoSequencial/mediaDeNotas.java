package programacaoSequencial;
	/*Exercicio 5 - Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	 aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.
	 */
import java.util.Scanner;

public class mediaDeNotas {
	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		nota1 = ler.nextDouble();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = ler.nextDouble();
		
		System.out.println("Insira a terceira nota ");
		nota3 = ler.nextDouble();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("A m�dia � " + media);
		
		ler.close();

	}

}
