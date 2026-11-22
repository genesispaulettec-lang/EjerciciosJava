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
public class Ejercicio8 {
public static void main(String[] args) {

        String contrasena;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Ingrese la contrasena:");
            contrasena = entrada.nextLine();

        } while (!contrasena.equals("java2026"));

        System.out.println("Acceso concedido.");

        entrada.close();
    }
}  
