/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Examen_1_Java_ED;

import javax.swing.JOptionPane;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Menu {

    helper help = new helper();
    Ejercicio_1 e1 = new Ejercicio_1();

    public void menu() {
        int opcion;
        do {
            opcion = help.recibeInt("Ingrese el ejercicio al que desea ingresar: \n\t1. Formula\n"
                    + "\t2.Archivos Clasificados\n\t3.Fila para Banco\n\t4.Salir\nSeleccione el que desea revisar (1-4): ");
            switch (opcion) {
                case 1:
                    e1.exercise_1();
                case 2:
                    menuArchivos();
                case 3:

                case 4:
                    break;

                default:
                    help.imprimeMensaje("La opcion digitada no existe, por favor intente de nuevo...");
            }
        } while (opcion != 4);
    }
    
    public static void menuArchivos() {
        PilaB pila = new PilaB();
        int loop = 0;
        while(loop == 0) {
            int option = Integer.parseInt(JOptionPane.showInputDialog(
                    "Cantidad de archivos: \n\n" + 
                    pila.listarCantidad() + "\n\n" +
                    "Digite el numero de la accion que desea realizar:\n\n" +
                    "0- Salir \n" +
                    "1- Agregar nuevo documento \n" +
                    "2- Ver pila de documentos \n\n"));
            switch(option) {
                case 0:
                    loop = 1;
                    break;
                case 1:
                    if(isConfidential()) {
                        pila.pushLast();
                    } else {
                        pila.push();
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, 
                            pila.listarPila());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Valor valor incorrecto\n" +
                            "Por favor, digite una de las 3 opciones \n");
                    break;
            }
        }
    }
    
    public static boolean isConfidential() {
        boolean confidential = false;
        int select = JOptionPane.showConfirmDialog(null,
                "El documento es confidencial?",
                 "Question",JOptionPane.YES_NO_OPTION);
        if(select == 0) {confidential = true;}
        return confidential;
    }
}
