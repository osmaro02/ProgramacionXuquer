package ejercicio0;

public abstract class MiembroUPV  extends Persona {
	
		
		//------/ Atributos (private) /-----------------
		
		private String carnet;
		
		
		//--------/ Constructor parametrizado /------------------
		
		public MiembroUPV(String nombre,int edad, String carnet) {
			this.nombre = nombre;
			this.edad =edad;
			this.carnet =carnet;
		}
		
		//----------- getters y setters /-------------
		public String getCarnet() {
			return carnet;
		}

		public void setCarnet(String carnet) {
			this.carnet = carnet;
		}
		
		
		public void menuIntranet() {
			
		}

		public void setHorarioTutorias(String string) {
			// TODO Apéndice de método generado automáticamente
			
		}

		public void setNotas(double[] notas) {
			// TODO Apéndice de método generado automáticamente
			
		}

		

		
		
	
}
