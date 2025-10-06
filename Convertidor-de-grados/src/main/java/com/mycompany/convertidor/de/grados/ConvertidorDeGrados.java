/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertidor.de.grados;

import java.util.Scanner;

/**
 *
 * @author inksa
 */
public class ConvertidorDeGrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double Gradoscelsius = sc.nextDouble();

        System.out.println("Elige la conversión: ");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> {
                double fahrenheit = (Gradoscelsius * 9 / 5) + 32;
                System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
            }
            case 2 -> {
                double kelvin = Gradoscelsius + 273.15;
                System.out.println("La temperatura en Kelvin es: " + kelvin);
            }
            default -> System.out.println("Opción inválida.");
        }
    }
}
