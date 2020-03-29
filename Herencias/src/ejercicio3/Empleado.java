package ejercicio3;

public class Empleado {
	
	//------ Atributos -------------
	private String nombre;

	//------------ Constructores ---------------
    //constructor por defecto
    public Empleado() {
    }

    //constructor con un parámetro
    public Empleado(String nombre) {
       this.nombre = nombre;
       
    }
   
    //---------- getes  y setes-----------------
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //método toString()
    public String toString() {
        return  nombre+" es un objeto de la clase Empleado";
    }
}
