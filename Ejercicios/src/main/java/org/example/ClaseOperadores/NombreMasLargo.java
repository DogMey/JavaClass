package org.example.ClaseOperadores;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NombreMasLargo {
    public static void main(String[] args) {

        String[] nombreCompleto = new String[3];
        String[] nombres = new String[3];
        for (int i = 0; i < 3; i++){
            try{
                nombreCompleto[i] = JOptionPane.showInputDialog("Ingrese el nombre " + (i+1));
                String[] nombreDividido = nombreCompleto[i].split(" ");
                nombres[i] = nombreDividido[0];
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());;
                i--;
            }
        }

        String nombreLargo = Arrays.stream(nombres).max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("nombreLargo = " + nombreLargo);

    }
}
