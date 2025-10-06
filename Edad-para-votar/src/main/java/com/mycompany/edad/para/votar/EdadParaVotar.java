/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.edad.para.votar;

import java.util.Scanner;

/**
 *
 * @author inksa
 */
public class EdadParaVotar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eres elegible para votar.");
        } else {
            System.out.println("Aún no puedes votar. Debes tener al menos 18 años.");
        }
    }
}