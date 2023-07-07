package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

import org.campusdual.bootcamp.ingenieros.ejercicio_22.clases.Granjero;

public class AnimalDeGranja extends Animal {
    //protected String propietario;


    public AnimalDeGranja(int id, String nombreMascota, String propietario, Tipo tipo, String raza, String sexo, Reino reino, Medio medio, String sonido, String desplazamiento, String tipoLista, int generacionReproduccion, int crias) {
        super(id, nombreMascota, propietario, tipo, raza, sexo, reino, medio, sonido, desplazamiento, tipoLista, generacionReproduccion, crias);
    }

    public AnimalDeGranja(Sexo sexo) {
        super(sexo);
        this.tipoLista = TipoLista.ANIMALESDEGRANJA.name();
        this.propietario = Granjero.NombreGranjeroAleatorio();
    }
    public AnimalDeGranja(Tipo tipo)
    {
        super(tipo);
    }
    public AnimalDeGranja(Tipo tipo, String raza, Reino reino, Medio medio, String propietario, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, sonido, desplazamiento);
        this.propietario = propietario;
    }

    public AnimalDeGranja(AnimalDeGranja animalDeGranja) {
        super(animalDeGranja);
        this.propietario = animalDeGranja.propietario;
    }

    public AnimalDeGranja(String raza, String propietario) {
        super();
        this.raza = raza;
        this.propietario = propietario;
    }

    public static AnimalDeGranja Clone(AnimalDeGranja a){
        AnimalDeGranja animalDeGranja = new AnimalDeGranja(a);
        return animalDeGranja;
    }

    @Override
    public void ReproducirSonido() {
        System.out.println(this.sonido);
    }

    @Override
    public void Desplazamiento() {
        System.out.println(this.desplazamiento);
    }

    public void MostrarAnimal() {
        System.out.printf("Propietario: %s\n", this.propietario);
        super.MostrarAnimal();
    }

    public String getPropietario()
    {
        return this.propietario;
    }
    public void setPropietario(String propietario)
    {
        this.propietario = propietario;
    }
}
