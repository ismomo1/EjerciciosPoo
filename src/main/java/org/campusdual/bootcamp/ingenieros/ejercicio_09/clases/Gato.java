package org.campusdual.bootcamp.ingenieros.ejercicio_09.clases;

public class Gato extends Mascota{
    public Gato(String tipo, String raza, Reino reino, Medio medio, String propietario, String nombreMascota) {
        super(tipo, raza, reino, medio, propietario, nombreMascota);
    }

    public Gato(Mascota mascota) {
        super(mascota);
    }
}
