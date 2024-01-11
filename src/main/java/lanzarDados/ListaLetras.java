/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanzarDados;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author daniel
 */
public class ListaLetras {

    private ArrayList<Character> listaLetras;

    public ListaLetras() {
        Random r = new Random();
        int tamano = r.nextInt(10, 21);
        listaLetras = new ArrayList<>();

        for (int i = 0; i < tamano; i++) {
            char letra = (char) r.nextInt(97, 123);
            listaLetras.add(letra);
        }
        for (char cadena : listaLetras) {
            System.out.print(cadena + ", ");
        }
        System.out.println("");
    }
//    public ListaLetras(ListaLetras uno,ListaLetras dos){
//        listaLetras = new ArrayList<>();
//        boolean unomayor=false;
//        if(uno.listaLetras.size()>dos.listaLetras.size()){
//            unomayor=true;
//        }
//        if(unomayor){
//            for(int i=0;i<uno.listaLetras.size();i++){
//                for(int z=0;z<dos.listaLetras.size();z++){
//                    if(uno.listaLetras.get(i)==dos.listaLetras.get(z)){
//                        listaLetras.add(uno.listaLetras.get(i));
//                    }
//                }
//            }
//        }
//        else{
//            for(int i=0;i<dos.listaLetras.size();i++){
//                for(int z=0;z<uno.listaLetras.size();z++){
//                    if(dos.listaLetras.get(i)==uno.listaLetras.get(z)){
//                        listaLetras.add(dos.listaLetras.get(i));
//                    }
//                }
//            }
//        }
//        
//        
//    }

    public ListaLetras(ListaLetras uno, ListaLetras dos) {
         listaLetras = new ArrayList<>();
        for (int i = 0; i < uno.listaLetras.size(); i++) {
            for (int z = 0; z < dos.listaLetras.size(); z++) {
                if (uno.listaLetras.get(i) == dos.listaLetras.get(z)) {
                    listaLetras.add(uno.listaLetras.get(i));
                }
            }
            //listaLetras.forEach(e->System.out.println(e));
        }
        
    }
    
    
    

    

    public ArrayList<Character> getListaLetras() {
        return listaLetras;
    }

    public void setListaLetras(ArrayList<Character> listaLetras) {
        this.listaLetras = listaLetras;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListaLetras{");
        sb.append("listaLetras=").append(listaLetras);
        sb.append("listaletras tamaño " + listaLetras.size());
        sb.append('}');
        return sb.toString();
    }

}
