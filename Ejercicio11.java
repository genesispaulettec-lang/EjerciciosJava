/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author User Génesis Paulette Calero Campoverde
 */
public class Ejercicio11 {
public static void main(String[] args) {

        int numero;
        int mayor = 0;
        int menor = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ":");
            numero = entrada.nextInt();

            if (i == 1) {
                mayor = numero;
                menor = numero;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }
        }

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

        entrada.close();
    }
}   

