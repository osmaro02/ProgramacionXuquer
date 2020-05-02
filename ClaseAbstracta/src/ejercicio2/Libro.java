package ejercicio2;

public class Libro extends Publicacion implements Prestable {
    
    private boolean prestado;
	private String autor;
    
    public Libro(String codigo, String titulo, int anio, String autor) {
        super(codigo, titulo, anio);
		this.autor = autor;
        prestado = false;
    }

    @Override
    public void prestar() {
    prestado = true;
        
    }

    @Override
    public void devolver() {
    prestado = false;
        
    }

    @Override
    public boolean prestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return super.toString()+" Autor:"+this.autor+ " Libro prestado=" + prestado ;
    }
    

}