package vehiculos;

public class Coche extends Vehiculo {

	private int puertas;

	// Constructors
	public Coche() {}

	public Coche(String marca, String tipo, int km, int puertas) {
		super(marca, tipo, km);
		this.puertas = puertas;
	}

	// toString
	@Override
	public String toString() {
		return "Coche " + super.toString() + " [puertas= " + puertas + "]";
	}
	
	// Getters & Setters
	
	public int getPuertas() 			{ return puertas; 			}
	public void setPuertas(int puertas) { this.puertas = puertas; 	}

}
