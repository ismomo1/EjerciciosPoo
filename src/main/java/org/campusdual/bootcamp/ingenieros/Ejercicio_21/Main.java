package org.campusdual.bootcamp.ingenieros.Ejercicio_21;

import org.campusdual.bootcamp.ingenieros.Ejercicio_19.clases.Persistencia;
import org.campusdual.bootcamp.ingenieros.ejercicio_18.clases.Animal;
import org.campusdual.bootcamp.ingenieros.util.Input;

public class Main {
    public static void main(String[] args)
    {
        Animal.GenerarListaAleatoria(20);
        Animal.Crianza();
        System.out.println("Indroduzca el ID del animal del que desea conocer los antepasados:");
        int n = Input.integer();
        Animal.MostrarAntepasados(n);
    }
}