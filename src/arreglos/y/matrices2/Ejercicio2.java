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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número real " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }

        double promedio = suma / numeros.length;

        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

        sc.close();
    }    
}
