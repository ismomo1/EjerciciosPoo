package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public class Gato extends Mascota {

    public Gato(Sexo sexo) {
        super(sexo);
        this.tipo = Tipo.GATO;
        this.reino = Reino.MAMIFERO;
        this.medio = Medio.TERRESTRE;
        this.sonido = "miau";
        this.desplazamiento = "caminar";
    }
    public Gato(String raza, String propietario, String nombreMascota) {
        super(raza, propietario, nombreMascota);
        this.tipo = Tipo.GATO;
        this.reino = Reino.MAMIFERO;
        this.medio = Medio.TERRESTRE;
        this.sonido = "miau";
        this.desplazamiento = "caminar";
    }

    public Gato(Gato gato) {
        super(gato);
    }
}
