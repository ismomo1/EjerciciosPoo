package org.campusdual.bootcamp.ingenieros.ejercicio_03;

import org.campusdual.bootcamp.ingenieros.util.Input;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduzca un número entero: ");
        try {
            int n = Input.integer();
            System.out.printf("Los divisores de %d son los siguientes:\n", n);
            for(int i = 1; i < n; i++){
                if (n % i == 0){
                    System.out.println(i);
                }
            }
        } catch (Exception e){
            System.out.println("El número introducido no es un número entero");
        }
    }
}