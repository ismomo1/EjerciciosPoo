package org.campusdual.bootcamp.ingenieros.ejercicio_09.clases;

public interface IPropietarioAnimal {
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
