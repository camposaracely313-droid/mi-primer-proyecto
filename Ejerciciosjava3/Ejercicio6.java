package com.mycompany.ejerciciosjava3;
/**
 *
 * @author Aracely Mabel Campos Cabrera
 */
public class Ejercicio6 {
    public static int obtenerNumero(){
        return (int)(Math.random() * 100) + 1; // 1 a 100
    }
    
    public static void main(String[] args) {
        int num = obtenerNumero();
        System.out.println("Numero aleatorio: " + num);
    }
}
