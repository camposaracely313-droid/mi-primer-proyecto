package com.mycompany.ejerciciosjava3;
import java.util.Scanner;
/**
 *
 * @author Aracely Mabel Campos Cabrera
 */
public class Ejercicio11 {
    // METODO CON PARAMETRO Y CON RETORNO BOOLEAN
    public static boolean esPar(int numero){
        return numero % 2 == 0; // retorna true si es par, false si es impar
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        
        boolean resultado = esPar(num); // llamamos al metodo
        
        // Mostrar mensaje dependiendo del resultado
        if(resultado == true){
            System.out.println("El numero " + num + " es PAR");
        } else {
            System.out.println("El numero " + num + " es IMPAR");
        }
    }
}
