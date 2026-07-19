package com.mycompany.ejerciciosjava2;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;
        
        System.out.println("Ingrese la matriz 4x4:");
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nElementos de la diagonal principal:");
        for(int i = 0; i < 4; i++){
            System.out.print(matriz[i][i] + " ");
            sumaDiagonal += matriz[i][i];
        }
        
        System.out.println("\nSuma de la diagonal principal: " + sumaDiagonal);
    }
}
