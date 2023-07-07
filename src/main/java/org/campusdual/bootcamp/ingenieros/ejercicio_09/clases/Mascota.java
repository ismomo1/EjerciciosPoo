package org.campusdual.bootcamp.ingenieros.ejercicio_09.clases;

public class Mascota extends Animal {
    private String tipo, raza, reino, medio;

    private boolean clone;
    String propietario, nombreMascota;

    public Mascota(String tipo, String raza, Reino reino, Medio medio, String propietario, String nombreMascota) {
        super(tipo, raza, reino, medio);
        this.propietario = propietario;
        this.nombreMascota = nombreMascota;
    }

    public Mascota(Mascota mascota) {
        super(mascota);
        this.propietario = mascota.propietario;
        this.nombreMascota = mascota.nombreMascota;
    }

    public static Mascota Clone(Mascota a){
        Mascota mascota = new Mascota(a);
        return mascota;
    }

    public void MostrarAnimal() {
        super.MostrarAnimal();
        System.out.printf("Propietario: %s\nNombre de mascota: %s\n", this.propietario, this.nombreMascota);
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
