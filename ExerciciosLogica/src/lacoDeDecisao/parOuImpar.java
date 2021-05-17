package lacoDeDecisao;
//Exercicio 4 
import java.util.Scanner;

public class parOuImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numero;
		double raiz;
		double quadrado;
		
		System.out.println("Digite um número qualquer: ");
		numero=ler.nextInt();
		
		if(numero%2==0) {
			System.out.println("Par");
			raiz = Math.sqrt(numero);
			System.out.println(" Raiz do número é: "+raiz);
		}
		else if(numero%2==1){
			System.out.println("Impar");
			quadrado = Math.pow(numero, 2);
			System.out.println("O quadrado do número é: "+quadrado);
			
			ler.close();
		}

	}

}
