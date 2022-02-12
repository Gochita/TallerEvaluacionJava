package consola;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Calcular area de un circulo");
        System.out.println("Ingresa el radio");
        String rad = leer.next();
        double radio = Double.parseDouble(rad);
        double area= areaCirculo(radio);
        System.out.println("El area del circulo es: "+ area);


    }

    private static double areaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }
}
