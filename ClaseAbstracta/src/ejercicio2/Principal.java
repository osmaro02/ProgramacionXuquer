package ejercicio2;

public class Principal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publicacion[] libro = new Publicacion[2];
		Publicacion[]revista = new Publicacion[2];
		libro[0] = new Libro("RF54", " SQL Principiantes ", 2015, " Antonio Miro,");
		libro[1] = new Libro("RF23"," Informatica Principiantes ", 2020, " Juan Sanchez, ");
		revista[0] = new Revista("RF02", "Software ", 2018, 15);
		revista[1] = new Revista("RF09", "Harwaree ", 2019, 10);
		
		System.out.println("          Publicaciones de libros  ");
		System.out.println("");
		
		for (Publicacion l : libro) {
			System.out.println(l.toString());
			System.out.println("");
		}
		System.out.println("          Publicaciones de revistas ");
		System.out.println("");
		for (Publicacion r : revista) {
			System.out.println(r.toString());
			System.out.println("");
		}
	
	}
}