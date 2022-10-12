/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Examen_1_Java_ED;

import javax.swing.*;
import java.util.Random;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Ejercicio3 {
    public void Ej3Solution(){
        Random r = new Random();
        int num1 = r.nextInt(1500);
        int num2 = r.nextInt(1500);
        int num3 = r.nextInt(1500);
        int num4 = r.nextInt(1500);
        int num5 = r.nextInt(1500);
        int num6 = r.nextInt(1500);
        int num7 = r.nextInt(1500);
        int[] list = new int[]{num1, num2, num3, num4, num5, num6, num7};
        Cola3 calidad = new Cola3();
        calidad.Calidadfill(num1);
        calidad.Calidadfill(num2);
        calidad.Calidadfill(num3);
        calidad.Calidadfill(num4);
        calidad.Calidadfill(num5);
        calidad.Calidadfill(num6);
        calidad.Calidadfill(num7);
        int Continue = JOptionPane.showConfirmDialog(null, "Desea iniciar el proceso de control de calidad?", "Pregunta", 0);
        if (Continue == 0) {
            for(int x = 6; x >= 0; --x)
                if (list[x] < 500 && list[x] >= 250) {
                    System.out.println("elemento regresa a la cola");
                    System.out.println("\n");
                    System.out.println("La cola no sufre cambios : ");
                    System.out.println("\n");
                    calidad.list();
                } else if (list[x] < 500 && list[x] < 250) {
                    System.out.println("Elemento eliminado de la cola");
                    System.out.println("\n");
                    System.out.println("Cola despues de la eliminacion : ");
                    System.out.println("\n");
                    calidad.Next();
                    calidad.list();
                } else {
                    System.out.println("Elemento enviado al cliente");
                    System.out.println("\n");
                    System.out.println("Cola actualizada : ");
                    System.out.println("\n");
                    calidad.Next();
                    calidad.list();
                }
        } else {
            JOptionPane.showMessageDialog(null, "Hasta Luego!  ( *・∀・)ノ゛");
        }

    }
}
