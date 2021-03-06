package ejercicio17;

public class Electrodomestico {
    //atributos
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;


    //constantes
    final String colorDef = "BLANCO";
    final char consumoDef = 'F';
    final double precioDef = 100;
    final double pesoDef = 5;

    public Electrodomestico() {
        this.color = colorDef;
        this.peso = pesoDef;
        this.consumoEnergetico = consumoDef;
        this.precioBase = precioDef;

    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);

    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public char comprobarConsumoEnergetico(char letra) {
        if (letra == 'a') {
            letra = 'A';
        } else if (letra == 'b') {
            letra = 'B';
        } else if (letra == 'c') {
            letra = 'C';
        } else if (letra == 'd') {
            letra = 'D';
        } else if (letra == 'e') {
            letra = 'E';
        } else if (letra == 'f') {
            letra = 'F';
        } else if (letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D'
                && letra != 'E' && letra != 'F') {
            letra = consumoDef;
        }
        return letra;

    }

    public String comprobarColor(String color) {
        color.toUpperCase();
        if (color != "BLANCO" && color != "NEGRO" && color != "ROJO" && color != "AZUL" && color != "GRIS") {
            color = colorDef;
        }
        return color;
    }

    public double precioFinal(char consumo, double peso) {
        double preciofinal = 0, precioConsumo = 0, precioTama??o = 0;
        switch (consumo) {
            case 'A':
                precioConsumo = 100;
                break;
            case 'B':
                precioConsumo = 80;
                break;
            case 'C':
                precioConsumo = 60;
                break;
            case 'D':
                precioConsumo = 50;
                break;
            case 'E':
                precioConsumo = 30;
                break;
            case 'F':
                precioConsumo = 10;
                break;
            default:
                precioConsumo = 10;


        }
        if (peso >= 0 && peso <= 19) {
            precioTama??o = 10;
        } else if (peso >= 20 && peso <= 49) {
            precioTama??o = 50;
        } else if (peso >= 50 && peso <= 79) {
            precioTama??o = 80;
        } else if (peso >= 80) {
            precioTama??o = 100;
        }
        preciofinal = precioConsumo + precioTama??o;
        return preciofinal;
    }


}
