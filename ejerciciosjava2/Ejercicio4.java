package com.mycompany.ejerciciosjava2;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int contPares = 0, contImpares = 0;
        int sumaPares = 0, sumaImpares = 0;
        
        System.out.println("Ingrese 20 números enteros:");
        for(int i = 0; i < 20; i++){
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
            
            if(numeros[i] % 2 == 0){
                contPares++;
                sumaPares += numeros[i];
            } else {
                contImpares++;
                sumaImpares += numeros[i];
            }
        }
        
        System.out.println("\nCantidad de pares: " + contPares);
        System.out.println("Cantidad de impares: " + contImpares);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
    }
}
