package org.campusdual.bootcamp.ingenieros.ejercicio_15.clases;

public class PezPayaso extends AnimalSalvaje {
    public PezPayaso(Sexo sexo) {
        super(sexo);
        this.tipo = "pez payaso";
        this.reino = Reino.PEZ.name();
        this.medio = Medio.ACUATICO.name();
        this.sonido = "blup";
        this.desplazamiento = "nadar";
    }
    public PezPayaso(String tipo, String raza, Reino reino, Medio medio, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, sonido, desplazamiento);
    }

    public PezPayaso(Animal animal) {
        super(animal);
    }
}
