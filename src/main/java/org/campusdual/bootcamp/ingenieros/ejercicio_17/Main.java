package org.campusdual.bootcamp.ingenieros.ejercicio_17;

import org.campusdual.bootcamp.ingenieros.ejercicio_17.clases.Animal;
import org.campusdual.bootcamp.ingenieros.ejercicio_17.clases.Gato;
import org.campusdual.bootcamp.ingenieros.ejercicio_17.clases.ISexual;

public class Main {
    public static void main(String[] args)
    {
        Animal.GenerarListaAleatoria(10);
        //Animal.AñadirALista(new Gato(ISexual.Sexo.MASCULINO), Animal.TipoLista.ANIMALES);
        //Animal.AñadirALista(new Gato(ISexual.Sexo.FEMENINO), Animal.TipoLista.ANIMALES);
        //Animal.MostrarLista(Animal.TipoLista.ANIMALES);
        System.out.println("------------------------------------------");
        Animal.Crianza();
        Animal.MostrarLista(Animal.TipoLista.ANIMALES);
    }
}