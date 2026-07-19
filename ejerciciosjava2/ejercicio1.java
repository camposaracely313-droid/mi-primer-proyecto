package com.mycompany.ejerciciosjava2;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[10]; 
        
        System.out.println("Ingrese 10 números enteros:");
        
        for(int i = 0; i < 10; i++){
            System.out.print("Posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("\n--- VALORES ALMACENADOS ---");
        
        for(int i = 0; i < 10; i++){
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }
}
