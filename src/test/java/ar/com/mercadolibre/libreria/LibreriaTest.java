package ar.com.mercadolibre.libreria;

import org.junit.Test;

public class LibreriaTest {

    @Test
    public void alquilarNovela(){
        LibroNovela novela = new LibroNovela("A", "B");
        novela.alquilar();
    }

}
