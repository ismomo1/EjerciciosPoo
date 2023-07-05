package org.campusdual.bootcamp.ingenieros.ejercicio_15.clases;

public class Oveja extends AnimalDeGranja {

    public Oveja(Sexo sexo) {
        super(sexo);
        this.tipo = "oveja";
        this.reino = Reino.MAMIFERO.name();
        this.medio = Medio.TERRESTRE.name();
        this.sonido = "beee";
        this.desplazamiento = "caminar";
    }
    public Oveja(String tipo, String raza, Reino reino, Medio medio, String propietario, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, propietario, sonido, desplazamiento);
    }

    public Oveja(AnimalDeGranja animalDeGranja) {
        super(animalDeGranja);
    }
}
