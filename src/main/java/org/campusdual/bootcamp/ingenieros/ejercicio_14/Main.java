package org.campusdual.bootcamp.ingenieros.ejercicio_14;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.*;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.*;

public class Main {
    public static void main(String[] args)
    {
        Animal.AñadirALista(new Gato(ISexual.Sexo.MASCULINO), TipoLista.ANIMALES);
        Animal.AñadirALista(new Gato(ISexual.Sexo.FEMENINO), TipoLista.ANIMALES);
        Animal.AñadirALista(new Oveja(ISexual.Sexo.MASCULINO), TipoLista.ANIMALES);
        Animal.AñadirALista(new Oveja(ISexual.Sexo.FEMENINO), TipoLista.ANIMALES);
        Animal.AñadirALista(new Perro(ISexual.Sexo.MASCULINO), TipoLista.ANIMALES);
        Animal.AñadirALista(new Perro(ISexual.Sexo.FEMENINO), TipoLista.ANIMALES);
        Animal.AñadirALista(new PezPayaso(ISexual.Sexo.MASCULINO), TipoLista.ANIMALES);
        Animal.AñadirALista(new PezPayaso(ISexual.Sexo.FEMENINO), TipoLista.ANIMALES);
        Animal.AñadirALista(new Tucan(ISexual.Sexo.MASCULINO), TipoLista.ANIMALES);
        Animal.AñadirALista(new Tucan(ISexual.Sexo.FEMENINO), TipoLista.ANIMALES);
        Animal.AñadirALista(new Vaca(ISexual.Sexo.MASCULINO), TipoLista.ANIMALES);
        Animal.AñadirALista(new Vaca(ISexual.Sexo.FEMENINO), TipoLista.ANIMALES);
        Animal.MostrarLista(TipoLista.ANIMALES);
    }
}