package org.example.ClaseFlujoDeControl;

import java.util.Scanner;

public class Multiplicacion2For {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number1 = returnInt("Ingrese el número 1");
        int number2 = returnInt("Ingrese el número 2");

        System.out.println("El resultado es: " + multiply(number1, number2));
    }

    public static int multiply(int a, int b) {
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int product = 0;

        int iterations = Math.min(absA, absB);
        int value = Math.max(absA, absB);

        for (int i = 0; i < iterations; i++) {
            product += value;
        }

        return (a < 0 ^ b < 0) ? -product : product;
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
