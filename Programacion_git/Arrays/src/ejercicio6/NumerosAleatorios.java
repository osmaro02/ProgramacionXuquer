/**
 * �scar Mart�nez Romero
 * 1� DAM Programaci�n
 * Centro estudios X�quer
 * Fecha 08/02/2020
 * Programa 6 array,NumerosAleatorios
 */
package ejercicio6;

public class NumerosAleatorios {

	public static void main(String[] args) {
		
		
		double num[] = new double[10];
		int i;
		
		for (i=0;i<num.length;i++) {
			num[i]= (Math.random()*100); //[i] es la posision y random el numero aletorio de 2 cibras(*100), mas decimales (double).
			
			System.out.println("El n�mero aleatorio guardado en la posici�n v[" + i + "]: = " +num[i]);
		}
	}

}
