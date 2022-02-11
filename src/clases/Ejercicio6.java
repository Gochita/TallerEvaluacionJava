package clases;

public class Ejercicio6 {
    /*
     * Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle for
     * */
    public static void main(String[] args) {
        System.out.println("Los numeros pares del 1 al 100 son: ");
        imprimirPares();
        System.out.println("-------------------------------------------------");
        System.out.println("Los numeros impares del 1 al 100 son: ");
        imprimiImpares();


    }

    public static void imprimirPares() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void imprimiImpares() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
