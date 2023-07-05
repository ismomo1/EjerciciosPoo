package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public class Gato extends Mascota {

    public Gato(String tipo, String raza, Reino reino, Medio medio, String propietario, String nombreMascota, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, propietario, nombreMascota, sonido, desplazamiento);
    }

    public Gato(Mascota mascota) {
        super(mascota);
    }
}
