package consola;

public class Ejercicio5 {
    public static void main(String[] args) {
        int cont = 0;
        int numero = 1;
        System.out.println("Los numeros impares son:");
        while (cont < 100) {
            if (numero % 2 != 0) {
                System.out.println(numero);

                cont++;
            } else {
                cont++;
            }
            numero++;
        }
        cont=0;
        numero=1;
        System.out.println("Los numeros pares son: ");
        while (cont < 100) {
            if (numero % 2 == 0) {
                System.out.println(numero);

                cont++;
            } else {
                cont++;
            }
            numero++;
        }
    }
}
