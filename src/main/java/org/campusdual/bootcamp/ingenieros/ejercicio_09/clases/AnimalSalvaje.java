package org.campusdual.bootcamp.ingenieros.ejercicio_09.clases;

public class AnimalSalvaje extends Animal{
    public AnimalSalvaje(String tipo, String raza, Reino reino, Medio medio) {
        super(tipo, raza, reino, medio);
    }

    public AnimalSalvaje(Animal animal) {
        super(animal);
    }
}
