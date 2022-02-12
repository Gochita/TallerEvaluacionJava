package consola;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=0;
        int i=0;

        try {
            System.out.println("Ingrese un número");
            double numero = leer.nextDouble();
            num = (int) numero;
            if (num >= 1000) {
                System.out.println("No hay numeros antes de "+ num+ " hasta el 1000");
            }else{
                for (i = num; i <= 1000; i += 2) {
                    System.out.println(i);
                }
                if(i%2!=0) {
                    System.out.println("1000");
                }
            }


        } catch (Exception e) {
            System.out.println("Debe ingresar un número \nCausa--> " + e.getCause());
        }
    }
}
