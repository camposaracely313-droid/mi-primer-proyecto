package com.mycompany.ejerciciosjava2;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15]; // 15
        
        System.out.println("Ingrese 15 números enteros:");
        for(int i = 0; i < 15; i++){ // 15
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        int mayor = numeros[0];
        int menor = numeros[0];
        int posMayor = 0;
        int posMenor = 0;
        
        for(int i = 1; i < 15; i++){ // 15
            if(numeros[i] > mayor){
                mayor = numeros[i];
                posMayor = i;
            }
            if(numeros[i] < menor){
                menor = numeros[i];
                posMenor = i;
            }
        }
        
        System.out.println("\nNúmero mayor: " + mayor + " en posición: " + posMayor);
        System.out.println("Número menor: " + menor + " en posición: " + posMenor);
    }
}
