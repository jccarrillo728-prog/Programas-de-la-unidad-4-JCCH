/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calificaciones.finales;

import java.util.Scanner;

/**
 *
 * @author inksa
 */
public class CalificacionesFinales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double parcial, proyecto, examen, promF;

        System.out.print("Ingresa la calificación de los parciales (0-100): ");
        parcial = sc.nextDouble();
        System.out.print("Ingresa la calificación del proyecto (0-100): ");
        proyecto = sc.nextDouble();
        System.out.print("Ingresa la calificación del examen final (0-100): ");
        examen = sc.nextDouble();

        if ((parcial < 0 || parcial > 100) || (proyecto < 0 || proyecto > 100) || (examen < 0 || examen > 100)) {
            System.out.println("Error: Las calificaciones deben estar entre 0 y 100.");
        } else {
            promF = (parcial * 0.4) + (proyecto * 0.3) + (examen * 0.3);
            System.out.println("La calificación final es: " + promF);
        }
    }
}
