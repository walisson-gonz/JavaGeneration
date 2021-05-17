package herançaDeClasse;

public class testaTudo {

	public static void main(String[] args) {
		
		cachorro dog = new cachorro();
		cavalo cav = new cavalo();
		preguica preg = new preguica();
		
		dog.setNome("Robertin");
		dog.setIdade(3);
	
		
		cav.setNome("Derbes");
		cav.setIdade(5);
		
		preg.setNome("Flesha");
		preg.setIdade(35);


		
		
		System.out.println("==Dados do Cavalo==");
		System.out.println("Nome: " + cav.getNome());
		System.out.println("Sua idade é: "+cav.getIdade()+" anos");
		cav.emitirSom();
		System.out.println("Habilidade de: "+cav.getHabi());
		
		System.out.println("\n==Dados do Cachorro==");
		System.out.println("Nome: " + dog.getNome());
		System.out.println("Sua idade é: "+dog.getIdade()+" anos");
		dog.emitirSom();
		System.out.println("Habilidade de: "+dog.getHabi());
		
		System.out.println("\n==Dados da Preguiça==");
		System.out.println("Nome: " + preg.getNome());
		System.out.println("Sua idade é: "+preg.getIdade()+" anos");
		preg.emitirSom();
		System.out.println("Habilidade de: "+preg.getHabi());
	}

}
