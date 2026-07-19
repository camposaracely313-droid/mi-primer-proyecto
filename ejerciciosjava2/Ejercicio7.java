package com.mycompany.ejerciciosjava2;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int suma = 0;
        
        System.out.println("Ingrese la matriz 4x4:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Fila " + i + " Columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
                suma += matriz[i][j]; // vamos sumando
            }
        }
        
        System.out.println("\nLa suma total de todos los elementos es: " + suma);
    }
}
