package org.campusdual.bootcamp.ingenieros.ejercicio_10;

import org.campusdual.bootcamp.ingenieros.ejercicio_09.clases.Animal;

public class Main {
    public static void main(String[] args)
    {
        Animal animal = new Animal("perro", "labrador", Animal.Reino.MAMIFERO, Animal.Medio.TERRESTRE);
        animal.MostrarAnimal();
    }
}