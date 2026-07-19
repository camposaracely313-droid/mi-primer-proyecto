package com.mycompany.ejerciciosjava3;
import java.util.Scanner;
/**
 *
 * @author Aracely Mabel Campos Cabrera
 */
public class Ejercicio9 {
    public static double calcularPromedio(double n1, double n2, double n3){
        return (n1 + n2 + n3) / 3;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();
        
        double prom = calcularPromedio(n1, n2, n3);
        System.out.println("Promedio: " + prom);
        if(prom >= 7){
            System.out.println("Aprobo");
        } else {
            System.out.println("Reprobo");
        }
    }
}
