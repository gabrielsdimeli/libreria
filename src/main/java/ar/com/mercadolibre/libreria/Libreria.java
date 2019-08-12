package ar.com.mercadolibre.libreria;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private static Libreria unico = new Libreria();

    private List<Alquiler> alquileres = new ArrayList<>();
    private Libreria(){}

    public Libreria getInstance(){
        return unico;
    }

    public void agregarAlquiler(Alquiler alquiler){
        alquileres.add(alquiler);
    }

    public Alquiler buscarAlquiler(){

        return null;
    }

    public List<Alquiler> listarAlquiler(){

        return null;
    }

}
