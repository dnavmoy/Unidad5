/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package EjemploPropioCatalogo;

/**
 *
 * @author daniel
 */
public enum Paises {
 
    ESPAÑA("España"),
    FRANCIA("Francia"),
    ALEMANIA("Alemania"),
    ITALIA("Italia");
    
    private final String Nombre;

    private Paises(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paises{");
        sb.append("Nombre=").append(Nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
