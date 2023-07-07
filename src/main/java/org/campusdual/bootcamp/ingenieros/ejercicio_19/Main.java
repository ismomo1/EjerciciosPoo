package org.campusdual.bootcamp.ingenieros.ejercicio_19;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.Animal;
import org.campusdual.bootcamp.ingenieros.ejercicio_19.clases.Persistencia;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.*;

public class Main {
    public static void main(String[] args)
    {
        Animal.GenerarListaAleatoria(10);
        Animal.Crianza(4);
        //Animal.MostrarLista(TipoLista.ANIMALES);
        Persistencia.GenerarCSV();
        Persistencia.GenerarCSV2();
    }
}