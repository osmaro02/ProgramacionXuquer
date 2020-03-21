package ejercicio3;
import java.util.Scanner;;
public class NumeroVecesCaracter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("El String introducido por el usuario es:");
		String frase = sc.nextLine().toLowerCase();
		
		System.out.print("Introduzca el caracter del que desea contar cuantas veces aparece: ");
		char letra = sc.next().charAt(0);
		char[] arrayLetra = frase.toCharArray();
		
		int cont = 0;
		for (int i = 0; i < arrayLetra.length; i++) {
			if (arrayLetra[i] == letra) {
				cont++;
				}
			}

		System.out.println("El caracter '"+ letra + "' aparece " + cont + " veces en la frase introducida");
		
		sc.close();
	}
}