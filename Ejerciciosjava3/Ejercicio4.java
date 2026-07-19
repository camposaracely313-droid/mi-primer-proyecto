package com.mycompany.ejerciciosjava3;
import java.util.Scanner;
/**
 *
 * @author Aracely Mabel Campos Cabrera
 */
public class Ejercicio4 {
    public static void mostrarDatos(String nombre, int edad){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nom = sc.nextLine();
        System.out.print("Ingrese edad: ");
        int ed = sc.nextInt();
        mostrarDatos(nom, ed);
    }
}
