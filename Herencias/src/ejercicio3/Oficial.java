package ejercicio3;

public class Oficial extends Operario{

	//constructor por defecto
    public Oficial() {
    }

    //constructor con par�metro
    public Oficial(String nombre) {
        super(nombre);
    }
    
   
    //m�todo toString()
    @Override
    public String toString() {
        return super.toString() + " --> Oficial";
    }
}
