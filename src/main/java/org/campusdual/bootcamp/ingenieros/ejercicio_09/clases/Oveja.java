package org.campusdual.bootcamp.ingenieros.ejercicio_09.clases;

public class Oveja extends AnimalDeGranja{
    public Oveja(String tipo, String raza, Reino reino, Medio medio, String propietario) {
        super(tipo, raza, reino, medio, propietario);
    }

    public Oveja(AnimalDeGranja animalDeGranja) {
        super(animalDeGranja);
    }
}
