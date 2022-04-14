package aula20220414;

public class AulaVariavel {
	public static void main(String[]args) {
		String palavra = " Alexandre ";
		
		String palavraCorrigida = palavra.replace("Ÿ", "I");
				
		palavra = palavra.trim();
		//System.out.println(palavra.trim());
		
		System.out.println(palavra);
	}
}