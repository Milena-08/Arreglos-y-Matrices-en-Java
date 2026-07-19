/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.y.matrices2;

import java.util.Scanner;

/**
 *
 * @author Milena Mishell Zambrano Alava
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número positivo en la posición " + i + ": ");
            int valor = sc.nextInt();
            numeros[i] = valor + i;
        }

        System.out.println("\n--- Arreglo resultante ---");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        sc.close();
    }    
}
