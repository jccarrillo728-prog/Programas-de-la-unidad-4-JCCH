/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.descuento.en.precio;

import java.util.Scanner;

/**
 *
 * @author inksa
 */
public class DescuentoEnPrecio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el precio original del producto: ");
        double precio = sc.nextDouble();
        double desc = 0;

        if (precio > 100 && precio <= 200) desc = 0.10;
        else if (precio > 200 && precio <= 500) desc = 0.20;
        else if (precio > 500) desc = 0.25;

        double precioF = precio - (precio * desc);
        System.out.println("El precio final con descuento es: $" + precioF);
    }
}
