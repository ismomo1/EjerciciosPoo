package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public class Vaca extends AnimalDeGranja {

    public Vaca(String tipo, String raza, Reino reino, Medio medio, String propietario, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, propietario, sonido, desplazamiento);
    }

    public Vaca(AnimalDeGranja animalDeGranja) {
        super(animalDeGranja);
    }
}
