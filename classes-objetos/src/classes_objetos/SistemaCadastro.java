package classes_objetos;

public class SistemaCadastro {
	
	public static void main(String[] args) {

	Pessoa alexandre = new Pessoa ("888.965.444-88", "Alexandre Nazato");
	
	System.out.println("CPF: " + alexandre.cpf);
	System.out.println("Nome: " + alexandre.nome);
	System.out.println("Endereço: " + alexandre.endereco);
	
}
}

