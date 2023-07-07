package org.campusdual.bootcamp.ingenieros.ejercicio_09.clases;

public class Vaca extends AnimalDeGranja{
    public Vaca(String tipo, String raza, Reino reino, Medio medio, String propietario) {
        super(tipo, raza, reino, medio, propietario);
    }

    public Vaca(AnimalDeGranja animalDeGranja) {
        super(animalDeGranja);
    }
}
