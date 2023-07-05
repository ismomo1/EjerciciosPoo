package org.campusdual.bootcamp.ingenieros.ejercicio_14;

import org.campusdual.bootcamp.ingenieros.ejercicio_14.clases.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Animal.AñadirALista(new Gato(ISexual.Sexo.MASCULINO));
        Animal.AñadirALista(new Gato(ISexual.Sexo.FEMENINO));
        Animal.AñadirALista(new Oveja(ISexual.Sexo.MASCULINO));
        Animal.AñadirALista(new Oveja(ISexual.Sexo.FEMENINO));
        Animal.AñadirALista(new Perro(ISexual.Sexo.MASCULINO));
        Animal.AñadirALista(new Perro(ISexual.Sexo.FEMENINO));
        Animal.AñadirALista(new PezPayaso(ISexual.Sexo.MASCULINO));
        Animal.AñadirALista(new PezPayaso(ISexual.Sexo.FEMENINO));
        Animal.AñadirALista(new Tucan(ISexual.Sexo.MASCULINO));
        Animal.AñadirALista(new Tucan(ISexual.Sexo.FEMENINO));
        Animal.AñadirALista(new Vaca(ISexual.Sexo.MASCULINO));
        Animal.AñadirALista(new Vaca(ISexual.Sexo.FEMENINO));
        Animal.MostrarLista();
    }
}