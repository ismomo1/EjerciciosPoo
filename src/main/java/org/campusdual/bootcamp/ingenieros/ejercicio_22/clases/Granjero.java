package org.campusdual.bootcamp.ingenieros.ejercicio_22.clases;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.Animal;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.TipoLista;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Granjero {
    protected String nombre;
    protected ArrayList<Animal> listaAnimales = new ArrayList<>();
    private static ArrayList<Granjero> listaGranjeros = new ArrayList<>();

    public Granjero(String nombre)
    {
        this.nombre = nombre;
    }

    public static void GenerarListaGranjeros()
    {
        NombresGranjeros[] nombres = NombresGranjeros.values();
        for (int i = 0; i < NombresGranjeros.values().length; i++) {
            Granjero.listaGranjeros.add(new Granjero(nombres[i].name()));
        }
    }

    public static void MostrarListaGranjeros()
    {
        System.out.println("----------LISTA DE GRANJEROS----------");
        for (Granjero granjero : listaGranjeros) {
            System.out.println(granjero.nombre);
        }
    }

    public static void AsignarAnimalesLista()
    {
        for (Animal animal : Animal.getListaAnimales()) {
            if (Objects.equals(animal.getTipoLista(), TipoLista.ANIMALESDEGRANJA.name())) {
                for (Granjero granjero : Granjero.listaGranjeros) {
                    if (Objects.equals(granjero.nombre, animal.getPropietario())) {
                        granjero.listaAnimales.add(animal);
                    }
                }
            }
        }
    }

    public static void MostrarListaAnimales (String nombreGranjero)
    {
        for (Granjero granjero : listaGranjeros) {
            if (Objects.equals(granjero.nombre, nombreGranjero)) {
                System.out.printf("----------LISTA DE ANIMALES DE %s----------\n", granjero.nombre);
                if (!granjero.listaAnimales.isEmpty()) {
                    for (Animal animal : granjero.listaAnimales) {
                        animal.MostrarAnimal();
                    }
                    return;
                } else {
                    System.out.println("No posee ningún animal.");
                    return;
                }
            }
        }
        System.out.printf("No hay ningún granjero llamado %s.\n", nombreGranjero);
    }

    public static void MostrarListaAnimalesTodos ()
    {
        for (Granjero granjero : listaGranjeros) {
            Granjero.MostrarListaAnimales(granjero.nombre);
        }
    }

    public static String NombreGranjeroAleatorio() {
        Random random = new Random();
        int i = random.nextInt(NombresGranjeros.values().length);
        NombresGranjeros[] nombres = NombresGranjeros.values();
        return nombres[i].name();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static ArrayList<Granjero> getListaGranjeros() {
        return listaGranjeros;
    }
}
