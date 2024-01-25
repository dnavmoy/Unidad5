/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploMatriz;

import java.sql.SQLOutput;

/**
 *
 * @author daniel
 */
public class EjemploMatriz {
    
    public static void main(String[] args) {
        
        
        //matriz de 2x2 de int
        
        int[][]matrizInt=new int [2][2];
        //inicialiacion de valores manualmente
        /*
                 COL1  COL2
        FILA 1--> 3     5 
        FILA 2--> 1     9 
        */
        
        matrizInt[0][0]=3;
        matrizInt[0][1]=5;
        matrizInt[1][0]=1;
        matrizInt[0][1]=9;
        
        System.out.println(" elemento f1 c1 " + matrizInt[0][0]);
        
        int[][] matriz2 = {
        {3,4,5},
        {6,7,8,3,6},
        {9,10,11},
        {0,0,0},
    };
        
        System.out.println("filas de matriz 2 :" + matriz2.length);
        System.out.println("columnas de matriz2 fila 2 :" + matriz2[1].length);
        
        
        //recorrido de todos los elementos de la matriz
        //recorremos las filas (matriz2.length)
        //en cada fila recorremos las columnas (matriz2[numerofila].lenght)
        for (int i=0; i<matriz2.length; i++){
            System.out.println("\n");
            for(int n=0; n<matriz2[i].length;n++){
                System.out.print(" E i n " +i+" " + n + " : "+matriz2[i][n]);
            }
            
        }
        
    }
    
}
