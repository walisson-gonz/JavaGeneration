package herançaDeClasse;

public class preguica extends animal{
	
	String habi = "subir em árvores";

	public String getHabi() {
		return habi;
	}

	public void setHabi(String habi) {
		this.habi = habi;
	}
	
	void emitirSom() {
		System.out.println("O som da preguiça é: ué, ela ta dormindo... ");
	}

}
