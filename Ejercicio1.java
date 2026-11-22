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
public class Ejercicio1 {  
public static void main(String[] args) {
    String nombre;
    int edad;
    String carrera;
    double estatura;
    
 Scanner entrada = new Scanner(System.in);
 
 System.out.println("Ingrese su nombre:");
 nombre = entrada.nextLine();
 
 System.out.println("Ingrese su edad:");
 edad = entrada.nextInt();
 entrada.nextLine();
 
 System.out.println("Ingrese su carrera:");
 carrera = entrada.nextLine();
 
 System.out.println("Ingrese su estatura:");
 estatura = entrada.nextDouble();
 
 
 System.out.println("Nombre:" + nombre);
 System.out.println("Edad:" + edad);
 System.out.println ("Carrera:" + carrera);
 System.out.println ("Estatura:" + estatura);
 
 
 
 }  
}
