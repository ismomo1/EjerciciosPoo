package org.campusdual.bootcamp.ingenieros.ejercicio_14.clases;

public class Mascota extends Animal {
    protected String propietario, nombreMascota;

    public Mascota(String tipo)
    {
        super(tipo);
    }
    public Mascota(String tipo, String raza, Reino reino, Medio medio, String propietario, String nombreMascota, String sonido, String desplazamiento) {
        super(tipo, raza, reino, medio, sonido, desplazamiento);
        this.propietario = propietario;
        this.nombreMascota = nombreMascota;
    }

    public Mascota(Mascota mascota) {
        super(mascota);
        this.propietario = mascota.propietario;
        this.nombreMascota = mascota.nombreMascota;
    }

    public Mascota() {
        super();
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
