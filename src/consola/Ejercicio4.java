package consola;

import java.util.Scanner;

public class Ejercicio4 {
    private static final double iva=21;
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del producto");
        double cantidad= leer.nextDouble();
        double valor=calcularIva(cantidad);
        double precioFinal= cantidad+valor;
        System.out.println("El precio final con iva es "+ precioFinal);


    }
    private static double calcularIva(double cantidad){
        double resultado= (iva/100)*cantidad;
        return resultado;
    }
}
