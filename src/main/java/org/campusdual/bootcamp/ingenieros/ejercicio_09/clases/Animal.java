package org.campusdual.bootcamp.ingenieros.ejercicio_09.clases;

public class Animal {
    public enum Reino {
        MAMIFERO,
        AVE,
        REPTIL,
        ANFIBIO,
        PEZ
    }

    public enum Medio {
        ACUATICO,
        AEREO,
        TERRESTRE
    }

    private String tipo, raza, reino, medio;

    private boolean clone;

    public Animal(String tipo, String raza, Reino reino, Medio medio) {
        this.tipo = tipo;
        this.raza = raza;
        this.reino = reino.toString();
        this.medio = medio.toString();
        this.clone = false;
    }

    public Animal(Animal animal)
    {
        this.tipo = animal.tipo;
        this.raza = animal.raza;
        this.reino = animal.reino;
        this.medio = animal.medio;
        this.clone = true;
    }

    public Animal Clone(Animal a){
        Animal animal = new Animal(a);
        return animal;
    }

    public void MostrarAnimal()
    {
        System.out.printf("Reino: %s\nMedio: %s\nTipo: %s\nRaza: %s\nClone: %b", this.reino, this.medio, this.tipo, this.raza, this.clone);
    }
}
