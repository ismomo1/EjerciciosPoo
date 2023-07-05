package org.campusdual.bootcamp.ingenieros.ejercicio_06;

import org.campusdual.bootcamp.ingenieros.util.Input;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Serie de Fibonacci: ");
        ArrayList<Integer> f = new ArrayList<>();
        int contador = 0;
        f.add(0);
        f.add(1);
        while(contador < 20){
            f.add(f.get(f.size()-1)+f.get(f.size()-2));
            System.out.println(f.get(f.size()-1));
            contador++;
        }
    }
}