package org.campusdual.bootcamp.ingenieros.ejercicio_18.clases;

import java.util.ArrayList;
import java.util.Objects;

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

    protected ArrayList<Animal> familia = new ArrayList<>();

    protected int generacionReproduccion, crias, id;

    public static int generacion = 0, id_global = 0;

    protected static boolean hayReproduccion = true;

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
        this.generacionReproduccion = Animal.generacion;
        this.crias = 0;
        this.AsignarID();
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
        System.out.printf("Reino: %s\nMedio: %s\nTipo: %s\nRaza: %s\nSexo: %s\nSonido: %s\nDesplazamiento: %s\nClone: %b\nID: %d\n\n", this.reino, this.medio, this.tipo, this.raza, this.sexo, this.sonido, this.desplazamiento, this.clone, this.id);
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

    protected static void EliminarDeLista(Animal animal, TipoLista tipoLista)
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

    public static void GenerarListaAleatoria(int nAnimales)
    {
        for (int i = 0; i < nAnimales; i++){
            Animal.AñadirALista(Animal.GenerarAnimalAleatorio(), TipoLista.ANIMALES);
        }
    }

    protected static Animal GenerarAnimalAleatorio()
    {
        int randomNumber = (int)(Math.random() * 6);
        return Animal.GenerarAnimal(randomNumber, Animal.SexoAleatorio());
    }

    protected static Sexo SexoAleatorio()
    {
        Sexo sexo;
        if ((int)(Math.random() * 2) == 0)
            sexo = Sexo.MASCULINO;
        else
            sexo = Sexo.FEMENINO;
        return sexo;
    }

    protected static Animal GenerarAnimal(int i, Sexo sexo)
    {
        Animal animal;
        switch (i){
            case 0:
                animal = new Gato(sexo);
                break;
            case 1:
                animal = new Oveja(sexo);
                break;
            case 2:
                animal = new Perro(sexo);
                break;
            case 3:
                animal = new PezPayaso(sexo);
                break;
            case 5:
                animal = new Tucan(sexo);
                break;
            default:
                animal = new Vaca(sexo);
        }
        return animal;
    }

    public static void Reproduccion(){
        Animal.generacion++;
        Animal hijo;
        ArrayList<Animal> auxList = new ArrayList<>();
        for(Animal a : Animal.listaAnimales) {
            for (Animal b : Animal.listaAnimales) {
                if (a != b && Objects.equals(a.tipo, b.tipo) && !Objects.equals(a.sexo, b.sexo) && !a.familia.contains(b) && a.generacionReproduccion < Animal.generacion && b.generacionReproduccion < Animal.generacion) {
                    //camada.clear();
                    //for (int i = 0; i <= (int)(Math.random() * 2); i++) {
                    switch (a.tipo) {
                        case "gato":
                            hijo = new Gato(Animal.SexoAleatorio());
                            break;
                        case "oveja":
                            hijo = new Oveja(Animal.SexoAleatorio());
                            break;
                        case "perro":
                            hijo = new Perro(Animal.SexoAleatorio());
                            break;
                        case "pez payaso":
                            hijo = new PezPayaso(Animal.SexoAleatorio());
                            break;
                        case "tucan":
                            hijo = new Tucan(Animal.SexoAleatorio());
                            break;
                        default:
                            hijo = new Vaca(Animal.SexoAleatorio());
                    }
                    //camada.add(hijo);
                    a.familia.add(hijo);
                    b.familia.add(hijo);
                    hijo.familia.add(a);
                    hijo.familia.add(b);
                    for (Animal ani : a.familia) {
                        if (ani != hijo) {
                            hijo.familia.add(ani);
                            ani.familia.add(hijo);
                        }
                    }
                    for (Animal ani : b.familia) {
                        if (ani != hijo) {
                            hijo.familia.add(ani);
                            ani.familia.add(hijo);
                        }
                    }
                    //hijo.MostrarAnimal();
                    auxList.add(hijo);
                    //}
                        /*for (Animal h : camada){
                            for (Animal hermano : camada){
                                if (hermano != h){
                                    h.familia.add(hermano);
                                }
                            }
                        }*/
                    a.crias++;
                    b.crias++;
                    a.generacionReproduccion = Animal.generacion;
                    b.generacionReproduccion = Animal.generacion;
                }
            }
        }
        for(Animal animal : auxList){
            Animal.AñadirALista(animal, TipoLista.ANIMALES);
        }
    }

    public static void Crianza()
    {
        //while(Animal.hayReproduccion) {
        for(int i = 0; i < 4; i++){
            int poblacion_actual = Animal.listaAnimales.size();
            Animal.Reproduccion();
            System.out.printf("\nPoblación actual %d\nPoblación futura %d\nGeneración %d\n", poblacion_actual, Animal.listaAnimales.size(), Animal.generacion);
            if(Animal.listaAnimales.size() == poblacion_actual){
                Animal.hayReproduccion = false;
            }
        }

    }

    protected void AsignarID()
    {
        this.id = Animal.id_global;
        Animal.id_global++;
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
