package ejercicio2;

class ProfesorEnfermo extends Profesor {
	

	
	public ProfesorEnfermo(String nombre, String despacho) {
		super(nombre, despacho);
	}

	@Override
	public void getConsultas() {
        System.out.println("El profesor est� enfermo. Se suspenden las consultas hasta que se recupere. Disculpe las molestias.");
        
        /*
         * La anotaci�n @Override se utiliza para asegurarse de que la JVM sobrescriba el m�todo de manera adecuada. 
         * Es como si le dijeras a la JVM "oye, no te olvides de sobreescribir este m�todo correctamente"
         */
     }
}
