package clases;

import java.util.Scanner;

public class Ejercicio9 {
    /*
            Del texto, “La sonrisa sera la mejor arma contra la tristeza”
             Reemplaza todas las a del String anterior por una e,
             adicionalmente concatenar a esta frase una adicional que
             ustedes quieran incluir por consola y las muestre luego unidas

     */

    public static void main(String[] args) {
        String frase="La sonrisa sera la mejor arma contra la tristeza";
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese frase");
        String fraseAdicional = leer.next();
        String nuevaFrase= frase.replace("a","e").concat(" "+fraseAdicional);
        System.out.println("Reemplazando las a por las e y concatenando frase leida por consola: \n" +nuevaFrase);
    }
}
