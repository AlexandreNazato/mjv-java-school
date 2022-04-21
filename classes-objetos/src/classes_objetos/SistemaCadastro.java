package classes_objetos;

public class SistemaCadastro {
	
	public static void main(String[] args) {

	Pessoa alexandre = new Pessoa ("888.965.444-88", "Alexandre Nazato","xxxx");
	Pessoa alexandre2 = new Pessoa ("888.965.444-88", "Alexandre Nazato");
	Pessoa alexandre3 = new Pessoa ();
	
	
	System.out.println("CPF: " + alexandre.cpf);
	System.out.println("Nome: " + alexandre.nome);
	System.out.println("Endereço: " + alexandre.endereco);

	System.out.println("CPF: " + alexandre2.cpf);
	System.out.println("Nome: " + alexandre2.nome);
	System.out.println("Endereço: " + alexandre2.endereco);
	
	System.out.println("CPF: " + alexandre3.cpf);
	System.out.println("Nome: " + alexandre3.nome);
	System.out.println("Endereço: " + alexandre3.endereco);
	
	
	
}
}

