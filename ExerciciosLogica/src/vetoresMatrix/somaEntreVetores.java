package vetoresMatrix;
//Exercicio 1 - 

public class somaEntreVetores {

	public static void main(String[] args) {
		
		int[] a = new int[6];
		int soma;
		
		a [0] = 1;
		a [1] = 0;
		a [2] = 5;
		a [3] = -2;
		a [4] = 100;
		a [5] = 7;
		
		soma = a[0] + a[1] + a[5];
		
		System.out.println("A soma dos Vetores na posição 0, 1, e 5 é: " + soma);
		System.out.println("\nOs valores dentro dos vetores são: " + "\n" + a[0]+ "\n" 
	                       + a[1]+ "\n" + a[2]+ "\n" + a[3]+ "\n" + a[4]+ "\n" + a[5]);
	
	}
}
