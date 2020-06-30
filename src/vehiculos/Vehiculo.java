package vehiculos;

public class Vehiculo {

	private String marca;
	private String tipo;
	private int km;

	public Vehiculo() {
	}

	public Vehiculo(String marca, String tipo, int km) {
		this.marca = marca;
		this.tipo = tipo;
		this.km = km;
	}
	
	@Override
	public String toString() {
		return "[marca= " + marca + ", tipo= " + tipo + ", km= " + km + "]";
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

}
