package vetoresMatrix;
// exercicio 3 - Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

import java.util.Scanner;

public class leituraMatrix {
public static void main(String[] args) {
		
		
		
		int[][] numero = new int[3][3];
		int cont=0, l=0, c=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite os n�meros: ");
		
		for(l=0; l<3; l++) {
			for( c=0; c<3; c++) {
				numero[l][c] = ler.nextInt();
			}
		}
		System.out.println("Os n�meros maiores que 10 s�o: ");
		
		for(l=0; l<3; l++) {
			for( c=0; c<3; c++) {
				if(numero[l][c]>=10) {
					cont++;
					System.out.println(numero[l][c]);
				}
			}
		}
		System.out.println("A quantidade de n�meros maiores que 10 � de " + cont);
	}
}
