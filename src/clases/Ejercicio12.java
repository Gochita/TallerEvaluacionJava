package clases;


import java.util.Scanner;

public class Ejercicio12 {
    /*
    Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String primera, segunda;
        System.out.println("Ingrese una palabra");
        primera= leer.nextLine();

        System.out.println("Ingrese otra palabra");
        segunda=leer.nextLine();
        System.out.println(primera);
        System.out.println(segunda);
    }
}
