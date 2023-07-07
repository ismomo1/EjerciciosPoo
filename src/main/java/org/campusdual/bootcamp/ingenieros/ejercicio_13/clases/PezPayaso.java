package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public class PezPayaso extends AnimalSalvaje {
    public PezPayaso(Sexo sexo) {
        super(sexo);
        this.tipo = Tipo.PEZPAYASO;
        this.reino = Reino.PEZ;
        this.medio = Medio.ACUATICO;
        this.sonido = "blup";
        this.desplazamiento = "nadar";
    }

    public PezPayaso(String raza) {
        super(raza);
        this.tipo = Tipo.PEZPAYASO;
        this.reino = Reino.PEZ;
        this.medio = Medio.ACUATICO;
        this.sonido = "blup";
        this.desplazamiento = "nadar";
    }

    public PezPayaso(PezPayaso pezPayaso) {
        super(pezPayaso);
    }
}
