package clases;


import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio12 {
    /*
    Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner leer2= new Scanner(System.in);
        System.out.print("introduce primera palabra : ");
        String frase = leer.next();
        System.out.println("la primer palabra es :" +frase);
        System.out.print("introduce otra palabra: ");
        String frase2 = leer2.next();
        StringTokenizer tokens = new StringTokenizer(frase2);
        String segundaPalabra = tokens.nextToken();
        System.out.println("la segunda palabra es :" +frase2);
        comparar(frase,frase2);


    }
    public static void comparar(String frase, String frase2){
        if(frase.compareTo(frase2)==0){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
            System.out.println("En la primera palabra: ");
            char [] array= frase.toCharArray();
            calcularVocalesConsonantes(array);
            System.out.println("--------------------");
            System.out.println("En la segunda palabra: ");
            char [] array2= frase2.toCharArray();
            calcularVocalesConsonantes(array2);
        }




    }
    public static void calcularVocalesConsonantes(char [] cadena){
        int a=0,e=0,ii=0,o=0,u=0,consonantes=0;

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
            }else{
                consonantes++;
            }
        }
        System.out.println("A se repite: "+a+ " veces");
        System.out.println("E se repite: "+e+ " veces");
        System.out.println("I se repite: "+ii+ " veces");
        System.out.println("O se repite: "+o+ " veces");
        System.out.println("U se repite: "+u+ " veces");
        System.out.println("Tiene "+ consonantes+ " consonantes");
    }
}
