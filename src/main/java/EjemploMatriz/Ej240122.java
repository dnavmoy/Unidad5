/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploMatriz;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ej240122 {
    /*
    Realiza un programa que pida al usuario el número de filas y columnas de un 
    array bidimensional de números enteros. El programa crea la matriz con esos 
    tamaños y debe rellenarla solicitando al usuario los valores a introducir. 
    Una vez esté rellena, se debe mostrar la matriz completa y la suma de sus 
    elementos.

    
    */
    
    public static void main(String[] args) {
    
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("introduce filas: ");
        int filas=entrada.nextInt();
        
        System.out.println("introduce columnas");
        int columnas=entrada.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        for(int i =0; i<matriz.length;i++){
            for (int n=0; n<matriz[i].length;n++){
                System.out.println("introduce valor de fila " +i+ " columna " + n);
                matriz[i][n]=entrada.nextInt();
            }
        }
        for(int i =0; i<matriz.length;i++){
            for (int n=0; n<matriz[i].length;n++){
                System.out.println("f"+i + "c"+n+": "+matriz[i][n]);
                
            }
        }
        
        System.out.println("suma total: " +sumaTotal(matriz));
    }
    
    public static int sumaTotal(int[][] matriz){
    int suma=0;
    for (int i=0; i<matriz.length;i++){
        for (int j=0; j< matriz[i].length;j++){
            suma+=matriz[i][j];
        }
    }
    
    return suma;
}
    
    
}
