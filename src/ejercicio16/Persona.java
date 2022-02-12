package ejercicio16;

import java.util.Random;

public class Persona {
    final char defecto = 'H';
    private String nombre = "";
    private int edad = 0;
    private String dni;
    private char sexo = defecto;
    private double altura = 0;
    private double peso = 0;
    private String nacionalidad = "Colombia";
    final int pesoIdeal = -1;
    final int pesoDebajo = 0;
    final int pesoEncima = 1;
    Random random = new Random();

    //Constructor por defecto
    public Persona() {
        this.nombre="";
        this.edad=0;
        this.altura=0;
        this.peso=0;
        this.sexo=defecto;
        this.nacionalidad="";
        this.dni = generaDNI();
    }
    //Segundo constructor
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edadReal(edad);
        this.sexo = comprobarSexo(sexo);
        this.altura = 0;
        this.peso = 0;
        this.nacionalidad = "";
        this.dni = generaDNI();
    }

//Tercer constructor

    public Persona(String nombre, int edad, char sexo, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edadReal(edad);
        this.dni = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.altura = altura;
        this.peso = peso;
        this.nacionalidad = nacionalidad;
    }


    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int calcularIMC(double peso, double altura) {
        int valor = 0;
        double imc = 0;
        imc = peso / (Math.pow(altura, 2));
        if (imc < 20)
            valor = pesoIdeal;

        if (imc >= 20 && imc <= 25)
            valor = pesoDebajo;

        if (imc > 25)
            valor = pesoEncima;

        return valor;
    }

    public boolean esMayorDeEdad(int edad) {
        boolean flag;
        if (edad >= 18) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public int edadReal(int edad) {
        if(edad <0 || edad>100){
        return edad = 10;
        }
        return edad;

    }

    public char comprobarSexo(char sexo) {

        if (sexo == 'h') {
            sexo = 'H';
        } else if (sexo == 'f') {
            sexo = 'F';
        } else if (sexo != 'H' && sexo != 'F') {
            sexo = 'H';
        }
        return sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombre: '" + nombre + '\'' +
                ", Edad: " + edad +
                ", Dni: " + dni +
                ", Sexo: " + sexo +
                ", Altura: " + altura +
                ", Peso: " + peso +
                ", Nacionalidad='" + nacionalidad + '\'' +
                '}';
    }

    public String generaDNI() {
        int numero = (int) (100000000 * Math.random());
        char randomizedCharacter = (char) (random.nextInt(26) + 'a');
        String dni = String.valueOf(numero) + randomizedCharacter;
        return dni;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
