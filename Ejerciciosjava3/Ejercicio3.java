package com.mycompany.ejerciciosjava3;
import java.util.Scanner;
/**
 *
 * @author Aracely Mabel Campos Cabrera
 */
public class Ejercicio3 {
    public static void saludar(String nombre){
        System.out.println("Bienvenido " + nombre + ".");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nom = sc.nextLine();
        saludar(nom);
    }
}
