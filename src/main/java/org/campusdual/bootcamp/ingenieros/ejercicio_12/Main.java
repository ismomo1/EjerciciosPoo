package org.campusdual.bootcamp.ingenieros.ejercicio_12;

import org.campusdual.bootcamp.ingenieros.ejercicio_12.clases.Animal;
import org.campusdual.bootcamp.ingenieros.ejercicio_12.clases.AnimalDeGranja;
import org.campusdual.bootcamp.ingenieros.ejercicio_12.clases.Mascota;
import org.campusdual.bootcamp.ingenieros.ejercicio_12.clases.AnimalSalvaje;
import org.campusdual.bootcamp.ingenieros.ejercicio_12.clases.Perro;
import org.campusdual.bootcamp.ingenieros.ejercicio_12.clases.Tucan;

public class Main {
    public static void main(String[] args)
    {
        Animal animal = new Animal("perro", "labrador", Animal.Reino.MAMIFERO, Animal.Medio.TERRESTRE);
        animal.MostrarAnimal();
        Mascota mascota = new Mascota("perro", "labrador", Mascota.Reino.MAMIFERO, Mascota.Medio.TERRESTRE, "Ismael", "Max");
        mascota.MostrarAnimal();
        AnimalDeGranja animalDeGranja = new AnimalDeGranja("vaca", "pinta", AnimalDeGranja.Reino.MAMIFERO, AnimalDeGranja.Medio.TERRESTRE, "Ismael");
        animalDeGranja.MostrarAnimal();
        Perro perro = new Perro("perro", "labrador", Perro.Reino.MAMIFERO, Perro.Medio.TERRESTRE, "Ismael", "Max");
        perro.MostrarAnimal();
        Tucan tucan = new Tucan("tucan", "comun", Tucan.Reino.AVE, Tucan.Medio.AEREO);
        tucan.MostrarAnimal();
        Animal aniClone = Tucan.Clone(tucan);
        aniClone.MostrarAnimal();
    }
}