package com.mycompany.ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nombre;
        int edad;
        String carrera;
        double estatura;

        System.out.print("Ingrese su Nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su Edad: ");
        edad = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Ingrese su Carrera: ");
        carrera = sc.nextLine();

        System.out.print("Ingrese su Estatura en metros: ");
        estatura = sc.nextDouble();

        System.out.println("\n--- DATOS INGRESADOS ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " m");
    }
}