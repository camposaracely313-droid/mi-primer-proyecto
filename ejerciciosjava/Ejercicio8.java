package com.mycompany.ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String contraseña;
        String correcta = "java2026";
        
        do {
            System.out.print("Ingrese la contraseña: ");
            contraseña = sc.nextLine();
            
            if(!contraseña.equals(correcta)){
                System.out.println("Contraseña incorrecta. Intente de nuevo.");
            }
            
        } while(!contraseña.equals(correcta));
        
        System.out.println("Acceso concedido.");
    }
}