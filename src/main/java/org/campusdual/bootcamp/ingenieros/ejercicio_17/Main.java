package org.campusdual.bootcamp.ingenieros.ejercicio_17;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.Animal;

public class Main {
    public static void main(String[] args)
    {
        Animal.GenerarListaAleatoria(10);
        //Animal.AñadirALista(new Gato(ISexual.Sexo.MASCULINO), Animal.TipoLista.ANIMALES);
        //Animal.AñadirALista(new Gato(ISexual.Sexo.FEMENINO), Animal.TipoLista.ANIMALES);
        //Animal.MostrarLista(Animal.TipoLista.ANIMALES);
        System.out.println("------------------------------------------");
        Animal.Crianza(4);
        //Animal.MostrarLista(Animal.TipoLista.ANIMALES);
    }
}