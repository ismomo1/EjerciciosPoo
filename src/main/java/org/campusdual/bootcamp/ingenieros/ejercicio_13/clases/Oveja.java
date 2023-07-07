package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public class Oveja extends AnimalDeGranja {

    public Oveja(Sexo sexo) {
        super(sexo);
        this.tipo = Tipo.OVEJA;
        this.reino = Reino.MAMIFERO;
        this.medio = Medio.TERRESTRE;
        this.sonido = "beee";
        this.desplazamiento = "caminar";
    }

    public Oveja(String raza, String propietario) {
        super(raza, propietario);
        this.tipo = Tipo.OVEJA;
        this.reino = Reino.MAMIFERO;
        this.medio = Medio.TERRESTRE;
        this.sonido = "beee";
        this.desplazamiento = "caminar";
    }

    public Oveja(Oveja oveja) {
        super(oveja);
    }
}
