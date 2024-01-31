/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioVecinas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dan_n
 */
public class EjVecinas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce tamaño de matriz");
        int tam = teclado.nextInt();
        int[][] matriz = new int[tam][tam];

        matriz = rellenarMatriz(matriz);
        mostrarMatriz(matriz);

        System.out.println("\nintroduce fila");
        int fila = teclado.nextInt();
        System.out.println("introduce columna");
        int columna = teclado.nextInt();
        System.out.println("\nmostrar vecinas de " + fila + "-" + columna);
        mostrarVecinas(matriz, fila, columna);

    }

    public static int[][] rellenarMatriz(int[][] matriz) {
        Random r = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = r.nextInt(10);
            }
        }
        return matriz;
    }

    public static int[][] mostrarMatriz(int[][] matriz) {
        Random r = new Random();
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("-" + matriz[i][j]);
            }
        }
        return matriz;
    }

    public static void mostrarVecinas(int[][] matriz, int fila, int columna) {

        for (int i = (fila - 1); i <= (fila + 1); i++) {
            if (!(i < 0 || (i >= matriz.length))) {
                for (int j = (columna - 1); j <= (columna +1); j++) {
                    if (!(j < 0 || j >= matriz[i].length)) {
                        if(!(i==(fila)&&j==(columna))){
                        System.out.println(matriz[i][j]);
                        }
                    }
                }
            }
        }
    }
    }
