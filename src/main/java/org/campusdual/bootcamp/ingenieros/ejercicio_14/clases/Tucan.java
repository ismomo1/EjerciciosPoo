package org.campusdual.bootcamp.ingenieros.ejercicio_14.clases;

public class Tucan extends AnimalSalvaje {
    public Tucan()
    {
        super();
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
