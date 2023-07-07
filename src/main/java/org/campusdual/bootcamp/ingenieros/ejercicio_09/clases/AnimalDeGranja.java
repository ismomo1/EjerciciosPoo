package org.campusdual.bootcamp.ingenieros.ejercicio_09.clases;

public class AnimalDeGranja extends Animal {
    private String tipo, raza, reino, medio;

    private boolean clone;
    String propietario;

    public AnimalDeGranja(String tipo, String raza, Reino reino, Medio medio, String propietario) {
        super(tipo, raza, reino, medio);
        this.propietario = propietario;
    }

    public AnimalDeGranja(AnimalDeGranja animalDeGranja) {
        super(animalDeGranja);
        this.propietario = animalDeGranja.propietario;
    }

    public AnimalDeGranja Clone(AnimalDeGranja a){
        AnimalDeGranja animalDeGranja = new AnimalDeGranja(a);
        return animalDeGranja;
    }

    public void MostrarAnimal() {
        super.MostrarAnimal();
        System.out.printf("Propietario: %s\n", this.propietario);
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
