/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class Ej3MatrizAutobus {

//    suponer autobus y hacer reserva de asientos- dos filas y dos asientos por lado.
//12 filas y cuatro asientos
//asiento-> numero de asiento , estado(libre o reservado)
//programa que permite reservar o liberar asientos
//inicio todo libre
//si tiene  movilidad reducida-> no se puede reservar los adyacentes
    public static void main(String[] args) {

        boolean[][] autobus = new boolean[12][4];
        boolean continuar = true;
        String[] filaMenu = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        String[] filaAsiento = {"a", "b", "c", "d"};
        do {
            String[] menu = {"salir", "Reserva", "Reserva Movilidad Reducida", "Ver autobus"};
            int respuesta = respuestaBoton(menu);
            switch (respuesta) {
                case 1:

                    int fila = (respuestaListaFila(filaMenu) - 1);
                    int asiento = respuestaListaAsiento(filaAsiento);
                    if (fila == 15 || asiento == 10) {
                        JOptionPane.showMessageDialog(null, "asiento no valido");
                    } else {
                        if (comprobar(autobus, fila, asiento)) {
                            JOptionPane.showMessageDialog(null, "asiento ya reservado, seleccione otro");
                        } else {
                            JOptionPane.showMessageDialog(null, "Reserva realizada");
                        }
                        reservaAsiento(autobus, fila, asiento);
                    }
                    break;
                case 2:
                    fila = fila = (respuestaListaFila(filaMenu) - 1);
                    asiento = asiento = respuestaListaAsiento(filaAsiento);
                    if (!comprobarMovilidad(autobus, fila, asiento)) {
                        reservaMovilidad(autobus, fila, asiento);
                        JOptionPane.showMessageDialog(null, "asiento reservado");
                    } else {
                        JOptionPane.showMessageDialog(null, "no hay espacio suficiente");
                    }
                    break;
                case 3:
                    mostrarAutobus(autobus);
                    break;
                case 0:
                    continuar = false;
            }
        } while (continuar);

    }

    public static void mostrarAutobus(boolean[][] autobus) {

        String autobusTexto = "FILA-- AB--CD\n";

        for (int i = 0; i < autobus.length; i++) {

            autobusTexto = autobusTexto.concat(String.valueOf("fila :   " + (i + 1) + " " + booleanChar(autobus[i][0]))
                    + String.valueOf(booleanChar(autobus[i][1])) + "--"
                    + String.valueOf(booleanChar(autobus[i][2])) + String.valueOf(booleanChar(autobus[i][3])) + "\n");

        }
        JOptionPane.showMessageDialog(null, autobusTexto);

    }

    public static char booleanChar(boolean sino) {
        char letra;
        if (sino == false) {
            letra = 'x';
        } else {
            letra = 'o';
        }
        return letra;
    }

    public static int respuestaBoton(String[] menu) {

        int seleccion = JOptionPane.showOptionDialog(
                null,
                "introduce opcion",
                "Opciones",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                menu,
                "usuario");

        return seleccion;
    }

    public static int respuestaListaFila(String[] fila) {
        int devolver = 0;

        String devTexto = (String) JOptionPane.showInputDialog(null,
                "seleccion", "EligeAsiento", JOptionPane.QUESTION_MESSAGE, null,
                fila, fila[0]);
        if (devTexto == null) {
            devolver = 15;
        } else {
            devolver = Integer.parseInt(devTexto);
        }
        return devolver;
    }

    public static int respuestaListaAsiento(String[] fila) {

        String devTexto = (String) JOptionPane.showInputDialog(null,
                "seleccion", "EligeAsiento", JOptionPane.QUESTION_MESSAGE, null,
                fila, fila[0]);

        int devolver = 0;
        if ("a".equals(devTexto)) {
            devolver = 0;
        } else if ("b".equals(devTexto)) {
            devolver = 1;
        } else if ("c".equals(devTexto)) {
            devolver = 2;
        } else if (("d".equals(devTexto))){
            devolver = 3;
        }else devolver=10;

        return devolver;
    }

    public static boolean reservaAsiento(boolean[][] autobus, int fila, int asiento) {
        boolean reservado = false;
        try {
            if (!autobus[fila][asiento]) {
                autobus[fila][asiento] = true;
            }
        } catch (ArrayIndexOutOfBoundsException AOB) {
        }
        return reservado;
    }

    public static void reservaMovilidad(boolean[][] autobus, int fila, int asiento) {

        for (int i = fila - 1; i <= (fila + 1); i++) {
            for (int j = asiento - 1; j <= (asiento + 1); j++) {
                reservaAsiento(autobus, i, j);
            }

        }

    }

    public static boolean comprobar(boolean[][] autobus, int fila, int asiento) {
        boolean reservado = false;
        try {
            if (autobus[fila][asiento]) {
                reservado = true;
            }
        } catch (ArrayIndexOutOfBoundsException AOB) {

        }
        return reservado;
    }

    public static boolean comprobarMovilidad(boolean[][] autobus, int fila, int asiento) {
        boolean reservado = false;
        for (int i = fila - 1; i <= (fila + 1); i++) {
            for (int j = asiento - 1; j <= (asiento + 1); j++) {
                if (comprobar(autobus, i, j)) {
                    reservado = true;
                }
            }

        }
        return reservado;
    }

    public static int respuestaInt(String texto) {
        int respuesta = 0;
        boolean incorrecto = true;
        String respuestaTexto;
        do {
            respuestaTexto = JOptionPane.showInputDialog(texto);
            try {
                if (respuestaTexto != null) {
                    respuesta = Integer.parseInt(respuestaTexto);
                    incorrecto = false;
                }
            } catch (NumberFormatException nf) {
                JOptionPane.showMessageDialog(null, "introduce valor valido");

            }
        } while (incorrecto);
        return respuesta;
    }
}
