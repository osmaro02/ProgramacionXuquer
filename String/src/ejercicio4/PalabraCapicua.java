package ejercicio4;
import java.util.Scanner;;
public class PalabraCapicua {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una cadena:  "); //reconocer, somos, sopapos, son palabras capicua, para probar.
		String palabra = sc.nextLine().toLowerCase();
		
		palabra = palabra.trim();
		
		int i = 0;
		int j = palabra.length() -1;
		
		boolean capicua = true;
		
		while (i < j) {
			if (palabra.charAt(i) != palabra.charAt(j))
				capicua = false;
				i++;
				j--;
		}
		
		if (capicua) {
			System.out.println( "La palabra introducida, "+ palabra +", SI es capicua!");
			} 
		
		else { System.out.println("La palabra introducida, "+ palabra +", NO es capicua!");
		}
		
		sc.close();
	}
}