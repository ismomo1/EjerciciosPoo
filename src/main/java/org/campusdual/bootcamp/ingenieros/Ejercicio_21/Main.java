package org.campusdual.bootcamp.ingenieros.Ejercicio_21;

import org.campusdual.bootcamp.ingenieros.Ejercicio_19.clases.Persistencia;
import org.campusdual.bootcamp.ingenieros.ejercicio_18.clases.Animal;

public class Main {
    public static void main(String[] args)
    {
        Animal.GenerarListaAleatoria(20);
        Animal.Crianza();
        Persistencia.GenerarCSV2();
        Animal.MostrarAntepasados(50);
    }
}