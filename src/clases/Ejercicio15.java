package clases;

import java.util.Scanner;

public class Ejercicio15 {
    /*
      Hacer un programa que muestre el siguiente menú de opciones
  ****** GESTION CINEMATOGRÁFICA ********
  1-NUEVO ACTOR
  2-BUSCAR ACTOR
  3-ELIMINAR ACTOR
  4-MODIFICAR ACTOR
  5-VER TODOS LOS ACTORES
  6- VER PELICULAS DE LOS ACTORES
  7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
  8-SALIR


EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8, MIENTRAS SE DIGITE
UNA DE LAS CINCO OPCIONES DEBE SEGUIR MOSTRADO EL MENU Y SI EL USUARIO DIGITA
UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE " OPCION INCORRECTO".
Y MOSTRAR EL MENU NUEVAMENTE.
PISTA: COMBINAR SWICHT Y ALGUNO DE LOS BUCLES.
   */
    public static void main(String[] args) {
        int opcion=0;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println(" ****** GESTION CINEMATOGRÁFICA ********\n" +
                    "  1-NUEVO ACTOR\n" +
                    "  2-BUSCAR ACTOR\n" +
                    "  3-ELIMINAR ACTOR\n" +
                    "  4-MODIFICAR ACTOR\n" +
                    "  5-VER TODOS LOS ACTORES\n" +
                    "  6- VER PELICULAS DE LOS ACTORES\n" +
                    "  7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                    "  8-SALIR");
            opcion= leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Opcion 1 seleccionada");
                    break;
                case 2:
                    System.out.println("Opcion 2 seleccionada");
                    break;
                case 3:
                    System.out.println("Opcion 3 seleccionada");
                    break;
                case 4:
                    System.out.println("Opcion 4 seleccionada");
                    break;
                case 5:
                    System.out.println("Opcion 5 seleccionada");
                    break;
                case 6:
                    System.out.println("Opcion 6 seleccionada");
                    break;
                case 7:
                    System.out.println("Opcion 7 seleccionada");
                    break;
                case 8:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        } while (opcion != 8);
    }
}
