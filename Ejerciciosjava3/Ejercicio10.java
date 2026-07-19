package com.mycompany.ejerciciosjava3;
import java.util.Scanner;
/**
 *
 * @author Aracely Mabel Campos Cabrera
 */
public class Ejercicio10 {
    public static int mayor(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese numero 1: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese numero 2: ");
        int n2 = sc.nextInt();
        int may = mayor(n1, n2);
        System.out.println("El mayor es: " + may);
    }
}
