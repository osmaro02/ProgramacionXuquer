package ejercicio3;

public class Tecnico extends Operario{

	//constructor por defecto
    public Tecnico() {
    }

    //constructor con par�metro
    public Tecnico(String nombre) {
        super(nombre);
    }
    
    
    //m�todo toString()
    @Override
    public String toString() {
        return super.toString() + " --> Tecnico";
    }
}