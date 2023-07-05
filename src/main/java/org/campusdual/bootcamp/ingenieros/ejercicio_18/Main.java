package org.campusdual.bootcamp.ingenieros.ejercicio_18;

import org.campusdual.bootcamp.ingenieros.ejercicio_18.clases.Animal;
import org.campusdual.bootcamp.ingenieros.ejercicio_18.clases.Gato;
import org.campusdual.bootcamp.ingenieros.ejercicio_18.clases.ISexual;

public class Main {
    public static void main(String[] args)
    {
        Animal.GenerarListaAleatoria(10);
        Animal.MostrarLista(Animal.TipoLista.ANIMALES);
    }
}