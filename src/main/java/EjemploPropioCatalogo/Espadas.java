/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploPropioCatalogo;

import java.util.Objects;

/**
 *
 * @author daniel
 */
public class Espadas {
    
    private String nombre;
    private int Largo;
    private double peso;
    private int epoca;
    private Paises pais;

    public Espadas(String nombre, int Largo, double peso, int epoca, Paises pais) {
        this.nombre = nombre;
        this.Largo = Largo;
        this.peso = peso;
        this.epoca = epoca;
        this.pais = pais;
    }
    
    public Espadas(){
        
    }
    
    public Espadas(Espadas copia){
        this.nombre = copia.nombre;
        this.Largo = copia.Largo;
        this.peso = copia.peso;
        this.epoca = copia.epoca;
        this.pais = copia.pais;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLargo() {
        return Largo;
    }

    public double getPeso() {
        return peso;
    }

    public int getEpoca() {
        return epoca;
    }

    public Paises getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLargo(int Largo) {
        this.Largo = Largo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEpoca(int epoca) {
        this.epoca = epoca;
    }

    public void setPais(Paises pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Espadas{");
        sb.append("nombre=").append(nombre);
        sb.append(", Largo=").append(Largo);
        sb.append(", peso=").append(peso);
        sb.append(", epoca=").append(epoca);
        sb.append(", pais=").append(pais);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.nombre);
        hash = 13 * hash + this.Largo;
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        hash = 13 * hash + this.epoca;
        hash = 13 * hash + Objects.hashCode(this.pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Espadas other = (Espadas) obj;
        if (this.Largo != other.Largo) {
            return false;
        }
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (this.epoca != other.epoca) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return this.pais == other.pais;
    }
    
    
            
            
            
    
}
