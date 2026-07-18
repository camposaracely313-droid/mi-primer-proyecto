package com.mycompany.ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese 10 números:");
        
        System.out.print("Número 1: ");
        int num = sc.nextInt();
        int mayor = num;
        int menor = num;
        
        for(int i = 2; i <= 10; i++){
            System.out.print("Número " + i + ": ");
            num = sc.nextInt();
            
            if(num > mayor){
                mayor = num;
            }
            if(num < menor){
                menor = num;
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }
}