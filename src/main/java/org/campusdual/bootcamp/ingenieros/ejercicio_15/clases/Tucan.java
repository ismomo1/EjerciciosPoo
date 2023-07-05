package org.campusdual.bootcamp.ingenieros.ejercicio_15.clases;

public class Tucan extends AnimalSalvaje {
    public Tucan(Sexo sexo) {
        super(sexo);
        this.tipo = "tucan";
        this.reino = Reino.AVE.name();
        this.medio = Medio.AEREO.name();
        this.sonido = "tucutucu";
        this.desplazamiento = "volar";
    }
    public Tucan(String tipo, String raza, Reino reino, Medio medio, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, sonido, desplazamiento);
    }

    public Tucan(Animal animal) {
        super(animal);
    }
}
