package com.mycompany.ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double calif;
        
        System.out.print("Ingrese la calificación del estudiante entre 0 y 10: ");
        calif = sc.nextDouble();
        
        if(calif >= 9 && calif <= 10){
            System.out.println("Excelente");
        } else if(calif >= 8){
            System.out.println("Muy Bueno");
        } else if(calif >= 7){
            System.out.println("Bueno");
        } else if(calif >= 5){
            System.out.println("Regular");
        } else {
            System.out.println("Deficiente");
        }
    }
}