package ejercicio3;

public class Operario extends Empleado{

	//constructor por defecto
    public Operario() {
    }
	
	
	//constructor con par�metro
    public Operario(String nombre) {
        super(nombre);
    }


    //m�todo toString()
    @Override
    public String toString() {
        return super.toString() + " --> Operario";
    }
   
}