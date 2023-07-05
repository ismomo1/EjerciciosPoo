package org.campusdual.bootcamp.ingenieros.ejercicio_14.clases;

public class AnimalSalvaje extends Animal {
    public AnimalSalvaje() {

    }
    public AnimalSalvaje(String tipo)
    {
        super(tipo);
    }
    public AnimalSalvaje(String tipo, String raza, Reino reino, Medio medio, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, sonido, desplazamiento);
    }

    public AnimalSalvaje(Animal animal) {
        super(animal);
    }

    public static AnimalSalvaje Clone(AnimalSalvaje a){
        AnimalSalvaje animal = new AnimalSalvaje(a);
        return animal;
    }

    @Override
    public void ReproducirSonido() {
        System.out.println(this.sonido);
    }

    @Override
    public void Desplazamiento() {
        System.out.println(this.desplazamiento);
    }
}
