package vetoresMatrix;
//exercicio 2
import java.util.*;

public class somaImparPar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random s = new Random();
		
		int par=0, somaPar=0, impar=0;
		
		int[] num = new int[6];
		
		for(int i = 0; i < num.length;i++) {
			num[i] = s.nextInt(21);		
			//System.out.println(num[i]); //--> numeros sorteados
	
		
		if(num[i]%2==0) {
			par++;
			somaPar += num[i];
		}
		
		if(num[i]%2 != 0) {
			impar++;
			
		}
	}
		System.out.println("Os números pares digitados: " );
		System.out.println("A soma dos numeros pares é: " + somaPar);
		System.out.println("Os números impares digitados: " );
		System.out.println("A quantidade de números impares: " + impar);
		ler.close();
	}

}
