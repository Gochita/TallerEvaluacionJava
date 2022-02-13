package ejercicio17;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] array = new Electrodomestico[10];
        array[0] = new Lavadora(100,"NEGRO",'A',70,20);
        array[1] = new Television(100,"AZUL",'F',30,80,true);
        array[2] = new Lavadora(200,"ROJO",'B',40,30);
        array[3] = new Lavadora(100,"BLANCO",'F',10,10);
        array[4] = new Television(500,"NEGRO",'C',90,40,false);
        array[5] = new Lavadora(80,"NEGRO",'E',60,15);
        array[6] = new Lavadora(100,"AZUL",'D',70,20);
        array[7] = new Television(300,"NEGRO",'E',100,20,false);
        array[8] = new Lavadora(100,"ROJO",'C',20,20);
        array[9] = new Lavadora(300,"BLANCO",'F',80,10);
        calcularPrecio(array);
    }

    public static void calcularPrecio(Electrodomestico[] array) {
        int acuElec = 0, acuLava = 0, acuTele = 0;
        for (int i = 0; i < array.length; i++) {
             if(array[i] instanceof Lavadora){
                 acuLava+=array[i].precioFinal(array[i].getConsumoEnergetico(),array[i].getPeso());
             }else{
                 acuTele+=array[i].precioFinal(array[i].getConsumoEnergetico(),array[i].getPeso());
             }

        }
        System.out.println("------------------");
        System.out.println("El precio total por televisiones es: "+ acuTele);
        System.out.println("------------------");
        System.out.println("El precio total por lavadoras es: "+ acuLava);
        System.out.println("------------------");
        acuElec+=acuLava+acuTele;
        System.out.println("El precio total por todos los electrodomesticos es: "+ acuElec);


    }
}
