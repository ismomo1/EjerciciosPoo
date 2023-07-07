package org.campusdual.bootcamp.ingenieros.ejercicio_13.clases;

public interface ISexual {
    enum Sexo{
        MASCULINO,
        FEMENINO
    }

    public void setSexo(Sexo sexo);
    public String getSexo();
}
