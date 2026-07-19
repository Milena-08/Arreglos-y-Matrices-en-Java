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
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantPares = 0, cantImpares = 0;
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                cantPares++;
                sumaPares += numeros[i];
            } else {
                cantImpares++;
                sumaImpares += numeros[i];
            }
        }

        System.out.println("Cantidad de números pares: " + cantPares);
        System.out.println("Cantidad de números impares: " + cantImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);

        sc.close();
    }    
}
