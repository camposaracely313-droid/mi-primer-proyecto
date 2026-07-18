package com.mycompany.ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suma = 0;
        double promedio;
        
        System.out.println("Ingrese 10 números enteros:");
        
        for(int i = 1; i <= 10; i++){
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();
            suma = suma + num;
        }
        
        promedio = suma / 10.0; // el .0 para que salga con decimales
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}