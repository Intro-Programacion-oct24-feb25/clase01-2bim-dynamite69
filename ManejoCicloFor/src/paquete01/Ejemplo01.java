/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadenaFinal = "";
        for (int i = 10; i <= 18; i++) {
            // comentario
            
            cadenaFinal = String.format("%s%d", 
                    cadenaFinal,i);
        }
        
        for (int i = 10; i < 20; i++) {
            cadenaFinal = String.format("%s%d", 
                    cadenaFinal,i);
        }
        
<<<<<<< HEAD
        System.out.printf("%s", cadenaFinal);
        System.out.println("via la roja");
=======
        System.out.printf("%d", cadenaFinal);
        System.out.println("cadenaFinal");
>>>>>>> 647772bbd3cdc1b66d57921ae43eb1795c01a50d

    }

}
