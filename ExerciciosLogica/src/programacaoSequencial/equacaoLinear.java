package programacaoSequencial;
	
// Exercicio 7 
	 
import java.util.Scanner;
	
public class equacaoLinear {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, j, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = ler.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = ler.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = ler.nextDouble();
		
		System.out.println("Digite o valor de J: ");
		j = ler.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = ler.nextDouble();
				
		x = ((c*j) - (b*f)) / ((a*j) - (b*d));
		y = ((a*f) - (c*d)) / ((a*j) - (b*d));
		
		System.out.println("O valor de x é: "+ x +" e y é: "+y);
		
		ler.close();
	}

}
