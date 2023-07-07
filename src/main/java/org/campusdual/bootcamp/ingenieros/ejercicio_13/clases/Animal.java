package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

import java.util.ArrayList;
import java.util.Objects;


public abstract class Animal implements ISexual {

    protected String raza, sonido, desplazamiento, sexo, tipoLista, nombreMascota = null, propietario = null;
    protected Tipo tipo;
    protected Reino reino;
    protected Medio medio;
    protected ArrayList<Animal> hermanos = new ArrayList<>();
    protected ArrayList<Animal> hijos = new ArrayList<>();
    protected Animal padre = null, madre = null;

    protected int generacionReproduccion = 0, generation = 0, crias = 0, id;

    public static int generacion = 0, id_global = 0;

    protected static boolean hayReproduccion = true;

    protected static ArrayList<Animal> listaAnimales = new ArrayList<>();
    protected static ArrayList<Animal> listaAnimalesDeGranja = new ArrayList<>();
    protected static ArrayList<Animal> listaAnimalesSalvajes = new ArrayList<>();
    protected static ArrayList<Animal> listaMascotas = new ArrayList<>();

    public Animal(int id, String nombreMascota, String propietario, Tipo tipo, String raza, String sexo, Reino reino, Medio medio, String sonido, String desplazamiento, String tipoLista, int generacion, int crias) {
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
        this.generation = generacionReproduccion;
        this.crias = crias;
        this.id = id;
    }

    public Animal(Tipo tipo)
    {
        this.tipo = tipo;
    }

    public Animal(Tipo tipo, String raza, Reino reino, Medio medio, String sonido, String desplazamiento) {
        this.tipo = tipo;
        this.raza = raza;
        this.reino = reino;
        this.medio = medio;
        this.sonido = sonido;
        this.desplazamiento = desplazamiento;
    }

    public Animal(Sexo sexo) {
        this.sexo = sexo.name();
        this.tipoLista = TipoLista.ANIMALES.name();
        this.generacionReproduccion = Animal.generacion;
        //this.crias = 0;
        //this.generation = 0;
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
    }

    public Animal() {
        this.raza = raza;
        this.propietario = propietario;
        this.nombreMascota = nombreMascota;
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
        System.out.printf("Reino: %s\nMedio: %s\nTipo: %s\nRaza: %s\nSexo: %s\nSonido: %s\nDesplazamiento: %s\nID: %d\nNombre: %s\n\n", this.reino, this.medio, this.tipo, this.raza, this.sexo, this.sonido, this.desplazamiento, this.id, this.nombreMascota);
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
                        case GATO:
                            hijo = new Gato(Animal.SexoAleatorio());
                            break;
                        case OVEJA:
                            hijo = new Oveja(Animal.SexoAleatorio());
                            break;
                        case PERRO:
                            hijo = new Perro(Animal.SexoAleatorio());
                            break;
                        case PEZPAYASO:
                            hijo = new PezPayaso(Animal.SexoAleatorio());
                            break;
                        case TUCAN:
                            hijo = new Tucan(Animal.SexoAleatorio());
                            break;
                        case VACA:
                            hijo = new Vaca(Animal.SexoAleatorio());
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

                    hijo.propietario = hijo.madre.propietario;

                    for (Animal animal : a.hijos) {
                        animal.hermanos.add(hijo);
                        hijo.hermanos.add(animal);
                    }
                    for (Animal animal : b.hijos) {
                        if (!animal.hermanos.contains(hijo)) {
                            animal.hermanos.add(hijo);
                        }
                        if (!hijo.hermanos.contains(animal)) {
                            hijo.hermanos.add(animal);
                        }
                    }
                    a.hijos.add(hijo);
                    b.hijos.add(hijo);

                    //hijo.MostrarAnimal();
                    auxList.add(hijo);

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

    public static void Crianza(int generaciones)
    {
        if (generaciones == 0) {
            while (Animal.hayReproduccion) {
                int poblacion_actual = Animal.listaAnimales.size();
                Animal.Reproduccion();
                System.out.printf("\nPoblación actual %d\nPoblación futura %d\nGeneración %d\n", poblacion_actual, Animal.listaAnimales.size(), Animal.generacion);
                if (Animal.listaAnimales.size() == poblacion_actual) {
                    Animal.hayReproduccion = false;
                }
            }
        }
        else {
            for (int i = 0; i < generaciones; i++) {
                int poblacion_actual = Animal.listaAnimales.size();
                Animal.Reproduccion();
                System.out.printf("\nPoblación actual %d\nPoblación futura %d\nGeneración %d\n", poblacion_actual, Animal.listaAnimales.size(), Animal.generacion);
                if (Animal.listaAnimales.size() == poblacion_actual) {
                    Animal.hayReproduccion = false;
                }
            }
        }
    }

    public static void MostrarAntepasados(int id)
    {
        boolean existe = false;
        for (Animal animal : listaAnimales) {
            if (animal.id == id) {
                //Mostrar antepasados
                existe = true;
                if (animal.padre != null)
                {
                    System.out.printf("Padre de %d: %d\tMadre de %d: %d\n", id, animal.padre.id, id, animal.madre.id);
                    Animal.MostrarAntepasados(animal.padre.id);
                    Animal.MostrarAntepasados(animal.madre.id);
                }
                else {
                    System.out.printf("Antepasados de %d desconocidos.\n", id);
                }
            }
        }
        if(!existe){
            System.out.printf("El animal con ID %d no existe.", id);
        }
    }

    protected void AsignarID()
    {
        this.id = Animal.id_global;
        Animal.id_global++;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Reino getReino() {
        return reino;
    }

    public void setReino(Reino reino) {
        this.reino = reino;
    }

    public Medio getMedio() {
        return medio;
    }

    public void setMedio(Medio medio) {
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