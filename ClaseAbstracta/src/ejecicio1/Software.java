package ejecicio1;

public class Software extends Producto implements Precio {
	private String tipo;

	public Software(char codigo, String descripcion, String tipo) {
		super(codigo, descripcion);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String Descripcion() {
		// TODO Auto-generated method stub
		return "codigo:" + super.getCodigo() + "\n" + "descripcion: "
				+ super.getDescripcion() + "\n" + "tipo: " + getTipo() + "\n"
				+ "precio: " + CalcularPrecio();
	}

	@Override
	public double CalcularPrecio() {
		// TODO Auto-generated method stub
		double aumento, aumento2;
		if (super.getCodigo() == 'B') {
			if (getTipo() == "ProgramaJuegos") {
				aumento = B * 0.05;
				return B + aumento;
			} else {
				return B;
			}
		}

		if (super.getCodigo() == 'C') {
			if (getTipo() == "ProgramaJuegos") {
				aumento2 = C * 0.05;
				return C + aumento2;
			} else {
				return C;
			}
		}
		return 0;
	}

}
