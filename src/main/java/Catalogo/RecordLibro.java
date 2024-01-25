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

        
          //para hacer un constructor sin parametros hace falta un constructor por defecto
        //(con parametros) y llamarlo 
        
        public Libro(String isbn, String titulo, String autor, String editorial, int numPags) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.editorial = editorial;
            this.numPags = numPags;
        }
        
        public Libro(){
            this(" "," "," "," ",0);
        }
        
        //pero es mucho mas recomendable crear metodo para crear uno por defecto
        
        public static Libro LibroPorDefecto(){
            return new Libro(" "," "," "," ",0);
        }
        
        public static Libro LibroByISBN(String isbn){
            return new Libro(isbn," "," "," ",0);
        }
      
        
        
                
    }
    
}
