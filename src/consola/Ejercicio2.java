package consola;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int a = leer.nextInt();
        System.out.println("Ingrese segundo numero");
        int b= leer.nextInt();
        esMayor(a,b);
    }

    public static void esMayor(int a, int b) {
        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (b > a) {
            System.out.println(b + " es mayor que " + a);
        } else if (a == b) {
            System.out.println("ambos numeros son iguales");
        }
    }
}
