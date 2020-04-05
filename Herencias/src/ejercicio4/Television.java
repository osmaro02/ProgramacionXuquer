package ejercicio4;

/*
* @autor: Oscar * Ejercicio 4 Tema 7 – Herencia
* Clase electrodomestico
*/
public class Television extends Electrodomestico{

    //Atributos

    private int resolucion;
    private boolean sintonizadorTDT;
  
 
     //Constructor por defecto
     
    public Television(){
        this.resolucion=20 ;
        this.color = "Blanco";
		this.consumoEnergetico = 'F';
		this.peso = 5;
		this.precioBase = 100.00;
		this.sintonizadorTDT = false;
    }
  
  //Constructor con 2 parametros
    public Television(double precioBase, double peso){
		this.peso = peso;
		this.precioBase = precioBase;
    }
  
   //Contructor con 6 parametros
 
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion,boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
    
    //settes y gettes
     public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

  
    //Métodos publicos
  
    @Override
    public double precioFinal(){
        //Invocamos el método precioFinal del método padre
        double incrementoPrecio=super.precioFinal();
  
        if (resolucion>40){
        	incrementoPrecio=incrementoPrecio + precioBase*0.3;
        }
        if (sintonizadorTDT){
        	incrementoPrecio=incrementoPrecio + 50;
        }
        return incrementoPrecio;
    }
}