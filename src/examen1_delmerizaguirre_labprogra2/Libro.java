package examen1_delmerizaguirre_labprogra2;

import java.util.Date;

public class Libro {

    private String titulo;
    private String Descripcion;
    private byte puntaje;
    private int copiasDisponibles;
    private String genero;
    private double valor;
    private String autor;
    private Date punlicacion;

    public Libro() {
    }

    public Libro(String titulo, String Descripcion, byte puntaje, int copiasDisponibles, String genero, double valor, String autor, Date punlicacion) {
        this.titulo = titulo;
        this.Descripcion = Descripcion;
        this.puntaje = puntaje;
        this.copiasDisponibles = copiasDisponibles;
        this.genero = genero;
        this.valor = valor;
        this.autor = autor;
        this.punlicacion = punlicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public byte getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(byte puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getPunlicacion() {
        return punlicacion;
    }

    public void setPunlicacion(Date punlicacion) {
        this.punlicacion = punlicacion;
    }

    @Override
    public String toString() {
        return titulo + " Autor: " + autor;
    }

}
