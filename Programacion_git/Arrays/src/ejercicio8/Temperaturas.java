package ejercicio8;

import java.util.Scanner;

public class Temperaturas {
	private double []temp = new double[31];
	private RegistroMes mes= new RegistroMes();
	private int dia=0;
	private int i;
	private double sum=0;
	private Scanner sc = new Scanner(System.in);
	
	 //---------------------------------------------------------------------------------------------------------
		//Constructor por defecto Que inicializará el atributo temp
		 public Temperaturas() {
		 }
		 public void leer() {
			 for(i = 0; i<dia;i++){
					
					System.out.print("Introduce la temperatura del dia " + (i+1) + ": ");
					temp[i] = sc.nextDouble();
				}
				switch (mes.getMes()) {
				case "Enero":
					dia = 31;
					break;
				case "Febrero":
					 dia = 28; 
					break;
				case "Marzo":
					dia = 31;
					break;
				case "Abril":
					dia = 30;
					break;
				case "Mayo":
					dia = 31;
					break;
				case "Junio":
					dia = 30;
					break;
				case "Julio":
					dia = 31;
					break;
				case "Agosto":
					dia = 31;
					break;
				case "Septiembre":
					dia = 30;
					break;
				case "Octubre":
					dia = 31;
					break;
				case "Noviembre":
					dia = 30;
					break;
				case "Diciembre":
					dia = 31;
					break;
				}
				
		 }
		//---------------------------------------------------------------------------------------------------------
		 //El método pide al usuario que introduzca todas las temperaturas del mes y las guarda en el array temp
		
			
		//--------------------------------------------------------------------------------------------------------- 
		//El método imprime por pantalla las temperaturas del mes.
				public String mostrar() {
					 
				      String resultado="";
			
			for(i = 0; i<temp.length;i++){
			System.out.println("Tª dia "+(i+1)+": "+temp[i]);
			}
			
			  return resultado;
				}
				
		//--------------------------------------------------------------------------------------------------------- 	
				//El método devuelve la temperatura media del mes.
				 public double  media() {	
					 double mediaTemp=0.0;
					 sum=sum+temp[i];
					 
				if(sum >=0) {
					double media;
				media = sum/temp.length;
				System.out.println("La media de las temperaruras positivas son: "+media);
				}
				
				if(sum <0) {
					double media;
				media = sum/temp.length;
				System.out.println("La media de las temperaruras negativas son: "+media);
				}
				return mediaTemp;
			}
		
		//--------------------------------------------------------------------------------------------------------- 
				 
				 //Devuelven las temperaturas máximas y míimas del mes respectivamente.
				 //maxima () 
				 public double maxima() {
						double max = 0;
						
						for (int i = 0; i < dia; i++) {
							if (temp[i] > max) {
								max = temp[i];
							}
						}
						
						return max;
					}
					
				 // mínima() 
					public double minima() {
						double min = 9999;
						
						for (int i = 0; i < dia; i++) {
							if (temp[i] < min) {
								min = temp[i];
							}
						}
						
						return min;
					}
					
	}