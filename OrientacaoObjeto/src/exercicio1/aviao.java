package exercicio1;

import java.util.Scanner;

public class aviao {
	
	private String modelo, ano, cor;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	void entrada() {
		Scanner ler = new Scanner(System.in);
		
		 
		 System.out.println("Digite o modelo do avi�o: ");
		 modelo = ler.nextLine();
		
		 System.out.println("Digite o Ano de fabrica��o do avi�o: ");
		 ano = ler.nextLine();
		 
		 System.out.println("Digite a cor do avi�o: ");
		 cor = ler.nextLine();
		 
		 ler.close();
	}	
		
	void tela(){
		System.out.println("O modelo do avi�o �: " + modelo+ "\n" + "Seu ano de fabrica��o �: " + ano + "\n"+
	"E sua cor �: " + cor);
	}
}	
