package herançaDeClasse;

public class cachorro extends animal{
	
	String habi = "correr";

	public String getHabi() {
		return habi;
	}

	public void setHabi(String habi) {
		this.habi = habi;
	}	
	
	void emitirSom() {
		System.out.println("O cachorro faz: RUF RUF RUF");
	}
}
