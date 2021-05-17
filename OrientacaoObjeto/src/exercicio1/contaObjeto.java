package exercicio1;

public class contaObjeto {
public static void main(String[] args) {
		
		conta conta1 = new conta();

		conta1.setNome("nome");
		conta1.setAgencia("agencia");
		conta1.setConta("conta");
		conta1.setPix("pix");
		conta1.scan();
		conta1.print();
		
	}
}