/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        entrada.useLocale(Locale.US);
        
        int filas = 0;
        int columnas = 0;
        int contador = 0;
        int[][] tabla = new int[filas][columnas];
        
        System.out.print("Ingresa el número de filas: ");
        filas = scanner.nextInt();
        System.out.print("Ingresa el número de columnas: ");
        columnas = scanner.nextInt();

        
        int totalElementos = filas * columnas; 
        System.out.println("Ingresa los datos de la tabla:");

        while (contador < totalElementos) {
            int fila = contador / columnas; 
            int columna = contador % columnas; 
            System.out.print("Elemento en [" + fila + "][" + columna + "]: ");
            tabla[fila][columna] = scanner.nextInt();
            contador++;
        }

        System.out.println("\nLa tabla ingresada es:");
        contador = 0;

        while (contador < totalElementos) {
            int fila = contador / columnas;
            int columna = contador % columnas;
            System.out.print(tabla[fila][columna] + "\t");
            if (columna == columnas - 1) {
                System.out.println(); 
            }
            contador++;
        }

        scanner.close();
    }
}

    
    
