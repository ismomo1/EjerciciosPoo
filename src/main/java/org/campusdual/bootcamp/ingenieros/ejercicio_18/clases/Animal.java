package org.campusdual.bootcamp.ingenieros.ejercicio_18.clases;

import java.io.FileWriter;
import java.io.IOException;
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

    protected String tipo, raza, reino, medio, sonido, desplazamiento, sexo, tipoLista, nombreMascota = null, propietario = null;

    protected boolean clone;

    protected ArrayList<Animal> hermanos = new ArrayList<>();
    protected ArrayList<Animal> hijos = new ArrayList<>();
    protected Animal padre = null, madre = null;

    protected int generacionReproduccion, generation, crias, id;

    public static int generacion = 0, id_global = 0;

    protected static boolean hayReproduccion = true;

    protected static ArrayList<Animal> listaAnimales = new ArrayList<>();
    protected static ArrayList<Animal> listaAnimalesDeGranja = new ArrayList<>();
    protected static ArrayList<Animal> listaAnimalesSalvajes = new ArrayList<>();
    protected static ArrayList<Animal> listaMascotas = new ArrayList<>();
    //ID, Nombre, Propietario, Tipo, Raza, Sexo, Reino, Medio, Sonido, Desplazamiento, Lista, Clon, Gen. Reprod., Crías

    public Animal(int id, String nombreMascota, String propietario, String tipo, String raza, String sexo, String reino, String medio, String sonido, String desplazamiento, String tipoLista, boolean clone, int generacionReproduccion, int crias) {
        this.tipo = tipo;
        this.raza = raza;
        this.reino = reino;
        this.medio = medio;
        this.sonido = sonido;
        this.desplazamiento = desplazamiento;
        this.sexo = sexo;
        this.tipoLista = tipoLista;
        this.nombreMascota = nombreMascota;
        this.propietario = propietario;
        this.clone = clone;
        this.generacionReproduccion = generacionReproduccion;
        this.crias = crias;
        this.id = id;
    }

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
        this.generation = 0;
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

    public Boolean EsFamilia(Animal animal)
    {
        if (padre == animal || madre == animal || hermanos.contains(animal)){
            return true;
        } else {
            return false;
        }
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

    public static void EliminarListas()
    {
        Animal.EliminarLista(TipoLista.ANIMALES);
        Animal.EliminarLista(TipoLista.ANIMALESSALVAJES);
        Animal.EliminarLista(TipoLista.ANIMALESDEGRANJA);
        Animal.EliminarLista(TipoLista.MASCOTAS);
    }
    public static void EliminarLista(TipoLista tipoLista)
    {
        switch (tipoLista.name()){
            case "ANIMALES":
                listaAnimales.clear();
                break;
            case "ANIMALESSALVAJES":
                listaAnimalesSalvajes.clear();
                break;
            case "ANIMALESDEGRANJA":
                listaAnimalesDeGranja.clear();
                break;
            case "MASCOTAS":
                listaMascotas.clear();
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
                if (a != b && Objects.equals(a.tipo, b.tipo) && !Objects.equals(a.sexo, b.sexo) && !a.EsFamilia(b) && a.generacionReproduccion < Animal.generacion && b.generacionReproduccion < Animal.generacion && a.crias < 3 && b.crias < 3) {
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
                    hijo.generation = Animal.generacion;
                    if (Objects.equals(a.sexo, "MASCULINO")) {
                        hijo.padre = a;
                        hijo.madre = b;
                    } else {
                        hijo.padre = b;
                        hijo.madre = a;
                    }
                    //System.out.printf("-----%d-----\nPadre: %d\nMadre: %d\n", hijo.id, hijo.padre.id, hijo.madre.id);
                    for (Animal animal : a.hijos) {
                        animal.hermanos.add(hijo);
                        hijo.hermanos.add(animal);
                        //System.out.printf("Hermano paterno: %d\n", animal.id);
                    }
                    for (Animal animal : b.hijos) {
                        if (!animal.hermanos.contains(hijo)) {
                            animal.hermanos.add(hijo);
                        }
                        if (!hijo.hermanos.contains(animal)) {
                            hijo.hermanos.add(animal);
                            //System.out.printf("Hermano materno: %d\n", animal.id);
                        }
                    }
                    a.hijos.add(hijo);
                    b.hijos.add(hijo);

                    //hijo.MostrarAnimal();
                    auxList.add(hijo);
                    //}
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

    public static void MostrarAntepasados(int id)
    {
        for (Animal animal : listaAnimales) {
            if (animal.id == id) {
                //Mostrar antepasados
                int cont = 0;
                if (animal.padre != null)
                {
                    System.out.printf("Generación %d\tPadre: %d\tMadre: %d\n", cont, animal.padre.id, animal.madre.id);
                }
                break;
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

    public String getTipoLista() {
        return tipoLista;
    }

    public boolean isClone() {
        return clone;
    }

    public int getGeneracionReproduccion() {
        return generacionReproduccion;
    }

    public int getCrias() {
        return crias;
    }

    public int getId() {
        return id;
    }

    public static ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public static ArrayList<Animal> getListaAnimalesDeGranja() {
        return listaAnimalesDeGranja;
    }

    public static ArrayList<Animal> getListaAnimalesSalvajes() {
        return listaAnimalesSalvajes;
    }

    public static ArrayList<Animal> getListaMascotas() {
        return listaMascotas;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public String getPropietario() {
        return propietario;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public ArrayList<Animal> getHermanos() {
        return hermanos;
    }

    public Animal getPadre() {
        return padre;
    }

    public Animal getMadre() {
        return madre;
    }
}