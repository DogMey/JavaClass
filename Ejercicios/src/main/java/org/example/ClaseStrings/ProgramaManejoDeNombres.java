package org.example.ClaseStrings;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nombres [] =  new String[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa el nombre número " + (i+1));
            boolean validarNombres = true;
            while (validarNombres) {
                try{
                    nombres[i] = sc.nextLine();
                    nombres[i] = transformarNombre(nombres[i]);
                    validarNombres = false;
                }catch (Exception e){
                    System.out.println("Error al ingresar el nombre");
                }
            }
        }
        String nombresFinal = String.join("_", nombres);
        System.out.println("nombresFinal = " + nombresFinal);
    }

    public static String transformarNombre (String nombre){
        return String.valueOf(nombre.charAt(0)).toUpperCase() + "." + nombre.substring(nombre.length()-2);
    }
}
