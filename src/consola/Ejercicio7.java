package consola;

import java.util.Scanner;

public class Ejercicio7 {
    /*
    Lee un número por teclado y comprueba que este numero es mayor
    o igual que cero, si no lo es lo volverá a pedir (do while),
    después muestra ese número por consola.
*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double numero;
        do {
            System.out.println("Ingrese numero");
            numero = leer.nextDouble();

        } while (numero <= 0);
        System.out.println("El numero es: "+ numero);
    }

}
