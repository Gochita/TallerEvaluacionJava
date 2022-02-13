package ejercicio18;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int contSeries = 0, contJuegos = 0; //Contadores de cuantos juegos y cuantas series estan entregadas

        //Creacion de arrray series y videjuegos
        Serie[] series = new Serie[5];
        Videojuego[] juegos = new Videojuego[5];
        int[] horas = new int[5];
        int[] temporadas = new int[5];

        series[0] = new Serie("Crash landing on you", "Studio Dragon");
        series[1] = new Serie("The Mandalorian", 2, "Space western", "Jon Favreau");
        series[2] = new Serie("Danny Phantom", "Nickelodeon");
        series[3] = new Serie("Daria", 5, "Comedia", "Glenn Eichler");
        series[4] = new Serie("Adventure time", "Pendleton Ward");

        temporadas[0] = series[0].getNumTemporada();
        temporadas[1] = series[1].getNumTemporada();
        temporadas[2] = series[2].getNumTemporada();
        temporadas[3] = series[3].getNumTemporada();
        temporadas[4] = series[4].getNumTemporada();

        Arrays.sort(temporadas);

        //Creacion de varios juegos
        juegos[0] = new Videojuego("Bioshock", 4, "Shooter", "2K Boston");
        juegos[1] = new Videojuego("Unravel", 2, "Puzzle-platformer", "Coldwood Interactive");
        juegos[2] = new Videojuego("Little big planet", 3, "Plataforma", "Sony");
        juegos[3] = new Videojuego("Gris", 5, "Indie", "Devolver Digital");
        juegos[4] = new Videojuego("NieR:Automata", 4, "Hack and slash", "PlatinumGames");


        //Almacenar las horas estimadas de juegos en un array
        horas[0] = juegos[0].getHorasEstimadas();
        horas[1] = juegos[1].getHorasEstimadas();
        horas[2] = juegos[2].getHorasEstimadas();
        horas[3] = juegos[3].getHorasEstimadas();
        horas[4] = juegos[4].getHorasEstimadas();

        Arrays.sort(horas);


        //Entrega de algunos juegos y series
        series[2].entregar();
        series[4].entregar();
        juegos[1].entregar();
        juegos[4].entregar();


        //Bucle para marcar cuales estan entregados
        System.out.println("-----------------------------------");
        System.out.println("Series");
        for (int i = 0; i < series.length; i++) {
            if (series[i].isEntregado()) {
                contSeries++;
                System.out.print("Esta entregado: ");
                System.out.println(series[i].toString());
            }
        }
        //Bucle para marcar cuales estan entregados
        System.out.println("-----------------------------------");
        System.out.println("Juegos");
        for (int i = 0; i < juegos.length; i++) {
            if (juegos[i].isEntregado()) {
                contJuegos++;
                System.out.print("Esta entregado: ");
                System.out.println(juegos[i].toString());
            }
        }

        System.out.println("------------------------------------");
        System.out.println("El juego con más horas estimadas es: ");
        int horita = horas[4];
        for (int i = 0; i <juegos.length ; i++) {
            if(juegos[i].getHorasEstimadas()==horita){
                System.out.println(juegos[i].toString());
            }
        }
        System.out.println("------------------------------------");
        System.out.println("La serie con más temporadas es: ");
        int tempora = temporadas[4];
        for (int i = 0; i <series.length ; i++) {
            if(series[i].getNumTemporada()==tempora){
                System.out.println(series[i].toString());
            }
        }


    }


}
