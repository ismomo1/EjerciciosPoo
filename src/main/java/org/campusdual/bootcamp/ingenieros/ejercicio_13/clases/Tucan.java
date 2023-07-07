package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public class Tucan extends AnimalSalvaje {
    public Tucan(Sexo sexo) {
        super(sexo);
        this.tipo = Tipo.TUCAN;
        this.reino = Reino.AVE;
        this.medio = Medio.AEREO;
        this.sonido = "tucutucu";
        this.desplazamiento = "volar";
    }

    public Tucan(String raza) {
        super(raza);
        this.tipo = Tipo.TUCAN;
        this.reino = Reino.AVE;
        this.medio = Medio.AEREO;
        this.sonido = "tucutucu";
        this.desplazamiento = "volar";
    }

    public Tucan(Tucan tucan) {
        super(tucan);
    }
}
