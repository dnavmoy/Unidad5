/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dan_n
 */
public class EjMatriz {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        matriz[0][0] = 0;
        matriz[0][1] = 1;
        matriz[0][2] = 2;
        matriz[0][3] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[1][3] = 7;
        matriz[2][0] = 8;
        matriz[2][1] = 9;
        matriz[2][2] = 0;
        matriz[2][3] = 1;
        matriz[3][0] = 2;
        matriz[3][1] = 3;
        matriz[3][2] = 4;
        matriz[3][3] = 5;

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

        }

        Scanner teclado = new Scanner(System.in);
        //pedir fila a sumar
        int fila = pedirInt("\nintroduce fila:");
        int contador = 0;
        //recorre la fila y suma la posicion [fila] recorriendo la columna[j] y
        //sumando
        for (int j = 0; j < matriz[fila].length; j++) {
            contador += matriz[fila][j];

        }
        System.out.println("la suma de la fila es: " + contador);

        int columna = pedirInt("\n que columna?");
        contador = 0;
        //recorre la columna [columna] sumando los valores de la matriz [i]
        for (int i = 0; i < matriz.length; i++) {

            contador += matriz[i][columna];

        }
        System.out.println("la suma de la columna es: " + contador);
    }

    public static int pedirInt(String texto) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean error = true;
        do {
            try {
                System.out.println(texto);
                numero = teclado.nextInt();
                teclado.nextLine();
                if (numero < 0) {
                    System.out.println("introduce numero positivo");
                } else {
                    error = false;
                }

            } catch (InputMismatchException IME) {
                System.out.println("introduce valor entero positivo");
                teclado.nextLine();
            }

        } while (error);
        return numero;
    }

}
