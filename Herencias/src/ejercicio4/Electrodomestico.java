package ejercicio4;

/*
* @autor: Oscar * Ejercicio 4 Tema 7 – Herencia
* Clase Electrodomestico
*/
public class Electrodomestico {
   
    	//Atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
  
    	//Contructor por defecto
   
    public Electrodomestico(){
    	this.color = "Blanco";
		this.consumoEnergetico = 'F';
		this.peso = 5;
		this.precioBase = 100.00;
		
    }
   
     	//Contructor con 2 parametros
    
    public Electrodomestico(double precioBase, double peso){
    	this.color = "Blanco";
		this.consumoEnergetico = 'F';
		this.peso = peso;
		this.precioBase = precioBase;
    }
  
     	//Constructor con 4 parametros
   
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        this.consumoEnergetico = consumoEnergetico;
        this.color =color;
    }
    
    //settes y gettes
   
    public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

    
	 //Métodos
	
	public void comprobarColor(String color){
            	 
           if(color == "Negro" || color == "Azul"|| color == "Gris" || color == "Rojo") {
        	   this.color = color;	 
            	 }
            
            else{
            	this.color="Blanco";
            	}
            }
        
       
    public double getPrecioBase() {
		return precioBase;
	}

	

	public void comprobarConsumoEnergetico(char consumoEnergetico){
    	 if(Character.isLowerCase(consumoEnergetico))
      		  consumoEnergetico = Character.toUpperCase(consumoEnergetico);
    	
    	if(consumoEnergetico>=50 && consumoEnergetico<=90){
            this.consumoEnergetico=consumoEnergetico;
        }
    	
        else {
            this.consumoEnergetico = 'F';
        }
    }
    
  
    public double precioFinal(){
    	
        double incrementoPrecio=0;
        
        switch(consumoEnergetico){
            case 'A':
            	incrementoPrecio=incrementoPrecio+100;
                break;
            case 'B':
            	incrementoPrecio+=80;//=incrementoPrecio+80;
                break;
            case 'C':
            	incrementoPrecio+=60;
                break;
            case 'D':
            	incrementoPrecio+=50;
                break;
            case 'E':
            	incrementoPrecio+=30;
                break;
            case 'F':
            	incrementoPrecio+=10;
                break;
        }
   
        if(peso>=0 && peso<19){
        	incrementoPrecio+=10;
        	}
        else if(peso>=20 && peso<49){
        	incrementoPrecio+=50;
        	}
        else if(peso>=50 && peso<=79){
        	incrementoPrecio+=80;
        	}
        else if(peso>=80){
        	incrementoPrecio+=100;
        	}
   
        return precioBase+incrementoPrecio;
    }
}