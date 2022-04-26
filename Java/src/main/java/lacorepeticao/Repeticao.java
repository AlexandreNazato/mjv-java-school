package lacorepeticao;

public class Repeticao {
	
	
	    public static void main(String[] args) {

	        System.out.println("Decrescente: ");
	        Repeticao.ContagemRegressiva(8);
	        System.out.println("-----");
	        System.out.println("Crescente: ");
	        Repeticao.ContagemCrescente(4);

	    }

	    static void ContagemRegressiva(int numero) {
	        for(int i=numero; i>0; i--) {
	            System.out.println(i);
	        }

	    }
	    static void ContagemCrescente(int numero1) {
	        for(int j=0; j<numero1; j++) {
	            System.out.println(j);
	        }
	    }

	}
	
