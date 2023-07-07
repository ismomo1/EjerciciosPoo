package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public class AnimalSalvaje extends Animal {
    public AnimalSalvaje(int id, String nombreMascota, String propietario, Tipo tipo, String raza, String sexo, Reino reino, Medio medio, String sonido, String desplazamiento, String tipoLista, int generacionReproduccion, int crias) {
        super(id, nombreMascota, propietario, tipo, raza, sexo, reino, medio, sonido, desplazamiento, tipoLista, generacionReproduccion, crias);
    }

    public AnimalSalvaje(Sexo sexo) {
        super(sexo);
        this.tipoLista = TipoLista.ANIMALESSALVAJES.name();
    }
    public AnimalSalvaje(Tipo tipo)
    {
        super(tipo);
    }
    public AnimalSalvaje(Tipo tipo, String raza, Reino reino, Medio medio, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, sonido, desplazamiento);
    }

    public AnimalSalvaje(Animal animal) {
        super(animal);
    }

    public AnimalSalvaje(String raza) {
        this.raza = raza;
    }

    public static AnimalSalvaje Clone(AnimalSalvaje a){
        AnimalSalvaje animal = new AnimalSalvaje(a);
        return animal;
    }

    @Override
    public void ReproducirSonido() {
        System.out.println(this.sonido);
    }

    @Override
    public void Desplazamiento() {
        System.out.println(this.desplazamiento);
    }
}
