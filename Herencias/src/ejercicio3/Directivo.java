package ejercicio3;

public class Directivo extends Empleado{

	//constructor por defecto
    public Directivo() {
    }
   
    //constructor con par�metro
    public Directivo(String nombre) {
       super(nombre);
    }
    
   
    //m�todo toString()
    @Override
    public String toString() {
        return super.toString() + " --> Directivo";
    }
}