package org.example.ClaseOperadores;

import java.util.Scanner;

public class MayorNumeroTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        String mayor = (numero1 >= numero2) ? "El número mayor es " + numero1 : "El numero mayor es " + numero2;
        System.out.println("mayor = " + mayor);
    }
}
