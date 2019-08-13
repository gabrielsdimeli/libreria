package ar.com.mercadolibre.libreria;

import java.util.Date;

public class LibroNovela extends Libro implements LibroAlquilable {

    private String autor;
    private String edicion;

    public LibroNovela(String autor, String edicion) {
        this.autor = autor;
        this.edicion = edicion;

    }

    @Override
    public void alquilar() {
        Alquiler alquiler = new Alquiler(this, new Date(), null);
        //this.libreria.agregarAlquiler(alquiler);
    }

    @Override
    public void devolver() {

    }
}
