package org.campusdual.bootcamp.ingenieros.ejercicio_15.clases;

import java.util.ArrayList;

public abstract class Animal implements ISexual {

    public enum Reino {
        MAMIFERO,
        AVE,
        REPTIL,
        ANFIBIO,
        PEZ
    }

    public enum Medio {
        ACUATICO,
        AEREO,
        TERRESTRE
    }

    public enum TipoLista{
        ANIMALES,
        ANIMALESSALVAJES,
        ANIMALESDEGRANJA,
        MASCOTAS
    }

    protected String tipo, raza, reino, medio, sonido, desplazamiento, sexo, tipoLista;

    protected boolean clone;

    protected static ArrayList<Animal> listaAnimales = new ArrayList<>();
    protected static ArrayList<Animal> listaAnimalesDeGranja = new ArrayList<>();
    protected static ArrayList<Animal> listaAnimalesSalvajes = new ArrayList<>();
    protected static ArrayList<Animal> listaMascotas = new ArrayList<>();

    public Animal(String tipo)
    {
        this.tipo = tipo;
    }

    public Animal(String tipo, String raza, Reino reino, Medio medio, String sonido, String desplazamiento) {
        this.tipo = tipo;
        this.raza = raza;
        this.reino = reino.toString();
        this.medio = medio.toString();
        this.sonido = sonido;
        this.desplazamiento = desplazamiento;
        this.clone = false;
    }

    public Animal(Sexo sexo) {
        this.sexo = sexo.name();
        this.tipoLista = TipoLista.ANIMALES.name();
    }
    public Animal(Animal animal)
    {
        this.tipo = animal.tipo;
        this.raza = animal.raza;
        this.reino = animal.reino;
        this.medio = animal.medio;
        this.sonido = animal.sonido;
        this.desplazamiento = animal.desplazamiento;
        this.clone = true;
    }

    /*public Animal Clone(Animal a);{
        Animal animal = new Animal(a);
        return animal;
    }*/
    public abstract void ReproducirSonido();
    public abstract void Desplazamiento();
    @Override
    public void setSexo(Sexo sexo) {
        this.sexo = sexo.toString();
    }

    public String getSexo() {
        return sexo;
    }

    public void MostrarAnimal()
    {
        System.out.printf("Reino: %s\nMedio: %s\nTipo: %s\nRaza: %s\nSexo: %s\nSonido: %s\nDesplazamiento: %s\nClone: %b\n\n", this.reino, this.medio, this.tipo, this.raza, this.sexo, this.sonido, this.desplazamiento, this.clone);
    }

    public static void AñadirALista(Animal animal, TipoLista tipoLista)
    {
        switch (tipoLista.name()){
            case "ANIMALES":
                listaAnimales.add(animal);
                break;
            case "ANIMALESSALVAJES":
                listaAnimalesSalvajes.add(animal);
                break;
            case "ANIMALESDEGRANJA":
                listaAnimalesDeGranja.add(animal);
                break;
            case "MASCOTAS":
                listaMascotas.add(animal);
                break;
        }
    }

    public static void EliminarDeLista(Animal animal, TipoLista tipoLista)
    {
        switch (tipoLista.name()){
            case "ANIMALES":
                listaAnimales.remove(animal);
                break;
            case "ANIMALESSALVAJES":
                listaAnimalesSalvajes.remove(animal);
                break;
            case "ANIMALESDEGRANJA":
                listaAnimalesDeGranja.remove(animal);
                break;
            case "MASCOTAS":
                listaMascotas.remove(animal);
                break;
        }
    }

    public static void MostrarLista(TipoLista tipoLista)
    {
        ArrayList<Animal> aux = new ArrayList<>();
        switch (tipoLista.name()) {
            case "ANIMALES":
                aux = listaAnimales;
                break;
            case "ANIMALESSALVAJES":
                aux = listaAnimalesSalvajes;
                break;
            case "ANIMALESDEGRANJA":
                aux = listaAnimalesDeGranja;
                break;
            case "MASCOTAS":
                aux = listaMascotas;
                break;
        }
        System.out.printf("\n-----------%s-----------\n\n", tipoLista.name());
        for(Animal a : aux)
        {
            a.MostrarAnimal();
        }
    }

    public static void DistribuirListaAnimales()
    {
        for(Animal a : listaAnimales){
            switch (a.tipoLista){
                case "ANIMALESSALVAJES":
                    Animal.AñadirALista(a, TipoLista.ANIMALESSALVAJES);
                    //Animal.EliminarDeLista(a, TipoLista.ANIMALES);
                    break;
                case "ANIMALESDEGRANJA":
                    Animal.AñadirALista(a, TipoLista.ANIMALESDEGRANJA);
                    //Animal.EliminarDeLista(a, TipoLista.ANIMALES);
                    break;
                case "MASCOTAS":
                    Animal.AñadirALista(a, TipoLista.MASCOTAS);
                    //Animal.EliminarDeLista(a, TipoLista.ANIMALES);
                    break;
            }
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(String desplazamiento) {
        this.desplazamiento = desplazamiento;
    }
}
