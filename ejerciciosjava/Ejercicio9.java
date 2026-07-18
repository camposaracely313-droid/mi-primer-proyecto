package com.mycompany.ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Ingrese un número entero: ");
        num = sc.nextInt();
        
        System.out.println("\n--- TABLA DEL " + num + " ---");
        
        for(int i = 1; i <= 12; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}