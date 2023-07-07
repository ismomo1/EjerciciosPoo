package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

import org.campusdual.bootcamp.ingenieros.ejercicio_22.clases.Granjero;

import java.util.Objects;
import java.util.Random;

public class Mascota extends Animal {
    //protected String propietario, nombreMascota;


    public Mascota(int id, String nombreMascota, String propietario, Tipo tipo, String raza, String sexo, Reino reino, Medio medio, String sonido, String desplazamiento, String tipoLista, int generacionReproduccion, int crias) {
        super(id, nombreMascota, propietario, tipo, raza, sexo, reino, medio, sonido, desplazamiento, tipoLista, generacionReproduccion, crias);
    }

    public Mascota(Tipo tipo)
    {
        super(tipo);
    }
    public Mascota(Tipo tipo, String raza, Reino reino, Medio medio, String propietario, String nombreMascota, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, sonido, desplazamiento);
        this.propietario = propietario;
        this.nombreMascota = nombreMascota;
    }

    public Mascota(Mascota mascota) {
        super(mascota);
        this.propietario = mascota.propietario;
        this.nombreMascota = mascota.nombreMascota;
    }

    public Mascota(Sexo sexo) {
        super(sexo);
        this.tipoLista = TipoLista.MASCOTAS.name();
        this.propietario = Granjero.NombreGranjeroAleatorio();
        this.nombreMascota = NombreMascotaAleatorio(sexo.name());
    }

    public Mascota(String raza, String propietario, String nombreMascota) {
        super();
        this.raza = raza;
        this.propietario = propietario;
        this.nombreMascota = nombreMascota;
    }

    public static Mascota Clone(Mascota a){
        Mascota mascota = new Mascota(a);
        return mascota;
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
        System.out.printf("Propietario: %s\nNombre de mascota: %s\n", this.propietario, this.nombreMascota);
        super.MostrarAnimal();
    }

    public static String NombreMascotaAleatorio(String sexo) {
        String nombreAleatorio = "";
        int i = 0;
        Random random = new Random();
        if(Objects.equals(sexo, "MASCULINO")){
            i = random.nextInt(NombresMMascotas.values().length - 1);
            NombresMMascotas[] nombres = NombresMMascotas.values();
            nombreAleatorio = nombres[i].name();
        } else {
            i = random.nextInt(NombresFMascotas.values().length - 1);
            NombresFMascotas[] nombres = NombresFMascotas.values();
            nombreAleatorio = nombres[i].name();
        }
        return nombreAleatorio;
    }

    public String getPropietario()
    {
        return this.propietario;
    }

    public void setPropietario(String propietario)
    {
        this.propietario = propietario;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
}
