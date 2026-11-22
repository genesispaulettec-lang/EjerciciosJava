/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author Génesis Paulette Calero Campoverde
 */
public class Ejercicio10 {
public static void main(String[] args) {

        int numero;
        int suma = 0;
        double promedio;

        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ":");
            numero = entrada.nextInt();
            suma = suma + numero;
        }

        promedio = (double) suma / 10;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);

        entrada.close();
    }
}