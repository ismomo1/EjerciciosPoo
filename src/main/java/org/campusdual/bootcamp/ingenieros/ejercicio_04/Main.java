package org.campusdual.bootcamp.ingenieros.ejercicio_04;

import org.campusdual.bootcamp.ingenieros.util.Input;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduzca un número entero: ");
        try {
            int n = Input.integer();
            int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97}; //primos hasta 100
            System.out.printf("Factorial de %d:\n", n);
            for(int i = 0; i < primos.length; i++){
                int aux = n;
                while(aux % primos[i] == 0){
                    System.out.println(primos[i]);
                    aux /= primos[i];
                }
            }
        } catch (Exception e){
            System.out.println("El número introducido no es un número entero");
        }
    }

    /*private int[] ComprobarPrimos(int n)
    {
        int[] primos;
        for(int i = 2; i < n; i++){
            for(int j = i - 1; i > 0; i--){
                if(j % i == 0){

                }
            }
        }
        return primos;
    }*/
}