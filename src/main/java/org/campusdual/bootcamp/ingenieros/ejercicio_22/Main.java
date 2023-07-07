package org.campusdual.bootcamp.ingenieros.ejercicio_22;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.Animal;
import org.campusdual.bootcamp.ingenieros.ejercicio_22.clases.Granjero;
import org.campusdual.bootcamp.ingenieros.ejercicio_22.clases.NombresGranjeros;

public class Main {
    public static void main(String[] args)
    {
        Animal.GenerarListaAleatoria(20);
        //Animal.Crianza(4);
        Granjero.GenerarListaGranjeros();
        Granjero.MostrarListaGranjeros();
        Granjero.AsignarAnimalesLista();
        //Granjero.MostrarListaAnimales(NombresGranjeros.ANA.name());
        Granjero.MostrarListaAnimalesTodos();
        /*System.out.println("Indroduzca el ID del animal del que desea conocer los antepasados:");
        int n = Input.integer();
        Animal.MostrarAntepasados(n);*/
    }
}