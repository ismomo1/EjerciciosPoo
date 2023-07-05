package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public abstract class Animal {
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

    protected String tipo, raza, reino, medio, sonido, desplazamiento;

    protected boolean clone;

    public Animal(String tipo, String raza, Reino reino, Medio medio, String sonido, String desplazamiento) {
        this.tipo = tipo;
        this.raza = raza;
        this.reino = reino.toString();
        this.medio = medio.toString();
        this.sonido = sonido;
        this.desplazamiento = desplazamiento;
        this.clone = false;
    }

    public Animal(Animal animal)
    {
        this.tipo = animal.tipo;
        this.raza = animal.raza;
        this.reino = animal.reino;
        this.medio = animal.medio;
        this.sonido = animal.sonido;
        this.desplazamiento = animal.desplazamiento;
        this.clone = true;
    }

    /*public Animal Clone(Animal a);{
        Animal animal = new Animal(a);
        return animal;
    }*/
    public abstract void ReproducirSonido();
    public abstract void Desplazamiento();

    public void MostrarAnimal()
    {
        System.out.printf("Reino: %s\nMedio: %s\nTipo: %s\nRaza: %s\nSonido: %s\nDesplazamiento: %s\nClone: %b\n\n", this.reino, this.medio, this.tipo, this.raza, this.sonido, this.desplazamiento, this.clone);
    }
}
