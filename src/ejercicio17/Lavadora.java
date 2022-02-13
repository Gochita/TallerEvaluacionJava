package ejercicio17;

public class Lavadora extends Electrodomestico {
    //constantes
    final double cargaDef = 5;
    //atributos
    private double carga;

    public Lavadora() {
        this.carga = carga;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = cargaDef;

    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal(char consumo, double peso) {
        double extra = 0;
        double precio = super.precioFinal(consumo, peso);
        if (carga > 30) {
            extra = 50;
        }
        precio += extra;
        return precio;
    }
}
