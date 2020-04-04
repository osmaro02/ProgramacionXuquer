package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		//--------------------- Empleado -------------------------
		System.out.println("Empleado");
		  Empleado e = new Empleado("Pepe","123456789A",18,true,1800);
		     e.ImprimirEmpleado(); 
		     System.out.println("Clasificación: "+e.Clasificacion());
		     System.out.println("");
		     
		//--------------------- Programador -------------------------
				     
		     Programador p1 = new Programador("Juan","87654321B",40,false,2000,250,"java");
		     p1.AumentarSueldo(0.25);	
		     p1.nivelProgramacion();
		     p1.ImprimirEmpleado();
		     System.out.println("Clasificación: "+p1.Clasificacion());
		     p1.mostrarMensaje("");

		}
	}
