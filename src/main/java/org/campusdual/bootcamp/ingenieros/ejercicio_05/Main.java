package org.campusdual.bootcamp.ingenieros.ejercicio_05;

import org.campusdual.bootcamp.ingenieros.util.Input;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduzca un número decimal: ");
        try {
            double n = Input.real();
            String[] parts = String.valueOf(n).split("\\.");
            System.out.printf("Parte entera: %s\nParte decimal: %s\n", parts[0], parts[1]);
        } catch (Exception e){
            System.out.println("El valor introducido no es un número decimal");
        }
    }
}