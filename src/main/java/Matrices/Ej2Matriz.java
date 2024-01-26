/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author Dan_n
 */
public class Ej2Matriz {

    //En una clase con el main, usando métodos de clase
    //a) Método que recibe un número "n"entre 1 y 10 y devuelve una matriz de 
    //nXn elementos aleatorios de tipo char.
    //b) Método que recibe la matriz y un char y devuelve una lista de objetos
    //Celda indicando las casillas donde se encuentra ese char dentro de la matriz.
    public static void main(String[] args) {

        int tamMatriz = respuestaInt("introduce tamaño matriz");
        char[][] matriz = new char[tamMatriz][tamMatriz];
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        metodo(matriz,'a');
        

    }
    
    public static void metodo(char[][] matriz,char letra){
        ArrayList<Celda> lista = new ArrayList<>();
         for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i][j]==letra){
                    lista.add(new Celda(i, j));
                }
            }
        }
        System.out.println("\n mostrar las celdas con a: ");
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
    }

    public static int respuestaInt(String texto) {
        int respuesta = 0;
        boolean incorrecto = true;
        do {
            try {
                respuesta = Integer.parseInt(JOptionPane.showInputDialog(texto));

                if (respuesta < 1 || respuesta > 10) {
                    System.out.println("introduce valor entre 1 y 10");
                    incorrecto = true;
                } else {
                    incorrecto = false;
                }

            } catch (NumberFormatException nf) {
                JOptionPane.showMessageDialog(null, "introduce valor valido");

            }
        } while (incorrecto);
        return respuesta;
    }
    
    
    public static char[][] rellenarMatriz(char[][] matriz){
         
        Random r = new Random();
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=(char) r.nextInt(97,123);
            }
        }
        
        return matriz;
    }

    public static void mostrarMatriz(char[][] matriz){
         for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

        }
    }
}
