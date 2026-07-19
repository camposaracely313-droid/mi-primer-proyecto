package com.mycompany.ejerciciosjava2;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        
        System.out.println("Ingrese 12 números positivos:");
        for(int i = 0; i < 12; i++){
            System.out.print("Posición " + i + " - Ingrese número: ");
            int num = sc.nextInt();
            numeros[i] = num + i; // sumamos el índice
        }
        
        System.out.println("\nArreglo modificado:");
        for(int i = 0; i < 12; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
