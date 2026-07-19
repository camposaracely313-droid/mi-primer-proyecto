package com.mycompany.ejerciciosjava3;
import java.util.Scanner;
/**
 *
 * @author Aracely Mabel Campos Cabrera
 */
public class Ejercicio8 {
    public static double calcularArea(double base, double altura){
        return base * altura;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese base: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese altura: ");
        double h = sc.nextDouble();
        double area = calcularArea(b, h);
        System.out.println("El area es: " + area);
    }
}
