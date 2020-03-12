package ejercicio7;
import java.util.Scanner;
import ejercicio7.Notas;
import ejercicio7.Alumno;
public class Principal {

	public static void main(String[] args) {
	/*	La clase principal desde la que se crearán dos alumnos (uno mediante el constructor parametrizado. otro con el constructor
		por defecto y el uso de getters/setters para definir los atributos) y posteriormente se imprimirán por pantalla los datos de
		ambos alumnos.
	 */
		
		
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		 

		
		Alumno alum = new Alumno();
		Notas not=  new Notas();
		
		System.out.print("Introduce Nombre del alumno: ");
		nombre = sc.nextLine();
		
		
		//------------------------------------------------------------
		alum.setNombre(nombre);
		
			//pide introducir las notas desde la clase notas	
			not.leer();
			
		//------------------------------------------------------------	
			
			//imporime los resultados desde la clase alumno
			
			alum.setNotasAlumno(not);
			System.out.println(alum.toString());
		
		sc.close();
		}
	}