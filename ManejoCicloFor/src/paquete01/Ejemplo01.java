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
        for (int i = 4; i <= 14; i++) {
            // comentario
            
            cadenaFinal = String.format("%s%d", 
                    cadenaFinal,i);
        }
        
        for (int i = 5; i < 15; i++) {
            cadenaFinal = String.format("%s%d", 
                    cadenaFinal,i);
        }
        
        System.out.printf("%s", cadenaFinal);

    }

}
