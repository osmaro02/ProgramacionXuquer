package ejercicio3;

public class Tecnico extends Operario{

	//constructor por defecto
    public Tecnico() {
    }

    //constructor con parámetro
    public Tecnico(String nombre) {
        super(nombre);
    }
    
    
    //método toString()
    @Override
    public String toString() {
        return super.toString() + " --> Tecnico";
    }
}