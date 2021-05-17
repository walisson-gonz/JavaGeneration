package exercicio1;

public class patinete {
	private String marca;
	private String modelo;
	private String eletronico;
	private int preco;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getEletronico() {
		return eletronico;
	}
	public void setEletronico(String eletronico) {
		this.eletronico = eletronico;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	void id() {
		System.out.println("===============================");
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Preço: " + preco + " reais");
		System.out.println("É um patinete eletrônico?: " + eletronico);
		System.out.println("===============================");
	}
	
	void eletronico (String eletronico) {
		if(eletronico =="Sim" || eletronico == "sim") {
			System.out.println("Esse patinete é eletrônico");
		} else {
			System.out.println("Esse patinete não é eletrônico.");
		}
	}
	

}
