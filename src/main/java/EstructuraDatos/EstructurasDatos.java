/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructuraDatos;

import java.util.ArrayList;
import java.util.Iterator;

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
        //borrado con objeto
        lista.remove(Integer.valueOf(20));
        System.out.println("borrar posicion valor 20 \n" + lista);
        
        //borrado por posicion (int) tiene que ser valida dentro dela lista
        
        lista.remove(0);
        System.out.println("borrado posicion 0\n" + lista);
        
        //formas de recorrer la lista
        
        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }
        
        //foreach
        
        for(Integer var:lista){
            System.out.println("numero: " + var);
        }
        
        //recorido con un iterador
        
       Iterator<Integer> it=lista.iterator();

       while(it.hasNext()){
           System.out.println(it.next());
       }
        
       
        System.out.println("----------------------------------");
        
        //expresion lamda y api Stream
        lista.forEach(e->System.out.println(e));
        
        lista.forEach(System.out::println);
        
        
    }
}
