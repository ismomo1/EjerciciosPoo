package org.campusdual.bootcamp.ingenieros.ejercicio_12.clases;

public class Perro extends Mascota{
    public Perro(String tipo, String raza, Reino reino, Medio medio, String propietario, String nombreMascota) {
        super(tipo, raza, reino, medio, propietario, nombreMascota);
    }

    public Perro(Mascota mascota) {
        super(mascota);
    }
}
