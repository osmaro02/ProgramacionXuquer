package ejercicio7;

import ejercicio7.Notas;

public class Alumno {
	/*	- Atributos: nombre, n�mero de Expediente y notasAlumnos (este �ltimo ser� de tipo Notas)
		- Constructor por defecto y parametrizado
		- M�todo toString() M�todo que muestra por pantalla la informaci�n del Alumno
	 */
	 private String nombre;
	 private int numExp;
	 private Notas notasAlumno;
	 
	//---------------------------------------------------------------------------------//
		//Constructor por defecto
	    public Alumno(){
	    }
	    
	    //Constructor con par�metros
	    public Alumno(String nombre,int numExp, Notas notasAlumno){
	    	this.nombre=nombre;
	    	this.numExp=numExp;
	    	this.notasAlumno=notasAlumno;
	    }

	//----------------------------------------------------------------------------------//
		//Constructor settes y gettes	
	 
	    public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getNumExp() {
			return numExp;
		}

		public void setNumExp(int numExp) {
			this.numExp = numExp;
		}

		public Notas getNotasAlumno() {
			return notasAlumno;
		}

		public void setNotasAlumno(Notas notasAlumno) {
			this.notasAlumno = notasAlumno;
		}
		//----------------------------------------------------------------------------------//
		//M�todo que devuelve un String 	
				public String toString() {
					String resultado;
				
				
					resultado = " \n Alumno: "+nombre+"\n";
					resultado = resultado +"--------------- Notas ------------- \n";
					resultado = resultado +  notasAlumno.mostrar() + "\n";
					resultado = resultado + "Nota media: " + notasAlumno.media() + "\n";
					
					return resultado;
					} 	
}
