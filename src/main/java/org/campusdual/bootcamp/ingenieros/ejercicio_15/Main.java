package org.campusdual.bootcamp.ingenieros.ejercicio_15;

import org.campusdual.bootcamp.ingenieros.ejercicio_15.clases.*;

public class Main {
    public static void main(String[] args)
    {
        Animal.AñadirALista(new Gato(ISexual.Sexo.MASCULINO), Animal.TipoLista.ANIMALES);
        Animal.AñadirALista(new Gato(ISexual.Sexo.FEMENINO), Animal.TipoLista.ANIMALES);
        Animal.AñadirALista(new Oveja(ISexual.Sexo.MASCULINO), Animal.TipoLista.ANIMALES);
        Animal.AñadirALista(new Oveja(ISexual.Sexo.FEMENINO), Animal.TipoLista.ANIMALES);
        Animal.AñadirALista(new Perro(ISexual.Sexo.MASCULINO), Animal.TipoLista.ANIMALES);
        Animal.AñadirALista(new Perro(ISexual.Sexo.FEMENINO), Animal.TipoLista.ANIMALES);
        Animal.AñadirALista(new PezPayaso(ISexual.Sexo.MASCULINO), Animal.TipoLista.ANIMALES);
        Animal.AñadirALista(new PezPayaso(ISexual.Sexo.FEMENINO), Animal.TipoLista.ANIMALES);
        Animal.AñadirALista(new Tucan(ISexual.Sexo.MASCULINO), Animal.TipoLista.ANIMALES);
        Animal.AñadirALista(new Tucan(ISexual.Sexo.FEMENINO), Animal.TipoLista.ANIMALES);
        Animal.AñadirALista(new Vaca(ISexual.Sexo.MASCULINO), Animal.TipoLista.ANIMALES);
        Animal.AñadirALista(new Vaca(ISexual.Sexo.FEMENINO), Animal.TipoLista.ANIMALES);
        Animal.MostrarLista(Animal.TipoLista.ANIMALES);
        Animal.DistribuirListaAnimales();
        Animal.MostrarLista(Animal.TipoLista.ANIMALESSALVAJES);
        Animal.MostrarLista(Animal.TipoLista.ANIMALESDEGRANJA);
        Animal.MostrarLista(Animal.TipoLista.MASCOTAS);
    }
}