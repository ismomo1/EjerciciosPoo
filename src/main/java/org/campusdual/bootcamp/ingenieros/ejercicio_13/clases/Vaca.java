package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public class Vaca extends AnimalDeGranja {
    public Vaca(Sexo sexo) {
        super(sexo);
        this.tipo = Tipo.VACA;
        this.reino = Reino.MAMIFERO;
        this.medio = Medio.TERRESTRE;
        this.sonido = "muuu";
        this.desplazamiento = "caminar";
    }

    public Vaca(String raza, String propietario) {
        super(raza, propietario);
        this.tipo = Tipo.VACA;
        this.reino = Reino.MAMIFERO;
        this.medio = Medio.TERRESTRE;
        this.sonido = "muuu";
        this.desplazamiento = "caminar";
    }

    public Vaca(Tipo tipo, String raza, Reino reino, Medio medio, String propietario, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, propietario, sonido, desplazamiento);
    }

    public Vaca(Vaca vaca) {
        super(vaca);
    }
}
