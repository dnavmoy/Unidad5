/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class CatalogoLibros {
    
    public static void main(String[] args) {
        
        
        Libro l1 = new Libro("123", "JRJ", "Platero y yo","planeta", 123);
        Libro l2 = new Libro(l1);
        Libro l3 = new Libro("1234", "JRJ", "Platero y yo","planeta", 123);
        
        ArrayList<Libro> lista = new ArrayList<>();
        
        
//        System.out.println(l1);
//        System.out.println(l2);
//        System.out.println("son iguales ?" + l1.equals(l2));
//        System.out.println(l1.hashCode());
//        System.out.println(l2.hashCode());
//        System.out.println("son iguales l1 y l3 " + l1.equals(l3));
//        System.out.println("hashcode l3: " + l3.hashCode());
//    }
}
