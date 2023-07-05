package org.campusdual.bootcamp.ingenieros.ejercicio_14.clases;

public interface IAnimal {
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
    public String getPropietario();
    public void setPropietario(String propietario);
}
