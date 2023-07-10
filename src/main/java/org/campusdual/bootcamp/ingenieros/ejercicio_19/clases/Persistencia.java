package org.campusdual.bootcamp.ingenieros.ejercicio_19.clases;

import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.*;
import org.campusdual.bootcamp.ingenieros.ejercicio_13.clases.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;
import org.json.*;

public class Persistencia {
    public static void GenerarCSV()
    {
        String archivoCSV = "datos.csv";

        try (FileWriter writer = new FileWriter(archivoCSV)) {
            writer.write("ID, Nombre, Propietario, Tipo, Raza, Sexo, Reino, Medio, Sonido, Desplazamiento, Lista, Gen. Reprod., Crías, Padre, Madre, Hijos, Hermanos\n");
            for (Animal animal : Animal.getListaAnimales()) {
                StringBuilder filaCSV = new StringBuilder();
                filaCSV.append(animal.getId()).append(",");
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
                filaCSV.append(animal.getGeneration()).append(",");
                filaCSV.append(animal.getCrias()).append(",");
                filaCSV.append(animal.getPadre() != null ? animal.getPadre().getId() : null).append(",");
                filaCSV.append(animal.getMadre() != null ? animal.getMadre().getId() : null).append(",");
                filaCSV.append(!animal.getHijos().isEmpty() ? animal.getHijos() : null).append(",");
                filaCSV.append(!animal.getHermanos().isEmpty() ? animal.getHermanos() : null).append("\n");
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
            pw.println("ID, Nombre, Propietario, Tipo, Raza, Sexo, Reino, Medio, Sonido, Desplazamiento, Lista, Generación, Crías, Padre, Madre");
            for (Animal animal : Animal.getListaAnimales()) {
                pw.printf("%d,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%d,%d,%d,%d\n", animal.getId(), animal.getNombreMascota(), animal.getPropietario(), animal.getTipo(), animal.getRaza(), animal.getSexo(), animal.getReino(), animal.getMedio(), animal.getSonido(), animal.getDesplazamiento(), animal.getTipoLista(), animal.getGeneration(), animal.getCrias(), animal.getPadre() != null ? animal.getPadre().getId() : null, animal.getMadre() != null ? animal.getMadre().getId() : null);
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
                //ID, Nombre, Propietario, Tipo, Raza, Sexo, Reino, Medio, Sonido, Desplazamiento, Lista, Generación, Crías
                datos.add(linea.split(","));
                if (Objects.equals(datos.get(cont)[10], "MASCOTAS")) {
                    Animal.AñadirALista(new Mascota(Integer.valueOf(datos.get(cont)[0]),
                            datos.get(cont)[1],
                            datos.get(cont)[2],
                            CheckTipo(datos.get(cont)[3]),
                            datos.get(cont)[4],
                            datos.get(cont)[5],
                            CheckReino(datos.get(cont)[6]),
                            CheckMedio(datos.get(cont)[7]),
                            datos.get(cont)[8],
                            datos.get(cont)[9],
                            datos.get(cont)[10],
                            Integer.valueOf(datos.get(cont)[11]),
                            Integer.valueOf(datos.get(cont)[12])), TipoLista.ANIMALES);
                } else if (Objects.equals(datos.get(cont)[10], "ANIMALESDEGRANJA")) {
                    Animal.AñadirALista(new AnimalDeGranja(Integer.valueOf(datos.get(cont)[0]),
                            datos.get(cont)[1],
                            datos.get(cont)[2],
                            CheckTipo(datos.get(cont)[3]),
                            datos.get(cont)[4],
                            datos.get(cont)[5],
                            CheckReino(datos.get(cont)[6]),
                            CheckMedio(datos.get(cont)[7]),
                            datos.get(cont)[8],
                            datos.get(cont)[9],
                            datos.get(cont)[10],
                            Integer.valueOf(datos.get(cont)[11]),
                            Integer.valueOf(datos.get(cont)[12])), TipoLista.ANIMALES);
                } else if (Objects.equals(datos.get(cont)[10], "ANIMALESSALVAJES")) {
                    Animal.AñadirALista(new AnimalSalvaje(Integer.valueOf(datos.get(cont)[0]),
                            datos.get(cont)[1],
                            datos.get(cont)[2],
                            CheckTipo(datos.get(cont)[3]),
                            datos.get(cont)[4],
                            datos.get(cont)[5],
                            CheckReino(datos.get(cont)[6]),
                            CheckMedio(datos.get(cont)[7]),
                            datos.get(cont)[8],
                            datos.get(cont)[9],
                            datos.get(cont)[10],
                            Integer.valueOf(datos.get(cont)[11]),
                            Integer.valueOf(datos.get(cont)[12])), TipoLista.ANIMALES);
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

    public static void GenerarJSON() {
        try {
            JSONArray jsonArray = new JSONArray();
            for (Animal animal : Animal.getListaAnimales()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("ID", animal.getId());
                jsonObject.put("Nombre", animal.getNombreMascota() != null ? animal.getNombreMascota() : JSONObject.NULL);
                jsonObject.put("Propietario", animal.getPropietario() != null ? animal.getPropietario() : JSONObject.NULL);
                jsonObject.put("Tipo", animal.getTipo());
                jsonObject.put("Raza", animal.getRaza() != null ? animal.getRaza() : JSONObject.NULL);
                jsonObject.put("Sexo", animal.getSexo());
                jsonObject.put("Reino", animal.getReino());
                jsonObject.put("Medio", animal.getMedio());
                jsonObject.put("Sonido", animal.getSonido());
                jsonObject.put("Desplazamiento", animal.getDesplazamiento());
                jsonObject.put("Lista", animal.getTipoLista());
                jsonObject.put("Generacion", animal.getGeneration());
                jsonObject.put("Crias", animal.getCrias());
                jsonArray.put(jsonObject);
            }
            try (FileWriter writer = new FileWriter("datos.json")) {
                writer.write(jsonArray.toString(2));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void LeerJSON()
    {
        try {
            String contenidoJSON = new String(Files.readAllBytes(Paths.get("datos.json")));
            JSONArray jsonArray = new JSONArray(contenidoJSON);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonAnimal = jsonArray.getJSONObject(i);
                Integer ID = jsonAnimal.getInt("ID");
                String nombre = jsonAnimal.isNull("Nombre") ? null : jsonAnimal.getString("Nombre");//jsonAnimal.getString("Nombre");
                String propietario = jsonAnimal.isNull("Propietario") ? null : jsonAnimal.getString("Propietario");
                Tipo tipo = CheckTipo(jsonAnimal.getString("Tipo"));
                String raza = jsonAnimal.isNull("Raza") ? null : jsonAnimal.getString("Raza");
                String sexo = jsonAnimal.getString("Sexo");
                Reino reino = CheckReino(jsonAnimal.getString("Reino"));
                Medio medio = CheckMedio(jsonAnimal.getString("Medio"));
                String sonido = jsonAnimal.getString("Sonido");
                String desplazamiento = jsonAnimal.getString("Desplazamiento");
                String lista = jsonAnimal.getString("Lista");
                Integer generacion = jsonAnimal.getInt("Generacion");
                Integer crias = jsonAnimal.getInt("Crias");

                if (Objects.equals(tipo.name(), "MASCOTAS")){
                    Animal animal = new Mascota(ID,nombre,propietario,tipo,raza,sexo,reino,medio,sonido,desplazamiento,lista,generacion,crias);
                    Animal.AñadirALista(animal, TipoLista.ANIMALES);
                } else if (Objects.equals(tipo.name(), "ANIMALESDEGRANJA")){
                    Animal animal = new AnimalDeGranja(ID,nombre,propietario,tipo,raza,sexo,reino,medio,sonido,desplazamiento,lista,generacion,crias);
                    Animal.AñadirALista(animal, TipoLista.ANIMALES);
                } else if (Objects.equals(tipo.name(), "ANIMALESSALVAJES")){
                    Animal animal = new AnimalSalvaje(ID,nombre,propietario,tipo,raza,sexo,reino,medio,sonido,desplazamiento,lista,generacion,crias);
                    Animal.AñadirALista(animal, TipoLista.ANIMALES);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Reino CheckReino(String reino)
    {
        switch (reino) {
            case "MAMIFERO":
                return Reino.MAMIFERO;
            case "AVE":
                return Reino.AVE;
            case "PEZ":
                return Reino.PEZ;
            case "REPTIL":
                return Reino.REPTIL;
            default:
                return Reino.ANFIBIO;
        }
    }

    private static Tipo CheckTipo(String tipo)
    {
        switch (tipo) {
            case "GATO":
                return Tipo.GATO;
            case "OVEJA":
                return Tipo.OVEJA;
            case "PERRO":
                return Tipo.PERRO;
            case "PEZPAYASO":
                return Tipo.PEZPAYASO;
            case "TUCAN":
                return Tipo.TUCAN;
            default:
                return Tipo.VACA;
        }
    }

    private static Medio CheckMedio(String medio)
    {
        switch (medio) {
            case "ACUATICO":
                return Medio.ACUATICO;
            case "AEREO":
                return Medio.AEREO;
            default:
                return Medio.TERRESTRE;
        }
    }
}
