package org.example.ClaseOperadores;

import javax.swing.*;

public class SistemaEstanqueGasolina {
    public static void main(String[] args) {

        boolean valorInvalido = true;
        while (valorInvalido){
            String medidaActual = JOptionPane.showInputDialog("Ingrese la medida actual en litros");
            try{
                int medidaActualInt = Integer.parseInt(medidaActual);
                JOptionPane.showMessageDialog(null, validarMedida(medidaActualInt));
                valorInvalido = false;
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
                valorInvalido = false;
            }
        }
    }

    public static String validarMedida (int medidaActual){
        String respuesta = "";
        if (medidaActual>70 || medidaActual < 0){
            respuesta = "Ingrese un valor valido";
        } else if (medidaActual == 70) {
            respuesta = "Tanque lleno";
        } else if (medidaActual >= 60) {
            respuesta = "Tanque casi lleno";
        } else if (medidaActual >= 40){
            respuesta = "Tanque 3/4";
        } else if (medidaActual >= 35 ) {
            respuesta = "Medio tanque";
        } else if (medidaActual >= 20 ) {
            respuesta = "Suficiente";
        } else if (medidaActual >= 1 ) {
            respuesta = "insuficiente";
        }
        return respuesta;
    }
}
