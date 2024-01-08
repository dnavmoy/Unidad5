/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanzarDados;

/**
 *
 * @author daniel
 */
public class Main {
    
//    Juan Carlos Fernández Vico9:08
//Clase LanzarDado, con un atributo lista de enteros.
//EL constructor de del objeto rellena una lista simulando 1000 lanzamientos del dado
//Juan Carlos Fernández Vico9:10
//constructor parametrizado con el número de tiradas a generar
//Juan Carlos Fernández Vico9:11
//toString que devuelva de cada elemento de la lista su posición y su valor
//método para saber el número de veces que ha salido una cara
//metodo que borre todos los elementos que tenga esa cara
    public static void main(String[] args) {
        
//        LanzarDado dado1 = new LanzarDado();
//        System.out.println(dado1);
        
        LanzarDado dado2 = new LanzarDado(10);
        System.out.println(dado2);
        
        System.out.println(dado2.contarCaras(1));
        System.out.println("borrar caras 1 ");
        dado2.borrarCaras(1);
        System.out.println(dado2);
    }
 
    
    
   
    
}
