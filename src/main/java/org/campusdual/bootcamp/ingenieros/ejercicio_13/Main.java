package org.campusdual.bootcamp.ingenieros.ejercicio_13;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.*;

public class Main {
    public static void main(String[] args)
    {
        //Animal animal = new Animal("perro", "labrador", Animal.Reino.MAMIFERO, Animal.Medio.TERRESTRE, "guau", "correr");
        //animal.MostrarAnimal();
        Mascota mascota = new Mascota("perro", "labrador", Mascota.Reino.MAMIFERO, Mascota.Medio.TERRESTRE, "Ismael", "Max", "guau", "correr");
        mascota.MostrarAnimal();
        AnimalDeGranja animalDeGranja = new AnimalDeGranja("vaca", "pinta", AnimalDeGranja.Reino.MAMIFERO, AnimalDeGranja.Medio.TERRESTRE, "Ismael", "muu", "caminar");
        animalDeGranja.MostrarAnimal();
        Perro perro = new Perro("perro", "labrador", Perro.Reino.MAMIFERO, Perro.Medio.TERRESTRE, "Ismael", "Max", "guau", "correr");
        perro.MostrarAnimal();
        Tucan tucan = new Tucan("tucan", "comun", Tucan.Reino.AVE, Tucan.Medio.AEREO, "tucutucu", "volar");
        tucan.MostrarAnimal();
        AnimalSalvaje animalSalvaje = AnimalSalvaje.Clone(tucan);
        animalSalvaje.MostrarAnimal();
    }
}