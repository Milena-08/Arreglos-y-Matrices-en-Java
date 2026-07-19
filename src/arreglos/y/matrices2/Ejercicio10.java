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
public class Ejercicio10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese el valor para fila " + i + ", columna " + j + ": ");
                int valor = sc.nextInt();
                matriz[i][j] = valor + (i * j);
            }
        }

        System.out.println("\n--- Matriz resultante ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }    
}
