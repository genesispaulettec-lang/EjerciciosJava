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
public class Ejercicio3 {
public static void main(String[] args) {

        int edad;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }

        entrada.close();
    }
}   

