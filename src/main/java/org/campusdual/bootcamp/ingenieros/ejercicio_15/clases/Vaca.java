package org.campusdual.bootcamp.ingenieros.ejercicio_15.clases;

public class Vaca extends AnimalDeGranja {
    public Vaca(Sexo sexo) {
        super(sexo);
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
