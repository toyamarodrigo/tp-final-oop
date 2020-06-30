package sistemaGaraje;

import vehiculos.Coche;
import vehiculos.Moto;

public class GarajeTest {

	public static void main(String[] args) {

		// Creacion de garaje
		Garaje garaje1 = new Garaje(4000, 8);
		Garaje garaje2 = new Garaje(4000, 4);

		Coche c1 = new Coche("renault", "auto", 10000, 4);
		Coche c2 = new Coche("mercedez", "auto", 12000, 4);
		Coche c3 = new Coche("ford", "auto", 14000, 4);
		Coche c4 = new Coche("peugeot", "auto", 16000, 4);
		Coche c5 = new Coche("toyota", "auto", 18000, 2);
		Coche c6 = new Coche("hyundai", "auto", 50000, 2);

		Moto m1 = new Moto("yamaha", "moto", 5000, "250c");
		Moto m2 = new Moto("ducati", "moto", 6000, "300c");
		Moto m3 = new Moto("harley", "moto", 7000, "400c");
		Moto m4 = new Moto("victoria", "moto", 8000, "500c");
		Moto m5 = new Moto("bmw", "moto", 8000, "660c");
		Moto m6 = new Moto("sora", "moto", 8000, "345c");

		// Ingreso de Vehiculos
		garaje1.ingresoVehiculo(c1);
		garaje1.ingresoVehiculo(c2);
		garaje1.ingresoVehiculo(c3);
		garaje1.ingresoVehiculo(c4);

		garaje1.ingresoVehiculo(m1);
		garaje1.ingresoVehiculo(m2);
		garaje1.ingresoVehiculo(m3);
		garaje1.ingresoVehiculo(m4);

		// Sobrepasa capacidad max de vehiculos en garaje = 8
		garaje1.ingresoVehiculo(c5);
		garaje1.ingresoVehiculo(m5);

		// Retiro de vehiculos
		garaje1.retiroVehiculo(c3);
		garaje1.retiroVehiculo(c4);

		garaje1.retiroVehiculo(m1);
		garaje1.retiroVehiculo(m2);

		// Precio de cambio de ruedas de todos los vehiculos
		garaje1.precioCambioRueda();

		// Km promedio de todos los vehiculos
		garaje1.kmPromedio();

		// Muestra cantidad total de todos los vehiculos recibidos
		garaje1.displayCantTotal();

		garaje2.ingresoVehiculo(c5);
		garaje2.ingresoVehiculo(c6);
		garaje2.ingresoVehiculo(m5);
		garaje2.ingresoVehiculo(m6);
	}

}
