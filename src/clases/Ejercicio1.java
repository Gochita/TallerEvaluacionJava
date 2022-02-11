package clases;

public class Ejercicio1 {
    public static void main(String[] args) {
    int a=3;
    int b=-3;
    esMayor(a,b);
    }
    public static void esMayor(int a, int b){
        if(a>b){
            System.out.println(a+" es mayor que "+b);
        }else if(b>a){
            System.out.println(b+" es mayor que "+ a);
        }else if (a==b){
            System.out.println("ambos numeros son iguales");
        }

    }
}
