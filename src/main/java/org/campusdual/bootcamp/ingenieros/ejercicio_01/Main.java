package org.campusdual.bootcamp.ingenieros.ejercicio_01;

import org.campusdual.bootcamp.ingenieros.util.Input;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduzca un número entero: ");
        try {
            int n = Input.integer();
            if (n % 2 == 0)
                System.out.printf("%d es par.\n", n);
            else
                System.out.printf("%d es impar.\n", n);
        } catch (Exception e){
            System.out.println("El número introducido no es un número entero");
        }
    }
}