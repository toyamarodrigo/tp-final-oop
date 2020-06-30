package sistemaGaraje;

import vehiculos.Vehiculo;

public class Garaje {

	private Vehiculo vehiculo;
	private int cantTotal = 0;
	private int cantCoches = 0;
	private int cantMotos = 0;
	private int kmMotos = 0;
	private int kmCoches = 0;

	private double precioRueda;
	private int capacidadVehiculoMax;

	// Constructor
	public Garaje() {
	}

	public Garaje(double precioRueda, int capacidadVehiculoMax) {
		this.precioRueda = precioRueda;
		this.capacidadVehiculoMax = capacidadVehiculoMax;
	}

	@Override
	public String toString() {
		return "Garaje [vehiculo=" + vehiculo + ", cantTotal=" + cantTotal + ", cantCoches=" + cantCoches
				+ ", cantMotos=" + cantMotos + ", precioRueda=" + precioRueda + ", capacidadVehiculoMax="
				+ capacidadVehiculoMax + "]";
	}

	public void ingresoVehiculo(Vehiculo vehiculo) {

		// Si la cantidad total de vehiculos es mayor o igual a la capacidad de vehiculo
		// asignada en el garaje
		if (cantTotal >= getCapacidadVehiculoMax()) {
			System.out.println("Capacidad maxima de vehiculos alcanzado.");
			System.out.println("Total de coches: " + getCantCoches());
			System.out.println("Total de motos: " + getCantMotos());
			System.out.println("Total: " + getCantTotal());
			System.out.println("************************");
			// Si vehiculo es de tipo "auto"
		} else if (vehiculo.getTipo().contentEquals("auto")) {
			cantTotal++;
			cantCoches++;
			kmCoches += vehiculo.getKm();
			System.out.println("Ingreso de Vehiculo: " + vehiculo);
			System.out.println("Numero de autos: " + getCantCoches());
			System.out.println("************************");
			// Si vehiculo es de tipo "moto"
		} else {
			cantTotal++;
			cantMotos++;
			kmMotos += vehiculo.getKm();
			System.out.println("Moto: " + vehiculo);
			System.out.println("Numero de motos: " + getCantMotos());
			System.out.println("************************");
		}

	}

	public void retiroVehiculo(Vehiculo vehiculo) {

		if (vehiculo.getTipo().contentEquals("auto")) {
			if (cantCoches != 0) {
				cantTotal--;
				cantCoches--;
				kmCoches -= vehiculo.getKm();
				System.out.println("Retiro de vehiculo: " + vehiculo);
				System.out.println("Numero de coches en garaje: " + cantCoches);
				System.out.println("Numero de motos en garaje: " + cantMotos);
				System.out.println("Numero de vehiculos en garaje: " + cantTotal);
				System.out.println("************************");
			} else {
				System.out.println("No hay autos para retirar");
				System.out.println("************************");
			}
		} else {
			if (cantMotos != 0) {
				cantTotal--;
				cantMotos--;
				kmMotos -= vehiculo.getKm();
				System.out.println("Retiro de vehiculo: " + vehiculo);
				System.out.println("Numero de coches en garaje: " + cantCoches);
				System.out.println("Numero de motos en garaje: " + cantMotos);
				System.out.println("Numero de vehiculos en garaje: " + cantTotal);
				System.out.println("************************");
			} else {
				System.out.println("No hay motos para retirar");
				System.out.println("************************");
			}
		}
	}

	public void precioCambioRueda() {
		double ruedasCochesPrecio = (getCantCoches() * 4) * getPrecioRueda();
		double ruedasMotosPrecio = (getCantMotos() * 2) * getPrecioRueda();
		double totalRuedasPrecio = ruedasCochesPrecio + ruedasMotosPrecio;
		System.out.println("Total vehiculos: " + getCantTotal());
		System.out.println("Precio cambio rueda Autos: " + ruedasCochesPrecio);
		System.out.println("Precio cambio rueda Motos: " + ruedasMotosPrecio);
		System.out.println("Total precio cambio de rueda de todos los vehiculos: " + totalRuedasPrecio);
		System.out.println("************************");
	}

	public void kmPromedio() {
		double totalPromKm = (getKmCoches() + getKmMotos()) / getCantTotal();
		System.out.println("Promedio de kilometros total: " + totalPromKm);
	}

	public void displayCantTotal() {
		System.out.println("Cantidad total de vehiculos recibidos: " + getCantTotal() + " | Coches: " + getCantCoches()
				+ " | Motos: " + getCantMotos());
	}

	// Getters & Setters

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public int getCantTotal() {
		return cantTotal;
	}

	public void setCantTotal(int cantTotal) {
		this.cantTotal = cantTotal;
	}

	public int getCantCoches() {
		return cantCoches;
	}

	public void setCantCoches(int cantCoches) {
		this.cantCoches = cantCoches;
	}

	public int getCantMotos() {
		return cantMotos;
	}

	public void setCantMotos(int cantMotos) {
		this.cantMotos = cantMotos;
	}

	public int getKmMotos() {
		return kmMotos;
	}

	public void setKmMotos(int kmMotos) {
		this.kmMotos = kmMotos;
	}

	public int getKmCoches() {
		return kmCoches;
	}

	public void setKmCoches(int kmCoches) {
		this.kmCoches = kmCoches;
	}

	public double getPrecioRueda() {
		return precioRueda;
	}

	public void setPrecioRueda(double precioRueda) {
		this.precioRueda = precioRueda;
	}

	public int getCapacidadVehiculoMax() {
		return capacidadVehiculoMax;
	}

	public void setCapacidadVehiculoMax(int capacidadVehiculoMax) {
		this.capacidadVehiculoMax = capacidadVehiculoMax;
	}

}
