package ejecicio1;

public abstract class Producto {
	private char codigo;
	private String descripcion;


	public Producto(char codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public char getCodigo() {
		return codigo;
	}
	public void setCodigo(char codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public abstract String Descripcion();
	}