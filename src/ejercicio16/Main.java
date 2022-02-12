package ejercicio16;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cEdad = 0;
        int peso1,peso2,peso3;
        Persona p1;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nombre = leer.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = leer.nextInt();
        System.out.println("Ingrese su sexo: ");
        char sexo = leer.next().charAt(0);
        System.out.print("Ingrese su peso: ");
        double peso = leer.nextDouble();
        System.out.println("Ingrese su altura: ");
        double altura = leer.nextDouble();


        p1 = new Persona(nombre, edad, sexo, altura, peso);

        Persona p2 = new Persona(nombre, edad, sexo);

        Persona p3 = new Persona();
        p3.setNombre("Elon Musk");
        p3.setEdad(50);
        p3.setSexo('H');
        p3.setAltura(1.80);
        p3.setPeso(60);
        p3.setNacionalidad("Estados Unidos");

        System.out.println("---------------------------");
        System.out.println(p1.toString());
        if (p1.esMayorDeEdad(p1.getEdad())) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        peso1 = p1.calcularIMC(p1.getPeso(), p1.getAltura());
        if (peso1 == -1) {
            System.out.println("Esta en su peso ideal");
        }else if(peso1==1){
            System.out.println("Esta en sobrepeso");
        }else if(peso==0){
            System.out.println("Esta por debajo del peso ideal");

        }


        System.out.println("---------------------------");
        System.out.println(p2.toString());
        if (p2.esMayorDeEdad(p2.getEdad())) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        peso2 = p2.calcularIMC(p2.getPeso(), p2.getAltura());
        if (peso2 == -1) {
            System.out.println("Esta en su peso ideal");
        }else if(peso2==1){
            System.out.println("Esta en sobrepeso");
        }else if(peso2==0){
            System.out.println("Esta por debajo del peso ideal");

        }

        System.out.println("---------------------------");
        System.out.println(p3.toString());
        if (p3.esMayorDeEdad(p3.getEdad())) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        peso3 = p3.calcularIMC(p1.getPeso(), p3.getAltura());
        if (peso3 == -1) {
            System.out.println("Esta en su peso ideal");
        }else if(peso3==1){
            System.out.println("Esta en sobrepeso");
        }else if(peso3==0){
            System.out.println("Esta por debajo del peso ideal");

        }

    }
}
