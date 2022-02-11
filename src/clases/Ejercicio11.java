package clases;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {
    /*

    Realizar la construcción de un algoritmo que permita de acuerdo
    a una frase pasada por consola, indicar cual es la longitud de
    esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese frase: ");
        String frase = leer.nextLine();
        char [] array=frase.toLowerCase(Locale.ROOT).toCharArray();
        int tamaño= frase.length();
        System.out.println("La longitud de la frase con espacios es: "+ tamaño);
        String sinEspacios= frase.replace(" ","");
        int tamañoSin= sinEspacios.length();
        System.out.println("La longitud de la frase sin espacios es: "+ tamañoSin);
        calcularVocales(array);

    }
    public static void calcularVocales(char [] cadena){
        int a=0,e=0,ii=0,o=0,u=0;

        for (int i = 0; i < cadena.length ; i++) {
            if(cadena[i]=='a' ){
                a++;
            }else if(cadena[i]=='e' ){
                e++;
            }else if(cadena[i]=='i'){
                ii++;
            }else if(cadena[i]=='o'){
                o++;
            }else if(cadena[i]=='u'){
                u++;
            }
        }
        System.out.println("A se repite: "+a+ " veces");
        System.out.println("E se repite: "+e+ " veces");
        System.out.println("I se repite: "+ii+ " veces");
        System.out.println("O se repite: "+o+ " veces");
        System.out.println("U se repite: "+u+ " veces");
    }
}
