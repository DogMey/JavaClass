package org.example.ClaseFlujoDeControl;

import java.util.Scanner;

public class NumeroMenor10 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int cantidad = returnInt("Ingrese la cantidad de números a evaluar");
        int menor = Integer.MAX_VALUE;
        int entrada;
        for (int i = 1; i <= cantidad; i++) {
            entrada = returnInt("Ingresa el valor " + (i+1));
            menor = Math.min(menor, entrada);
        }

        if (menor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }

    }

    public static int returnInt (String mensaje) {

        boolean isInteger = false;
        int valor = 0;

        do {
            System.out.println(mensaje);
            try {
                String numero = sc.nextLine();
                valor = Integer.parseInt(numero);
                isInteger = true;
            } catch (Exception e) {
                System.out.println("e = " + e);
            }
        }while(!isInteger);

        return valor;
    }
}
