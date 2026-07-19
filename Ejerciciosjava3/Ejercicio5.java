package com.mycompany.ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author Aracely Mabel Campos Cabrera
 */
public class Ejercicio5 {
    public static void operaciones(double a, double b){
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Ingrese numero 2: ");
        double n2 = sc.nextDouble();
        operaciones(n1, n2);
    }
}
