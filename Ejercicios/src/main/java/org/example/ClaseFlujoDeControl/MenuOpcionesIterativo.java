package org.example.ClaseFlujoDeControl;

import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class MenuOpcionesIterativo {
    public static void main(String[] args) {
        Map<String, Integer> opciones = new LinkedHashMap<>();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();

        boolean bandera = true;

        do{
            Object opcion = JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción",
                    "Control de productos",
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opArreglo,
                    opArreglo[0]
            );

            if (opcion == null) {
                JOptionPane.showMessageDialog(
                        null,
                        "Debe seleccionar una operación"
                );
            } else {
                int opcionIndice = opciones.get(opcion.toString());
                System.out.println("opcionIndice = " + opcionIndice);

                switch (opcionIndice) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Usuario listado correctamente");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Cerrando ventana");
                        bandera = false;
                        break;
                }
            }
        } while(bandera);
    }
}
