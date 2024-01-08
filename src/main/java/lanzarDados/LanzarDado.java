/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lanzarDados;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author daniel
 */
public class LanzarDado {

    private final int VALOR_DEFECTO = 1000;
    private ArrayList<Integer> lanzarDado;

    public LanzarDado() {
        Random r = new Random();
        lanzarDado = new ArrayList<>(VALOR_DEFECTO);
        for (int i = 0; i < VALOR_DEFECTO; i++) {
            lanzarDado.add(i, r.nextInt(1, 7));
        }

    }

    public LanzarDado(int tamano) {
        Random r = new Random();
        lanzarDado = new ArrayList<Integer>(tamano);
        for (int i = 0; i < tamano; i++) {
            lanzarDado.add(i, r.nextInt(1, 7));
        }

    }

    public int getVALOR_DEFECTO() {
        return VALOR_DEFECTO;
    }

    public ArrayList<Integer> getLanzarDado() {
        return lanzarDado;
    }

    public void setLanzarDado(ArrayList<Integer> lanzarDado) {
        this.lanzarDado = lanzarDado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LanzarDado{");
        sb.append("Total Dados").append(lanzarDado.size());
        for (int i = 0; i < lanzarDado.size(); i++) {
            sb.append("\nposicion " + i + "dado: " + lanzarDado.get(i) + " ");
        }

        sb.append('}');
        return sb.toString();
    }

    public int contarCaras(int valor) {
        int contador = 0;
        for (int i = 0; i < lanzarDado.size(); i++) {
            if (lanzarDado.get(i) == valor) {
                contador++;
            }
        }

        return contador;
    }

    public void borrarCaras(int valor) {
        Iterator<Integer> it = lanzarDado.iterator();
        
        while (it.hasNext()) {
            Integer i = it.next();
            if (i == valor) {
                it.remove();
            }
           

        }

    }

}
