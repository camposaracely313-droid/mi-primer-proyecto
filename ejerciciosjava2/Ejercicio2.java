package com.mycompany.ejerciciosjava2;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;
        
        System.out.println("Ingrese 10 números reales:");
        for(int i = 0; i < 10; i++){
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }
        
        double promedio = suma / 10.0;
        System.out.println("\nSuma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
