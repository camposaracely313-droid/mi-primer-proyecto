package com.mycompany.ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author aracely mabel campos cabrera
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        int contador = 0;
        
        System.out.println("Ingrese números positivos. Para terminar escriba un negativo:");
        
        numero = sc.nextInt();
        
        while(numero >= 0){
            suma = suma + numero;
            contador++;
            numero = sc.nextInt();
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Cantidad de números ingresados: " + contador);
        System.out.println("Suma total: " + suma);
    }
}