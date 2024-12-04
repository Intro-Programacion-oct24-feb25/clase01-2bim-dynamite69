/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemploclase01;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemploclase01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero2 = 1;
        int numero;
        int limite;
        int multiplicando = 1;

        System.out.println("ingresa el numero");
        numero = entrada.nextInt();

        System.out.println("ingresa el limite");
        limite = entrada.nextInt();
        while (numero2 <= numero)
        {
            while (multiplicando <= limite) {
                System.out.println(numero2 + "x" + multiplicando + "=" + (numero2 * multiplicando));
                multiplicando = multiplicando + 1;
            }
            multiplicando = 1;
            numero2 = numero2 + 1;

        }

    }

}
