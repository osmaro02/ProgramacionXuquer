package ejercicio3;

public class Directivo extends Empleado{

	//constructor por defecto
    public Directivo() {
    }
   
    //constructor con parámetro
    public Directivo(String nombre) {
       super(nombre);
    }
    
   
    //método toString()
    @Override
    public String toString() {
        return super.toString() + " --> Directivo";
    }
}