package org.campusdual.bootcamp.ingenieros.ejercicio_16.clases;

public class AnimalDeGranja extends Animal {
    protected String propietario;

    public AnimalDeGranja(Sexo sexo) {
        super(sexo);
        this.tipoLista = TipoLista.ANIMALESDEGRANJA.name();
    }
    public AnimalDeGranja(String tipo)
    {
        super(tipo);
    }
    public AnimalDeGranja(String tipo, String raza, Reino reino, Medio medio, String propietario, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, sonido, desplazamiento);
        this.propietario = propietario;
    }

    public AnimalDeGranja(AnimalDeGranja animalDeGranja) {
        super(animalDeGranja);
        this.propietario = animalDeGranja.propietario;
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
