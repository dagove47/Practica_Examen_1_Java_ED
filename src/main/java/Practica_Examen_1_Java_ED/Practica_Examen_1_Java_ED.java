/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Practica_Examen_1_Java_ED;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Practica_Examen_1_Java_ED {

    public static void main(String[] args) {
        helper help = new helper();
        Menu mainMenu = new Menu();

        help.imprimeMensaje("*Bienvenido al Sistema de la Practica de Examen!*");
        mainMenu.menu();
        help.imprimeMensaje("Gracias por visitar!");
    }
}
