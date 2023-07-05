package org.campusdual.bootcamp.ingenieros.ejercicio_11.clases;

public class Mascota implements IAnimal{
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

    private String tipo, raza, reino, medio;

    private boolean clone;
    String propietario, nombreMascota;

    public Mascota(String tipo, String raza, Reino reino, Medio medio, String propietario, String nombreMascota) {
        this.tipo = tipo;
        this.raza = raza;
        this.reino = reino.toString();
        this.medio = medio.toString();
        this.clone = false;
        this.propietario = propietario;
        this.nombreMascota = nombreMascota;
    }

    public void MostrarAnimal() {
        System.out.printf("Reino: %s\nMedio: %s\nTipo: %s\nRaza: %s\nClone: %b\n", this.reino, this.medio, this.tipo, this.raza, this.clone);
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
