package com.mycompany.ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota;
        
        System.out.print("Ingrese la nota del estudiante: ");
        nota = sc.nextDouble();
        
        if(nota >= 7){
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}