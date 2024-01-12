/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploPropioCatalogo;

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
    
    
            
            
            
    
}
