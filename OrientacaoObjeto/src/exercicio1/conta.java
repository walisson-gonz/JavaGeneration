package exercicio1;

import java.util.Scanner;

public class conta {
	private String nome, agencia, conta, pix;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getPix() {
		return pix;
	}

	public void setPix(String pix) {
		this.pix = pix;
	}

	void scan() {

	Scanner ler = new Scanner(System.in);

		System.out.println("Informe o seu nome: ");
		nome = ler.nextLine();

		System.out.println("Digite o numero da sua Ag�ncia: ");
		agencia = ler.nextLine();

		System.out.println("Digite o n�mero de sua conta: ");
		conta = ler.nextLine();

		System.out.println("Digite sua chave Pix: ");
		pix = ler.nextLine();
		
		ler.close();
	}


	 void print() {
		 System.out.println("O seu nome �: " + nome + "\nSua ag�ncia � :" + 
	 agencia + "\nSua conta �:" + 
				 conta + "\nE sua chave PIX �: " + pix);


}
}