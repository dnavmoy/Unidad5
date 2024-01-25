/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author daniel
 */
public class CatalogoLibros {

    public static void main(String[] args) {

        Libro l1 = new Libro("123", "JRJ", "Platero y yo", "planeta", 123);
        Libro l2 = new Libro(l1);
        Libro l3 = new Libro("1234", "JRJ", "Platero y yo", "planeta", 123);

        ArrayList<Libro> lista = new ArrayList<>();
        lista.add(new Libro("123", "JRJ", "Platero y yo", "planeta", 123));
        lista.add(new Libro("321", "anonimo", "Caperucita", "planeta", 12));
        lista.add(new Libro("023", "Cervantes", "Don quijote de la Mancha", "Edebe", 1230));

        lista.forEach(System.out::println);

        //Ordenar
        System.out.println("----------------------------");
        Collections.sort(lista,
                (e1, e2) -> e1.getIsbn().compareToIgnoreCase(e2.getIsbn()));

        lista.forEach(System.out::println);

        //dos metodos que hace lo mismo
        System.out.println("ordenados por numero de paginas");
        Collections.sort(lista, (k1, k2) -> k1.getNumPags() - k2.getNumPags());
        Collections.sort(lista, (k1, k2) -> Integer.compare(k1.getNumPags(), k2.getNumPags()));
        lista.forEach(System.out::println);

        System.out.println("-------------- ordenar por autor al reves");
        Collections.sort(lista,
                (t1, t2) -> t2.getAutor().compareToIgnoreCase(t1.getAutor()));
        lista.forEach(System.out::println);

        System.out.println("otra forma mejor");
        Comparator<Libro> criterioAutor = (t1, t2) -> t1.getAutor().compareToIgnoreCase(t2.getAutor());
        Collections.sort(lista, criterioAutor.reversed());
        lista.forEach(System.out::println);

        System.out.println("------------ISBN----------------");
        Collections.sort(lista,
                (e1, e2) -> e1.getIsbn().compareToIgnoreCase(e2.getIsbn()));

        lista.forEach(System.out::println);
        //recibe la lista donde buscar, un objeto del mismo tipo que contiene
        //la lista con la clave a buscar y el criterio de ordenacion de la lista
        //lista--> lista
        // new Libro().setIsbn("lo que yo quiera buscar")
        //criterio -> (e1, e2) -> e1.getIsbn().compareToIgnoreCase(e2.getIsbn())
        Libro x = new Libro();
        x.setIsbn("023");
        int posicion =Collections.binarySearch(lista,
                x,
                (e1, e2) -> e1.getIsbn().compareToIgnoreCase(e2.getIsbn()));
        System.out.println("el libro de isbn 123 esta en " + posicion);
        
        
       
        

//        System.out.println(l1);
//        System.out.println(l2);
//        System.out.println("son iguales ?" + l1.equals(l2));
//        System.out.println(l1.hashCode());
//        System.out.println(l2.hashCode());
//        System.out.println("son iguales l1 y l3 " + l1.equals(l3));
//        System.out.println("hashcode l3: " + l3.hashCode());
    }
}
