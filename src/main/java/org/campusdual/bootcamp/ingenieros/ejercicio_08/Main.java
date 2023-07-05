package org.campusdual.bootcamp.ingenieros.ejercicio_08;

import org.campusdual.bootcamp.ingenieros.util.Input;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        ArrayList<Double> listaNum = new ArrayList<>();
        while(running) {
            System.out.println("\nSeleccione la tarea que desea ejecutar:");
            System.out.println("-a: introducir un número en la lista.");
            System.out.println("-s: obtener la suma de los elementos de la lista.");
            System.out.println("-d: eliminar el último número de la lista.");
            System.out.println("-l: mostrar la lista de números.");
            System.out.println("-q: finalizar la ejecución del programa.");
            try {
                String c = Input.string();
                switch (c) {
                    case "a":
                        System.out.println("Introduzca el número que desee añadir a la lista.");
                        Double n = Input.real();
                        listaNum.add(n);
                        break;
                    case "s":
                        Double suma = 0d;
                        for(Double d : listaNum){
                            suma += d;
                        }
                        System.out.printf("La suma de los elementos de la lista es %f\n", suma);
                        break;
                    case "d":
                        System.out.printf("Se ha eliminado el último número de la lista: %f\n", listaNum.get(listaNum.size()-1));
                        listaNum.remove(listaNum.size()-1);
                        break;
                    case "l":
                        System.out.println("Lista actual de números:");
                        for(Double d : listaNum){
                            System.out.println(d);
                        }
                        break;
                    case "q":
                        System.out.println("Deteniendo el programa...");
                        running = false;
                        break;
                    default:
                        System.out.println("Comando no reconocido. Por favor, vuelva a introducir la tarea que desea ejecutar.");
                }

            } catch (Exception e) {
                System.out.println("El valor introducido no es válido");
            }
        }
    }

    public static boolean IsInt(Double d)
    {
        String[] parts = String.valueOf(d).split("\\.");
        if(Integer.valueOf(parts[1]) == 0)
            return true;
        else
            return false;
    }
}