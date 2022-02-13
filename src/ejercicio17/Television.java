package ejercicio17;

public class Television extends Electrodomestico{
   //constantes
    private final int resoDef=20;
    private final boolean tdtDef=false;
    //Atributos
    private int resolucion;
    private boolean tdt;

    public Television() {
    }
    public Television(double precioBase, double peso){
        super(precioBase,peso);
        this.resolucion=resoDef;
        this.tdt=tdtDef;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean tdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTdt() {
        return tdt;
    }

    @Override
    public double precioFinal(char consumo, double peso) {
        double extra=0,extra2=0;
        double precio = super.precioFinal(consumo, peso);
        if(resolucion>40){
            extra+=(extra*0.3);
        }
        if(tdt){
            extra2=50;
        }
        precio+=extra+extra2;
        return precio;
    }
}
