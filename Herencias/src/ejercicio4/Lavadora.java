package ejercicio4;

/*
* @autor: Oscar * Ejercicio 4 Tema 7 – Herencia
* Clase electrodomestico
*/
public class Lavadora extends Electrodomestico{
  
    //Atributos

    private int carga;
    
    	//Constructor
     	// Contructor por defecto
     
  
    public Lavadora(){
    	this.carga= 5;
    	this.color = "Blanco";
		this.consumoEnergetico = 'F';
		this.peso = 5;
		this.precioBase = 100.00;
    }
  
    
     //Constructor con 2 parametros
  
    public Lavadora(double precioBase, double peso ){
		this.peso = peso;
		this.precioBase = precioBase;
    }
  
   
     // Constructor con 5 parametros
   
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
    
    //Settes y Gettes
    public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
    
    
    //Métodos publicos  
	
	@Override
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double incrementoPrecio=super.precioFinal();
  
        //añadimos el código necesario
        if (carga>30){
        	incrementoPrecio=incrementoPrecio+ 50;
        }
  
        return incrementoPrecio;
    }


	
}