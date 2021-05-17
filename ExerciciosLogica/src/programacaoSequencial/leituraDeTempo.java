package programacaoSequencial;
/* Exercicio 3 - Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/
import java.util.Scanner;

public class leituraDeTempo {
	
	public static void main(String[] args) {
		
		int horas, minutos, segundos, seg;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a duração do evento em segundos: ");
		segundos = ler.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		seg = (segundos%3600)%60;
		
		System.out.println("A duração do evento foi de "+horas+" horas " +
		minutos+" minutos "+seg+" segundos");
		
		ler.close();
	}

}
