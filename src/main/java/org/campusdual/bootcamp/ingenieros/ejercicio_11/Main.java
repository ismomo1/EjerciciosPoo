package org.campusdual.bootcamp.ingenieros.ejercicio_11;

import org.campusdual.bootcamp.ingenieros.ejercicio_09.clases.Animal;
import org.campusdual.bootcamp.ingenieros.ejercicio_09.clases.AnimalDeGranja;
import org.campusdual.bootcamp.ingenieros.ejercicio_09.clases.Mascota;

public class Main {
    public static void main(String[] args)
    {
        Animal animal = new Animal("perro", "labrador", Animal.Reino.MAMIFERO, Animal.Medio.TERRESTRE);
        animal.MostrarAnimal();
        Mascota mascota = new Mascota("perro", "labrador", Mascota.Reino.MAMIFERO, Mascota.Medio.TERRESTRE, "Ismael", "Max");
        mascota.MostrarAnimal();
        AnimalDeGranja animalDeGranja = new AnimalDeGranja("vaca", "pinta", AnimalDeGranja.Reino.MAMIFERO, AnimalDeGranja.Medio.TERRESTRE, "Ismael");
        animalDeGranja.MostrarAnimal();
    }
}