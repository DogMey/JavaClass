package org.example.ClaseVariable;

import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el nombre de la factura?");
        String nombreFactura = sc.nextLine();

        System.out.println("Cual es el primer precio?");
        double precio1 = sc.nextDouble();

        System.out.println("Cual es el segundo precio?");
        double precio2 = sc.nextDouble();

        double total = precio1 + precio2;
        double impuesto = total * 0.19;

        System.out.println("La factura " + nombreFactura + " tiene un total bruto de " + total + " con un impuesto de " + impuesto + "y el monto despúes de impuesto es " + (total+impuesto));
    }
}
