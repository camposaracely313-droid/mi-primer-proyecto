package com.mycompany.ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        
        System.out.println("Ingrese la matriz 3x5:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("Fila " + i + " Columna " + j + ": ");
                int num = sc.nextInt();
                matriz[i][j] = num + (i * j);
            }
        }
        
        System.out.println("\nMatriz resultante:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
