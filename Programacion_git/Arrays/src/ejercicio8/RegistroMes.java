package ejercicio8;

public class RegistroMes {
	
	//Atributos : nombreMes , anyo y temperaturas(este �ltimo ser� de tipo Temperaturas)
	
	private String mes;
	private int anyo;
	private Temperaturas temperaturas;
	
	
	//Para fijar los valores de nombreMes , anyo y temperaturas, se llamar�n a los setters
	//Constructor por defecto.
    public RegistroMes(){
    }
    
    /*Constructor parametrizado. (Ejemplo llamada: RegistroMes nombreMes,anyo , tempereaturas )
	Se inicializa con el nombre del mes, el a�o y el array temperaturas que se pasan por par�metros.*/
    public RegistroMes(String mes, int anyo, Temperaturas temperaturas){
    	this.mes=mes;
    	this.anyo=anyo;
    	this.temperaturas=temperaturas;
    }
    
  //Constructor settes y gettes

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public Temperaturas getTemperaturas() {
		return temperaturas;
	}

	public void setTemperaturas(Temperaturas temperaturas) {
		this.temperaturas = temperaturas;
	}

	
	
	
	//M�todo que muestra por pantalla la informaci�n del registroMes
	public String toString() {
		
		String resultado="";
	
		System.out.println(" ");
		System.out.println("registro de temperaturas del "+mes+" del a�o"+anyo);
		System.out.println(" ");
		System.out.println(" --------------- Temperaturas ------------- ");
		System.out.println( temperaturas.mostrar());
		System.out.println("Temperatura media: " + temperaturas.media());
		System.out.println("Temperatura maxima: " + temperaturas.maxima());
		System.out.println("Temperatura minima: " + temperaturas.minima());
		 
		return resultado;
		}


	
}