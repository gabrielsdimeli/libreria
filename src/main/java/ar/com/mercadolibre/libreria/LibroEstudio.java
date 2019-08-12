package ar.com.mercadolibre.libreria;

public class LibroEstudio implements LibroAlquilable {

    private String temaEstudio;

    public LibroEstudio(String temaEstudio) {
        this.temaEstudio = temaEstudio;
    }

    @Override
    public void alquilar() {

    }

    @Override
    public void devolver() {

    }
}
