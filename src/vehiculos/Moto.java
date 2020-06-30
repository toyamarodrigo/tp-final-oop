package vehiculos;

public class Moto extends Vehiculo {

	private String cilindrada;

	public Moto() {
	}

	public Moto(String marca, String tipo, int km, String cilindrada) {
		super(marca, tipo, km);
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto " + super.toString() + "[cilindrada= " + cilindrada + "]";
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

}
