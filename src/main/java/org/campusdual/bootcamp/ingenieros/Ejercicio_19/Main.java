package org.campusdual.bootcamp.ingenieros.Ejercicio_19;

import org.campusdual.bootcamp.ingenieros.Ejercicio_19.clases.Persistencia;
import org.campusdual.bootcamp.ingenieros.ejercicio_18.clases.Animal;

public class Main {
    public static void main(String[] args)
    {
        Animal.GenerarListaAleatoria(10);
        Animal.MostrarLista(Animal.TipoLista.ANIMALES);
        Persistencia.GenerarCSV();
        Persistencia.GenerarCSV2();
    }
}