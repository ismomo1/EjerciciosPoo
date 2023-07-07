package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public class Perro extends Mascota {

    public Perro(Sexo sexo) {
        super(sexo);
        this.tipo = Tipo.PERRO;
        this.reino = Reino.MAMIFERO;
        this.medio = Medio.TERRESTRE;
        this.sonido = "guau";
        this.desplazamiento = "correr";
    }

    public Perro(String raza, String propietario, String nombreMascota) {
        super(raza, propietario, nombreMascota);
        this.tipo = Tipo.PERRO;
        this.reino = Reino.MAMIFERO;
        this.medio = Medio.TERRESTRE;
        this.sonido = "guau";
        this.desplazamiento = "correr";
    }

    public Perro(Perro perro) {
        super(perro);
    }
}
