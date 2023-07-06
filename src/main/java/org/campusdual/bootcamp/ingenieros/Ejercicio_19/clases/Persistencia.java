package org.campusdual.bootcamp.ingenieros.Ejercicio_19.clases;

import org.campusdual.bootcamp.ingenieros.ejercicio_18.clases.Animal;
import org.campusdual.bootcamp.ingenieros.ejercicio_18.clases.AnimalDeGranja;
import org.campusdual.bootcamp.ingenieros.ejercicio_18.clases.AnimalSalvaje;
import org.campusdual.bootcamp.ingenieros.ejercicio_18.clases.Mascota;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class Persistencia {
    public static void GenerarCSV()
    {
        String archivoCSV = "datos.csv";

        try (FileWriter writer = new FileWriter(archivoCSV)) {
            writer.write("ID, Nombre, Propietario, Tipo, Raza, Sexo, Reino, Medio, Sonido, Desplazamiento, Lista, Clon, Gen. Reprod., Crías\n");
            for (Animal animal : Animal.getListaAnimales()) {
                StringBuilder filaCSV = new StringBuilder();
                filaCSV.append(animal.getId()).append(",");
                /*if (Objects.equals(animal.getTipoLista(), "MASCOTAS")) {
                    filaCSV.append((animal.getNombreMascota())).append(",");
                } else {
                    filaCSV.append("null,");
                }
                if (Objects.equals(animal.getTipoLista(), "MASCOTAS") || Objects.equals(animal.getTipoLista(), "ANIMALESDEGRANJA")) {
                    filaCSV.append((animal.getPropietario())).append(",");
                } else {
                    filaCSV.append("null,");
                }*/
                filaCSV.append((animal.getNombreMascota())).append(",");
                filaCSV.append((animal.getPropietario())).append(",");
                filaCSV.append(animal.getTipo()).append(",");
                filaCSV.append(animal.getRaza()).append(",");
                filaCSV.append(animal.getSexo()).append(",");
                filaCSV.append(animal.getReino()).append(",");
                filaCSV.append(animal.getMedio()).append(",");
                filaCSV.append(animal.getSonido()).append(",");
                filaCSV.append(animal.getDesplazamiento()).append(",");
                filaCSV.append(animal.getTipoLista()).append(",");
                filaCSV.append(animal.isClone()).append(",");
                filaCSV.append(animal.getGeneracionReproduccion()).append(",");
                filaCSV.append(animal.getCrias()).append("\n");
                writer.write(filaCSV.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void GenerarCSV2()
    {
        File file = new File("datos2.csv");
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(new FileWriter(file));
            pw.println("ID, Nombre, Propietario, Tipo, Raza, Sexo, Reino, Medio, Sonido, Desplazamiento, Lista, Clon, Gen. Reprod., Crías");
            for (Animal animal : Animal.getListaAnimales()) {
                pw.printf("%d,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%b,%d,%d\n", animal.getId(), animal.getNombreMascota(), animal.getPropietario(), animal.getTipo(), animal.getRaza(), animal.getSexo(), animal.getReino(), animal.getMedio(), animal.getSonido(), animal.getDesplazamiento(), animal.getTipoLista(), animal.isClone(), animal.getGeneracionReproduccion(), animal.getCrias());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(file != null) {
                    pw.close();
                }
            } catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

    public static void LeerCSV()
    {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("datos2.csv")));
            String linea = "";
            ArrayList<String[]> datos = new ArrayList<>();
            int cont = 0;
            Animal.EliminarListas();
            while((linea = br.readLine()) != null){
                //ID, Nombre, Propietario, Tipo, Raza, Sexo, Reino, Medio, Sonido, Desplazamiento, Lista, Clon, Gen. Reprod., Crías
                datos.add(linea.split(","));
                if (Objects.equals(datos.get(cont)[10], "MASCOTAS")) {
                    Animal.AñadirALista(new Mascota(Integer.valueOf(datos.get(cont)[0]),
                            datos.get(cont)[1],
                            datos.get(cont)[2],
                            datos.get(cont)[3],
                            datos.get(cont)[4],
                            datos.get(cont)[5],
                            datos.get(cont)[6],
                            datos.get(cont)[7],
                            datos.get(cont)[8],
                            datos.get(cont)[9],
                            datos.get(cont)[10],
                            Boolean.valueOf(datos.get(cont)[11]),
                            Integer.valueOf(datos.get(cont)[12]),
                            Integer.valueOf(datos.get(cont)[13])), Animal.TipoLista.ANIMALES);
                } else if (Objects.equals(datos.get(cont)[10], "ANIMALESDEGRANJA")) {
                    Animal.AñadirALista(new AnimalDeGranja(Integer.valueOf(datos.get(cont)[0]),
                            datos.get(cont)[1],
                            datos.get(cont)[2],
                            datos.get(cont)[3],
                            datos.get(cont)[4],
                            datos.get(cont)[5],
                            datos.get(cont)[6],
                            datos.get(cont)[7],
                            datos.get(cont)[8],
                            datos.get(cont)[9],
                            datos.get(cont)[10],
                            Boolean.valueOf(datos.get(cont)[11]),
                            Integer.valueOf(datos.get(cont)[12]),
                            Integer.valueOf(datos.get(cont)[13])), Animal.TipoLista.ANIMALES);
                } else if (Objects.equals(datos.get(cont)[10], "ANIMALESSALVAJES")) {
                    Animal.AñadirALista(new AnimalSalvaje(Integer.valueOf(datos.get(cont)[0]),
                            datos.get(cont)[1],
                            datos.get(cont)[2],
                            datos.get(cont)[3],
                            datos.get(cont)[4],
                            datos.get(cont)[5],
                            datos.get(cont)[6],
                            datos.get(cont)[7],
                            datos.get(cont)[8],
                            datos.get(cont)[9],
                            datos.get(cont)[10],
                            Boolean.valueOf(datos.get(cont)[11]),
                            Integer.valueOf(datos.get(cont)[12]),
                            Integer.valueOf(datos.get(cont)[13])), Animal.TipoLista.ANIMALES);
                } /*else {
                    System.out.println(datos.get(cont)[10]);
                    System.out.println("------------------------FALLO AL IMPORTAR EL ARCHIVO CSV------------------------");
                }*/
                for (int i = 0; i < datos.get(cont).length; i++) {
                    System.out.printf(datos.get(cont)[i] + "\t");
                }
                System.out.println();
                cont++;
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if(null != br){
                    br.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
