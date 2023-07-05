package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public class PezPayaso extends AnimalSalvaje {
    public PezPayaso(String tipo, String raza, Reino reino, Medio medio, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, sonido, desplazamiento);
    }

    public PezPayaso(Animal animal) {
        super(animal);
    }
}
