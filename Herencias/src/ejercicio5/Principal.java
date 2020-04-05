/*
* @autor: Oscar * Ejercicio 5 Tema 7 – Herencia
* Clase Principal
*/package ejercicio5;

public class Principal {
    public  static void main (String[] args){
        
       Producto ListaProductos[]=new Producto[3];
       
       ListaProductos[0]=new Producto("producto1", 30);
       ListaProductos[1]=new Perecedero(2, "producto2",15);
       ListaProductos[2]=new NoPerecedero("tipo 1", "producto 3", 5);
       
     
       
       double suma=0;
       for(int i=0;i<ListaProductos.length;i++){
           suma=suma+ListaProductos[i].Calcular(5);
       }
        System.out.println("El precio total de productos es: "+suma);
      
      
    }
    
}
