/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanzarDados;

/**
 *
 * @author daniel
 */
public class tarea2Main {
    
//    En un programa nuevo, crea dos listas de tamaño aleatorio de letras entre la 
//    'a' y la 'z'. Estas listas deben tener entre 10 y 20 elementos. Una 
//    vez creadas las listas, imprime por pantalla sus elementos usando un foreach.
//  Crea una tercera lista con los elementos de la primera que no están en la 
//          segunda. Imprime el resultado usando API Stream y lambdas.
    
    public static void main(String[] args) {
        
        ListaLetras primera = new ListaLetras();
        ListaLetras segunda = new ListaLetras();
        
        ListaLetras tercera = new ListaLetras(primera,segunda);
        System.out.println(tercera);
       
        
    }
}
