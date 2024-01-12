/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package Catalogo;

/**
 *
 * @author daniel
 */
public record RecordLibro() {

    // tiene constructor por defecto, getters, setters ,etc  ya metido
    
    public record  Libro (String isbn, String titulo, String autor, String editorial,
            int numPags){
        
                
    }
    
}
