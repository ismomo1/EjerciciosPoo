package org.campusdual.bootcamp.ingenieros.ejercicio_18;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.Animal;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.TipoLista;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.*;

public class Main {
    public static void main(String[] args)
    {
        Animal.GenerarListaAleatoria(10);
        Animal.MostrarLista(TipoLista.ANIMALES);
    }
}