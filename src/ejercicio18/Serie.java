package ejercicio18;

public class Serie implements Entregable{
    //Atributos
    protected String titulo;
    protected int numTemporada;
    protected boolean entregado;
    protected String genero;
    protected String creador;
    //Constantes
    final int numDef = 3;
    final boolean entrDef = false;

    public Serie() {
    this.titulo="";
    this.numTemporada=numDef;
    this.entregado=entrDef;
    this.genero="";
    this.creador="";
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numTemporada=numDef;
        this.entregado=entrDef;
        this.genero="";
    }

    public Serie(String titulo, int numTemporada, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporada = numTemporada;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numTemporada=" + numTemporada +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    @Override
    public void entregar() {
        entregado=true;
    }

    @Override
    public void devolver() {
        entregado=false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
