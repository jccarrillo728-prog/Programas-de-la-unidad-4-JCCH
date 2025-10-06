/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calificacion.en.letras;

import java.util.Scanner;

/**
 *
 * @author inksa
 */
public class CalificacionEnLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu calificación (0-100): ");
        int calificacion = sc.nextInt();
        char letra;

        if (calificacion >= 90) letra = 'A';
        else if (calificacion >= 80) letra = 'B';
        else if (calificacion >= 70) letra = 'C';
        else if (calificacion >= 60) letra = 'D';
        else letra = 'F';

        System.out.println("Tu calificación en letra es: " + letra);
    }
}
