package ejercicio2;

class ProfesorEnfermo extends Profesor {
	

	
	public ProfesorEnfermo(String nombre, String despacho) {
		super(nombre, despacho);
	}

	@Override
	public void getConsultas() {
        System.out.println("El profesor está enfermo. Se suspenden las consultas hasta que se recupere. Disculpe las molestias.");
     }
}
