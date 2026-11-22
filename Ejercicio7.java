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
public class Ejercicio7 {
public static void main(String[] args) {

        int numero;
        int cantidad = 0;
        int suma = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese numeros positivos (negativo para terminar):");
        numero = entrada.nextInt();

        while (numero >= 0) {
            cantidad++;
            suma = suma + numero;

            System.out.println("Ingrese otro numero:");
            numero = entrada.nextInt();
        }

        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);

        entrada.close();
    }
}