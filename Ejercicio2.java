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
public class Ejercicio2 {
 public static void main(String[] args) {   
     
   int num1;
   int num2;
   int suma;
   int resta;
   int multiplicacion;
   double division;
   int residuo;
   
  Scanner numeros = new Scanner(System.in);
  
  System.out.println ("Ingrese el primer numero:");
  num1 = numeros.nextInt();
  
   System.out.println ("Ingrese el segundo numero:");
  num2 = numeros.nextInt();
  
  suma = num1 + num2;
  resta = num1 - num2;
  multiplicacion = num1 * num2;

  
 System.out.println("Suma:" + suma);
 System.out.println("Resta" + resta);
 System.out.println ("Multiplicacion:" + multiplicacion);
 
 if (num2 !=0) {
     division = (double) num1 / num2;
     residuo = num1 % num2;
             
 System.out.println("Division" + division);
 System.out.println("Residuo" + residuo);

 } else {
 System.out.println("No se puede dividir entre cero.");
 System.out.println("No se puede calcular el residuo"); 
 }
 
numeros.close();
 }
}

  
                
  
  
  
     
     
     
     
     
     
