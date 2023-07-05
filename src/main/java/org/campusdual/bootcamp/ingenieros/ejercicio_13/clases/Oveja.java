package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public class Oveja extends AnimalDeGranja {

    public Oveja(String tipo, String raza, Reino reino, Medio medio, String propietario, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, propietario, sonido, desplazamiento);
    }

    public Oveja(AnimalDeGranja animalDeGranja) {
        super(animalDeGranja);
    }
}
