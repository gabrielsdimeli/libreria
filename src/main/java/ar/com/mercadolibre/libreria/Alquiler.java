package ar.com.mercadolibre.libreria;

import java.util.Date;

public class Alquiler {
    private Libro libroAlquilado;
    private Date fechaAlquilado;
    private Date fechaDevolucion;

    public Alquiler(Libro libroAlquilado, Date fechaAlquilado, Date fechaDevolucion) {
        this.libroAlquilado = libroAlquilado;
        this.fechaAlquilado = fechaAlquilado;
        this.fechaDevolucion = fechaDevolucion;
    }
}
