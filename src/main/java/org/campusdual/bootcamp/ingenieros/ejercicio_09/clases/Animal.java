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

    public Animal(String tipo, String raza, Reino reino, Medio medio) {
        this.tipo = tipo;
        this.raza = raza;
        this.reino = reino.toString();
        this.medio = medio.toString();
    }

    public Animal(Animal animal)
    {
        this.tipo = animal.tipo;
        this.raza = animal.raza;
        this.reino = animal.reino;
        this.medio = animal.medio;
    }

    public static Animal Clone(Animal a){
        Animal animal = new Animal(a);
        return animal;
    }

    public String ToString()
    {
        String animal = "Reino: " + this.reino + "\nMedio: " + this.medio + "\nTipo: " + this.tipo + "\nRaza: " + this.raza + "\n\n";
        return animal;
    }

    public void MostrarAnimal()
    {
        //System.out.printf("Reino: %s\nMedio: %s\nTipo: %s\nRaza: %s\n", this.reino, this.medio, this.tipo, this.raza);
        System.out.println(this.ToString());
    }
}
