/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploPropioCatalogo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class Catalogo {

    public static void main(String[] args) {

        ArrayList<Espadas> armeria = new ArrayList<>();

        armeria.add(new Espadas("Espada Larga", 100, 1.5, 1550, Paises.ALEMANIA));
        armeria.add(new Espadas("Espadin", 70, 0.7, 1800, Paises.ESPAÑA));
        armeria.add(new Espadas("Schiavona", 105, 1.125, 1630, Paises.ITALIA));
        armeria.add(new Espadas("Sable", 88, 0.9, 1822, Paises.FRANCIA));

        armeria.forEach(System.out::println);

        System.out.println("------ Ordenado por largo  ------");
        Collections.sort(armeria, (e1, e2) -> e1.getLargo() - e2.getLargo());
        armeria.forEach(System.out::println);

        System.out.println("------ Ordenado por peso  ------" );
        Comparator<Espadas> criterioPeso = (p1,p2) -> Double.compare(p1.getPeso(), p2.getPeso());
        Collections.sort(armeria, criterioPeso);
        armeria.forEach(System.out::println);
                   
           
        System.out.println("------ Ordenado por Nombre  ------");
        Collections.sort(armeria, (e1, e2) -> e1.getNombre().compareTo(e2.getNombre())) ;
        armeria.forEach(System.out::println);

        
        System.out.println("------ Ordenado por Pais (segun la lista) ------");
        Collections.sort(armeria, (e1, e2) -> e1.getPais().compareTo(e2.getPais()));
        armeria.forEach(System.out::println);
        
        
        System.out.println("------ Ordenado por Pais (segun nombre) ------");
        Collections.sort(armeria, (e1, e2) -> e1.getPais().getNombre().compareTo(e2.getPais().getNombre()));
        armeria.forEach(System.out::println);
        
        
        System.out.println("------ Ordenado por Epoca al reves ------");
        Comparator<Espadas> criterioEpoca= (e1,e2) -> e1.getEpoca() - e2.getEpoca();
        Collections.sort(armeria, criterioEpoca.reversed());
        armeria.forEach(System.out::println);
        
        
        Function<String,String> pedirDatoString = x-> JOptionPane.showInputDialog(x);
        Function<String,Integer> pedirDatoInt = x-> Integer.parseInt(JOptionPane.showInputDialog(x));
        Function<String,Double> pedirDatoDouble = x-> Double.parseDouble(JOptionPane.showInputDialog(x));
        
        //Object opcion = JOptionPane.showInputDialog(null, "selecicona pais", "paises", 0, null  , Paises.values(), "españa");
        //Function<String,Paises> pedirDatoPais = x-> JOptionPane.showInputDialog(null, "selecciona pais", "paises", 0, null  , Paises.values(), "españa");
        
        
        armeria.add(new Espadas(pedirDatoString.apply("introduce nombre"),
                pedirDatoInt.apply("introduce Largo"),
                pedirDatoDouble.apply("introduce peso"),
                pedirDatoInt.apply("introduce epoca"),
                Paises.ESPAÑA));
        armeria.forEach(System.out::println);
        
        
        
    }
    }

