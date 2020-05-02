package ejecicio1;

public class Principal {
	public static void main(String[] args) {
		
		Producto[] articulo = new Producto[4];

		articulo[0] = new Software('B', "software Portable", "ProgramaJuegos");
		articulo[1] = new Software('C', "software Aplicacion","ProgramaAplicacion");
		articulo[2] = new Hardware('A', "pantalla", "si");
		articulo[3] = new Hardware('B', "teclado", "no");
		
		System.out.println("PRODUCTOS");
		for (Producto a : articulo) {
			System.out.println(a.Descripcion());
			System.out.println("");
		}

	}

}