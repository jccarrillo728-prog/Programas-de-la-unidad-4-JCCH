/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.informacion.preferencias;

import java.util.Scanner;

/**
 *
 * @author inksa
 */
public class InformacionPreferencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre de un artista, película, serie, videojuego o canción:");
        String nombre = sc.nextLine(); 


        switch (nombre) {
            case "david gilmour" -> System.out.println("Es un músico, compositor y multiinstrumentista británico, conocido por haber sido vocalista, guitarrista y uno de los compositores de la banda de rock progresivo Pink Floyd,");

            case "transformers" -> System.out.println("Transformers es una película de acción y ciencia ficción estadounidense de 2007 basada en la franquicia del mismo nombre.");

            case "breaking bad" -> System.out.println("Breaking Bad es una serie estadounidense sobre un profesor de química que se convierte en fabricante de metanfetamina.");

            case "gears of war" -> System.out.println("Gears of War es una serie de videojuegos y de cómics del género shooter en tercera persona y acción-aventura, desarrollada por Epic Games y The Coalition.");

            case "no more tears" -> System.out.println("No More Tears es una famosa canción de rock del cantante Ozzy Osbourne, lanzada en 1991 como parte del álbum del mismo nombre.");
            

            default -> System.out.println("Lo siento, no tengo información sobre \"" + nombre + "\".");
        }
    }
}
