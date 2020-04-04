package ejercicio4;


/*
* @autor: Oscar * Ejercicio 4 Tema 7 – Herencia
* Clase electrodomestico
*/
public class Principal {
 
	 public static void main(String[] args) {
		   
	        //Array de Electrodomesticos
	        Electrodomestico electrodomesticos[]=new Electrodomestico[10];
	        electrodomesticos[0]=new Electrodomestico(250, 40, 'a', "negro");
	        electrodomesticos[1]=new Lavadora(300, 40,'F', "rojo", 42);
	        electrodomesticos[2]=new Television(110, 25, 'F', "ROJO", 32, false);
	        electrodomesticos[3]=new Electrodomestico(150, 90, 'G', "verde");
	        electrodomesticos[4]=new Lavadora(400, 100, 'x', "azul", 15);
	        electrodomesticos[5]=new Television(250, 70, 'C', "blanco", 40, true);
	        electrodomesticos[6]=new Electrodomestico(600, 20, 'D', "gris");
	        electrodomesticos[7]=new Lavadora(400, 100, 'x', "Blanco", 15);
	        electrodomesticos[8]=new Television(200, 60, 'd', "gris", 30, true);
	        electrodomesticos[9]=new Electrodomestico(80, 50, 'B', "negro");
	        
	        
	        double electroSum=0;//variables para la suma total de todos los electrodomesticos
	        double lavaSum=0;//variables para la suma total de lavadoras
	        double teleSum=0;//variables para la suma total de televisiones
	        

	        for(int i=0;i<electrodomesticos.length;i++){
	           
	            if(electrodomesticos[i] instanceof Electrodomestico){
	            	electroSum+=electrodomesticos[i].precioFinal();
	            	}
	            if(electrodomesticos[i] instanceof Lavadora){
	            	lavaSum+=electrodomesticos[i].precioFinal();
	            	}
	            if(electrodomesticos[i] instanceof Television){
	            	teleSum+=electrodomesticos[i].precioFinal();
	            	}
	            }
	   
	        System.out.println("El precio total de todos los electrodomesticos: "+electroSum+" Euros");
	        System.out.println("El precio total de las lavadoras: "+lavaSum+" Euros");
	        System.out.println("El precio total de las televisiones: "+teleSum+" Euros");
	        }
	 }
	     
	       
	        
	    
	   
	