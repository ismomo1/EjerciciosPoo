package org.campusdual.bootcamp.ingenieros.ejercicio_20;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.Animal;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.TipoLista;
import org.campusdual.bootcamp.ingenieros.ejercicio_19.clases.Persistencia;

public class Main {
    public static void main(String[] args)
    {
        Persistencia.LeerCSV();
        Animal.DistribuirListaAnimales();
        //Animal.MostrarLista(TipoLista.MASCOTAS);
        //Animal.MostrarLista(Animal.TipoLista.ANIMALES);
    }
}