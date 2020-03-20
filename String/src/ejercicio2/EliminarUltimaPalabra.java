package ejercicio2;
import java.util.Scanner;;
public class EliminarUltimaPalabra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("El String introducido por el usuario es:");
		String frase = sc.nextLine();
		
		frase = frase.trim();
		String[] arrayPalabra = frase.split(" ");
		
		System.out.println("Después de eliminar la última palabra la frase que queda es: ");
		
		for (int i = 0; i < arrayPalabra.length-1; i++) { //Cuenta todas las palabras menos la ultima
			System.out.print(arrayPalabra[i] + " ");
		}
		
		sc.close();
	}
}

