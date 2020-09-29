
public class Programa {
	public static void main(String[] args) {
		
		char[] letras = {'A','B','C','D','E'};
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Letras: " + letras[i]);
		}
		
		System.out.println("Repetidor while...");
		int contador = 0;
		while(contador < 5) {
			System.out.println("Letras: " + letras[contador]);
			contador++;
		} 
		 
		System.out.println("Repetidor for...");
		int outroContador = 0;
		do {
			System.out.println("Letras: " + letras[outroContador]);
			outroContador++;
		}while (outroContador < 5);
	}

}
