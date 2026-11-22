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
public class Ejercicio9 {
public static void main(String[] args) {

        int numero;
        int resultado;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");
        numero = entrada.nextInt();

        for (int i = 1; i <= 12; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        entrada.close();
    }
}

