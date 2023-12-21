/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package enclase.unidad5;

/**
 *
 * @author daniel
 */
public class Unidad5 {

    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("pepe", 32, "estepona", "pepe@");
        
        Cliente c2 =new Cliente("pepe", 32, "estepona", "pepe@");
        
        Cliente c3 = new Cliente("luis", 30, "estepona", "luis@");
        
        System.out.println("c1 y c2 : " + c1.equals(c2));
        System.out.println("c1 y c3: " + c1.equals(c3));
        
        Cliente c4=c1;
        
        System.out.println("hashcode c1 "+ c1.hashCode());
        System.out.println("hashcode c2 " + c2.hashCode());
        System.out.println("hashcode c3 " + c3.hashCode());
        System.out.println("hashcode c4 " + c4.hashCode());
        
        
        
    }
}
