package org.campusdual.bootcamp.ingenieros.ejercicio_13;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.*;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.*;

public class Main {
    public static void main(String[] args)
    {
        //Animal animal = new Animal("perro", "labrador", Animal.Reino.MAMIFERO, Animal.Medio.TERRESTRE, "guau", "correr");
        //animal.MostrarAnimal();
        Mascota mascota = new Mascota(Tipo.PERRO, "labrador", Reino.MAMIFERO, Medio.TERRESTRE, "Ismael", "Max", "guau", "correr");
        //mascota.MostrarAnimal();
        AnimalDeGranja animalDeGranja = new AnimalDeGranja(Tipo.VACA, "pinta", Reino.MAMIFERO, Medio.TERRESTRE, "Ismael", "muu", "caminar");
        //animalDeGranja.MostrarAnimal();
        Perro perro = new Perro("labrador", "Ismael", "Max");
        //perro.MostrarAnimal();
        Tucan tucan = new Tucan("comun");
        //tucan.MostrarAnimal();
        AnimalSalvaje animalSalvaje = AnimalSalvaje.Clone(tucan);
        //animalSalvaje.MostrarAnimal();
        mascota.ReproducirSonido();
        mascota.Desplazamiento();
        animalDeGranja.ReproducirSonido();
        animalDeGranja.Desplazamiento();
        perro.ReproducirSonido();
        perro.Desplazamiento();
        tucan.ReproducirSonido();
        tucan.Desplazamiento();
    }
}