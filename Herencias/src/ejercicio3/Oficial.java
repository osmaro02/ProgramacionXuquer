package ejercicio3;

public class Oficial extends Operario{

	//constructor por defecto
    public Oficial() {
    }

    //constructor con parámetro
    public Oficial(String nombre) {
        super(nombre);
    }
    
   
    //método toString()
    @Override
    public String toString() {
        return super.toString() + " --> Oficial";
    }
}
