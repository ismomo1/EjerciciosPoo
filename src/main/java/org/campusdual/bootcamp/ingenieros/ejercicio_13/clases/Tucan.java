package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public class Tucan extends AnimalSalvaje {
    public Tucan(String tipo, String raza, Reino reino, Medio medio, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, sonido, desplazamiento);
    }

    public Tucan(Animal animal) {
        super(animal);
    }
}
