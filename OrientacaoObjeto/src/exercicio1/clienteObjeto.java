package exercicio1;

public class clienteObjeto {
	
	public static void main(String[] args) {
		
		cliente cliente1 = new cliente ();
		
		cliente1.setNome("Gonzales");
		cliente1.setCpf(312645978);
		cliente1.setEmail("gonz@gmail.com");
		cliente1.setFone(988543792);
		
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Número do CPF: " + cliente1.getCpf());
		System.out.println("Email: " + cliente1.getEmail());
		System.out.println("Telefone celular: " + cliente1.getFone());		
	}

}
