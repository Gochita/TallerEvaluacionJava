package clases;

import java.util.Scanner;

public class Ejercicio10 {

    /*

        Realizar una aplicación de consola, que al ingresar una
         frase por teclado elimine los espacios que esta contenga.

     */


    public static void main(String[] args) {

        Scanner leer= new Scanner(System.in);
        System.out.print("Ingrese frase: ");
        String text= leer.nextLine();
        System.out.println("La frase sin espacios es \n"+text.replace(" ",""));
    }
}

