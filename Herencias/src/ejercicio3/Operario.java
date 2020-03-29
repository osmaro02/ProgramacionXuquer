package ejercicio3;

public class Operario extends Empleado{

	//constructor por defecto
    public Operario() {
    }
	
	
	//constructor con parámetro
    public Operario(String nombre) {
        super(nombre);
    }


    //método toString()
    @Override
    public String toString() {
        return super.toString() + " --> Operario";
    }
   
}