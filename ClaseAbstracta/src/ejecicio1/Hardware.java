package ejecicio1;

public class Hardware extends Producto implements Precio {
	private String periferico;

	public Hardware(char codigo, String descripcion, String periferico) {
		super(codigo, descripcion);
		this.periferico = periferico;
	}

	public String getPeriferico() {
		return periferico;
	}
   

	public void setPeriferico(String periferico) {
		this.periferico = periferico;
	}

	@Override
	public String Descripcion() {
		// TODO Auto-generated method stub
		return "codigo:" + super.getCodigo() + "\n" + "descripcion: "
				+ super.getDescripcion() + "\n" + "periferico: "
				+ getPeriferico() + "\n" + "precio: " + CalcularPrecio();
	}

	@Override
	public double CalcularPrecio() {
		// TODO Auto-generated method stub

		double aumento, aumento2;
		if (super.getCodigo() == 'A') {
			if (getPeriferico() == "si") {
				aumento = A * 0.10;
				return A + aumento;
			} else {
				return A;
			}
		}

		if (super.getCodigo() == 'B') {
			if (getPeriferico() == "si") {
				aumento2 = B * 0.10;
				return B + aumento2;
			} else {
				return B;
			}
		}
		return 0;
	}
}
