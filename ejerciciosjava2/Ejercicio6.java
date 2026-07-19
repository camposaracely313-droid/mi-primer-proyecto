package com.mycompany.ejerciciosjava2;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        
        System.out.println("Ingrese la matriz 3x4:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Fila " + i + " Columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\nMatriz ingresada:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
     }
