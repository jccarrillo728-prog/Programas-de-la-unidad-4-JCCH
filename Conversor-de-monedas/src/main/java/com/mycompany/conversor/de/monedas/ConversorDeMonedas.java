/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversor.de.monedas;

import java.util.Scanner;

/**
 *
 * @author inksa
 */
public class ConversorDeMonedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la cantidad en pesos mexicanos: ");
        double pesos = sc.nextDouble();

        System.out.println("Elige la moneda a convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath Tailandés(THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol Peruano (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        int opcion = sc.nextInt();

        double tasa = 0;
        switch (opcion) {
            case 1 -> tasa = 0.054;
            // USD
            case 2 -> tasa = 0.046;
            // EUR
            case 3 -> tasa = 1.75;
            // THB
            case 4 -> tasa = 8.16;
            // JPY
            case 5 -> tasa = 76.6;
            // KRW
            case 6 -> tasa = 0.082;
            // AUD
            case 7 -> tasa = 0.19;
            // PEN
            case 8 -> tasa = 0.075;
            // CAD
            case 9 -> tasa = 10.05;
            // VES
            case 10 -> tasa = 77.43;
            // ARS
            default -> {
                System.out.println("Opción inválida.");
                return;
            }
        }

        double convertido = pesos * tasa;
        System.out.println( pesos + " Equivale a: " + convertido + " en la moneda seleccionada.");
    }
}
