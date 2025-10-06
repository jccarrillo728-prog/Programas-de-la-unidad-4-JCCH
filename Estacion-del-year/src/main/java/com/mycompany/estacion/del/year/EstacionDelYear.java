/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estacion.del.year;

import java.util.Scanner;

/**
 *
 * @author inksa
 */
public class EstacionDelYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número del mes (1-12): ");
        int mes = sc.nextInt();

        String estacion;
        estacion = switch (mes) {
            case 12, 1, 2 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Mes inválido";
        };

        System.out.println("La estación del año es: " + estacion);
    }
}