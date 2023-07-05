package org.campusdual.bootcamp.ingenieros.ejercicio_04;

import org.campusdual.bootcamp.ingenieros.util.Input;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduzca un número para calcular su factorial: ");
        try {
            int n = Input.integer();
            int factorial = n;
            for(int i = n-1; i > 0; i--){
                factorial *= i;
            }
            System.out.printf("Factorial de %d: %d\n", n, factorial);
        } catch (Exception e){
            System.out.println("El número introducido no es un número válido");
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