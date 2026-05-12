package org.example.ClaseFlujoDeControl;

import java.util.Scanner;

public class SistemaNotasFor {

    static Scanner sc = new Scanner(System.in);

    public static class ReporteNotas {
        double sumaMayores5 = 0, sumaInferiores4 = 0, sumaTotal = 0;
        int cantMayores5 = 0, cantInferiores4 = 0, cantNotas1 = 0, totalProcesadas = 0;
    }

    public static void main(String[] args) {
        ReporteNotas reporte = procesarEntrada(20);

        if (reporte != null) {
            System.out.println("Promedio Total: " + (reporte.sumaTotal / reporte.totalProcesadas));
            System.out.println("Promedio Notas > 5: " + (reporte.cantMayores5 > 0 ? reporte.sumaMayores5 / reporte.cantMayores5 : 0));
            System.out.println("Promedio Notas < 4: " + (reporte.cantInferiores4 > 0 ? reporte.sumaInferiores4 / reporte.cantInferiores4 : 0));
            System.out.println("Cantidad de notas 1: " + reporte.cantNotas1);
        }
    }

    public static ReporteNotas procesarEntrada(int limite) {
        ReporteNotas r = new ReporteNotas();

        for (int i = 0; i < limite; i++) {
            double nota = returnDouble("Nota " + (i + 1) + " (1-7):");

            if (nota == 0) {
                System.out.println("Error: Nota 0 detectada. Finalizando programa.");
                return null;
            }

            r.sumaTotal += nota;
            r.totalProcesadas++;

            if (nota > 5) {
                r.sumaMayores5 += nota;
                r.cantMayores5++;
            } else if (nota < 4) {
                r.sumaInferiores4 += nota;
                r.cantInferiores4++;
            }

            if (nota == 1.0) r.cantNotas1++;
        }
        return r;
    }

    public static double returnDouble (String mensaje) {
        boolean isDouble = false;
        double valor = 0;
        do {
            System.out.println(mensaje);
            try {
                String numero = sc.nextLine();
                valor = Double.parseDouble(numero);
                if (valor>7 || valor<0) {
                    System.out.println("Error: Valor invalido");
                }else{
                    isDouble = true;
                }
            } catch (Exception e) {
                System.out.println("e = " + e);
            }
        }while(!isDouble);
        return valor;
    }
}
