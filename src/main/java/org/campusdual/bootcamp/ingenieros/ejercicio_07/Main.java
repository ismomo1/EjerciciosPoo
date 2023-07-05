package org.campusdual.bootcamp.ingenieros.ejercicio_07;

import org.campusdual.bootcamp.ingenieros.util.Input;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Introduzca un número decimal: ");
        try {
            Main.ImprimirValor(5);
            Main.ImprimirValor(5.42f);
            Main.ImprimirValor("Hola mundo");
            /*String s = Input.string();
            String[] parts = String.valueOf(s).split("\\.");
            String tipoDato;
            if(Integer.valueOf(parts[1]) == 0){
                tipoDato = "entero";
                System.out.printf("El %s es %.0f", tipoDato, s);
            }else {
                tipoDato = "flotante";
                System.out.printf("El %s es %f", tipoDato, s);
            }*/
        } catch (Exception e){
            System.out.println("El valor introducido no es un número");
        }
    }

    public static void ImprimirValor(Integer i)
    {
        System.out.printf("El entero es %d.\n", i);
    }

    public static void ImprimirValor(Float f)
    {
        System.out.printf("El flotante es %f.\n", f);
    }

    public static void ImprimirValor(String s)
    {
        System.out.printf("El string es '%s'.\n", s);
    }
}