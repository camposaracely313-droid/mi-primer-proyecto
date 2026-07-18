package com.mycompany.ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int edad;
        
        System.out.print("Ingrese la edad de la persona: ");
        edad = sc.nextInt();
        
        if(edad >= 18){
            System.out.println("Es mayor de edad.");
        } 
    }
}