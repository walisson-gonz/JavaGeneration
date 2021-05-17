package exercicio1;

public class pacienteObjeto {
public static void main(String[] args) {
		
		paciente paciente1 = new paciente();

		paciente1.setNome("nome");
		paciente1.setAltura("altura");
		paciente1.setPeso("peso");
		paciente1.scan();
		paciente1.print();
		
	}
}