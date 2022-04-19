package aula20220414;

public class TiposPrimitivos {

	//variaveis de classes numerica recebe valor padrap zero
	static int numero;
	static boolean simNao;
	static char cchar;
	
	public static void main(String[] args) {
		// porque variavel local de metodo precisa ser inicializada?
		int numero1;
		System.out.println(numero);
		System.out.println(simNao);
		System.out.println(cchar);
		
		String cep = "021070333";
		System.out.println(cep);
		
		long numeroLoong = 0L;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto;
		
		//palavra final trava para não poder alterar o valor da variavel
		final double pi = 3.14;
		
		
		
		 
	}
	

}
