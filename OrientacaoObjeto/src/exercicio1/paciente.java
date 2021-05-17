package exercicio1;

import java.util.Scanner;

public class paciente {
	private String nome, altura, peso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	void scan() {

		Scanner ler = new Scanner (System.in);

		System.out.println("Informe o nome do paciente: ");
		nome = ler.nextLine();

		System.out.println("Informe a altura do paciente: ");
		altura = ler.nextLine();

		System.out.println("Qual o peso do paciente? ");
		peso = ler.nextLine();
		
		ler.close();
	}

	void print() {

		System.out.println("O nome deste paciente é: " + nome + "\nA sua altura deste paciente é: : " + altura + "m" + 
		"\nE seu peso é: " + peso + "Kg");
	}
}