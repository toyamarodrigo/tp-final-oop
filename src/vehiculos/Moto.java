package vehiculos;

public class Moto extends Vehiculo {

    private String cilindrada;

    // Constructors
    public Moto() {
    }

    public Moto(String marca, String tipo, int km, String cilindrada) {
        super(marca, tipo, km);
        this.cilindrada = cilindrada;
    }

    // toString
    @Override
    public String toString() {
        return "Moto " + super.toString() + "[cilindrada= " + cilindrada + "]";
    }

}
