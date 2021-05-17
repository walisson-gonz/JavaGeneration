package exercicio1;

import java.util.*;


public class eletronico {

	private String nome;
	private String descricao;
	private int valor;
	
	public eletronico(String nome, String descricao, int valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void cadastrarProduto() {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		setNome(ler.nextLine());
		
		System.out.println("Digite a descrição: ");
		setDescricao(ler.nextLine());
		
		System.out.println("Digite o valor: ");
		setValor(ler.nextInt());
		
		mostrarProdutos();
		ler.close();
	}
	
	public void mostrarProdutos() {
		
		System.out.println("Nome: " + nome); 
		System.out.println("Descrição: " + descricao); 
		System.out.println("Valor: " + valor); 
		
		
	}
}