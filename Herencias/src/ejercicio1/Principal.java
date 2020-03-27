package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		//--------------------- Empleado -------------------------
		
		  Empleado e = new Empleado("Pepe","123456789A",35,true,1800);
		     e.ImprimirEmpleado();  
		     
		     
		   //--------------------- Programador -------------------------
				     
		     Programador p1 = new Programador("Juan","87654321B",40,false,2000,250,"java");
		     
		    // p1.setLineasCodigoPorHora(250);
		    // p1.getLenguajeDominante("java");
		     p1.AumentarSueldo(0.25);	
		     p1.nivelProgramacion();

	    }
}