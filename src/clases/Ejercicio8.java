package clases;



import java.util.Scanner;

/*

    Crea una aplicación por consola que nos pida un día de la
    semana y que nos diga si es un día laboral o no. Usa un switch para ello.

 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String dia = "";
        System.out.println("Ingrese un día de la semana");
        dia = leer.next().toUpperCase();
        switch(dia){
            case "LUNES":
                System.out.println("Es laboral");
                break;
            case "MARTES":
                System.out.println("Es laboral");
                break;
            case "MIERCOLES":
                System.out.println("Es laboral");
                break;
            case "JUEVES":
                System.out.println("Es laboral");
                break;
            case "VIERNES":
                System.out.println("Es laboral");
                break;
            case "SABADO":
                System.out.println("No es laboral");
                break;
            case "DOMINGO":
                System.out.println("No es laboral");


                default:
                    System.out.println("Dia invalido");


        }
    }

}
