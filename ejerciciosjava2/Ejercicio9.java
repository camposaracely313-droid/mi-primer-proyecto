package com.mycompany.ejerciciosjava2;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        
        System.out.println("Ingrese la matriz 5x5:");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
                if(matriz[i][j] < menor){
                    menor = matriz[i][j];
                }
            }
        }
        
        System.out.println("\nMayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
    }
}
