package org.campusdual.bootcamp.ingenieros.ejercicio_14.clases;

public class Vaca extends AnimalDeGranja {
    public Vaca()
    {
        super();
        this.tipo = "vaca";
        this.reino = Reino.MAMIFERO.name();
        this.medio = Medio.TERRESTRE.name();
        this.sonido = "muuu";
        this.desplazamiento = "caminar";
    }
    public Vaca(String tipo, String raza, Reino reino, Medio medio, String propietario, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, propietario, sonido, desplazamiento);
    }

    public Vaca(AnimalDeGranja animalDeGranja) {
        super(animalDeGranja);
    }
}
