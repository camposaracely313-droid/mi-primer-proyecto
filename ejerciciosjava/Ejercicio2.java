package com.mycompany.ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.print("Ingrese el primer número entero: ");
        num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        num2 = sc.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;  // división entera
        int residuo = num1 % num2;
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multi);
        System.out.println("División: " + div);
        System.out.println("Residuo: " + residuo);
    }
}