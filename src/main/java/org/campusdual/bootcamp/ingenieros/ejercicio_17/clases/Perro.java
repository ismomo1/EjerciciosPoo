package org.campusdual.bootcamp.ingenieros.ejercicio_17.clases;

public class Perro extends Mascota {

    public Perro(Sexo sexo) {
        super(sexo);
        this.tipo = "perro";
        this.reino = Reino.MAMIFERO.name();
        this.medio = Medio.TERRESTRE.name();
        this.sonido = "guau";
        this.desplazamiento = "correr";
    }
    public Perro(String tipo, String raza, Reino reino, Medio medio, String propietario, String nombreMascota, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, propietario, nombreMascota, sonido, desplazamiento);
    }

    public Perro(Mascota mascota) {
        super(mascota);
    }
}
