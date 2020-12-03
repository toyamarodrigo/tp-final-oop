package vehiculos;

public class Vehiculo {

    private String marca;
    private String tipo;
    private int km;

    // Constructors
    public Vehiculo() {
    }

    public Vehiculo(String marca, String tipo, int km) {
        this.marca = marca;
        this.tipo = tipo;
        this.km = km;
    }

    // toString
    @Override
    public String toString() {
        return "[marca= " + marca + ", tipo= " + tipo + ", km= " + km + "]";
    }

    // Getters & Setters

    public String getTipo() {
        return tipo;
    }

    public int getKm() {
        return km;
    }
}
