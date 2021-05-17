package herançaDeClasse;

public class cavalo extends animal{
	
	String habi = "galope";

	public String getHabi() {
		return habi;
	}

	public void setHabi(String habi) {
		this.habi = habi;
	}
	
	void emitirSom() {
		System.out.println("O cavalo faz: Hiin in in");
	}

}
