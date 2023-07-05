package org.campusdual.bootcamp.ingenieros.ejercicio_02;

import org.campusdual.bootcamp.ingenieros.util.Input;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Introduzca un número entero: ");
        try {
            int n = Input.integer();
            if(n % 2 == 0){
                System.out.printf("%d es múltiplo de 2.\n", n);
            }
            if (n % 3 == 0) {
                System.out.printf("%d es múltiplo de 3.\n", n);
            }
            if (n % 5 == 0) {
                System.out.printf("%d es múltiplo de 5.\n", n);
            }
            if (n % 7 == 0) {
                System.out.printf("%d es múltiplo de 7.\n", n);
            }
            if (n % 2 != 0 && n % 3 != 0 && n % 5 != 0 && n % 7 != 0){
                System.out.printf("%d no es múltiplo de ninguno de los números primos contenidos entre 1 y 10.\n", n);
            }
        } catch (Exception e){
            System.out.println("El número introducido no es un número entero");
        }
    }
}