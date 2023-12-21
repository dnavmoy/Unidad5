/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraDatos;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class EstructurasDatos {

    public static void main(String[] args) {

        //lista tiene tamaño cero y no tiene elementos solo objetos, se puede
        //poner clase envolvente cono Integer, Character,etc
        ArrayList<Integer> lista = new ArrayList<>();
        //tamaño
        System.out.println("tamaño " + lista.size());
        //mostrar con tostring
        System.out.println(lista);
        //añadir al final de la lista
        lista.add(12);
        System.out.println("tamaño " + lista.size());
        System.out.println(lista);
        
        
        lista.add(14);
        lista.add(16);
        lista.add(18);
        System.out.println("tamaño " + lista.size());
        System.out.println(lista);
        System.out.println("elemento de la posicion dos:" + lista.get(2));
        
        try{
             System.out.println("elemento de la posicion 15:" + lista.get(15));
        }catch(IndexOutOfBoundsException iob){
            System.out.println("elemento no valido");
        }
        //añade el elemento en la posicion indicada, la posicion debe ser 
        //>=0y menor que size()
        lista.add(2, 20);
        System.out.println(lista);
        
        //cambiar un dato de una posicion
        
        lista.set(3, 15);
        System.out.println(lista);
        
        if (lista.isEmpty()){
            System.out.println("la lista esta vacia");
        }else{
            System.out.println("la lista tiene elementos");
        }
        
        System.out.println("contiene el 5? "+lista.contains(5));
        System.out.println("contiene el 15? "+lista.contains(15));
        
        System.out.println("posicion donde esta el elemento 15 : " + lista.indexOf(15));
    }
}