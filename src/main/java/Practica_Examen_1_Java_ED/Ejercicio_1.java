/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Examen_1_Java_ED;

import javax.swing.*;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Ejercicio_1 {
    helper help = new helper();
    private double resultR;
    private double factR;

    public Ejercicio_1() {
    }

    public void exercise_1() {
        double x = help.recibeInt("Ingrese su constante: ");
        double n = help.recibeInt("Ingrese su variable: ");
        double i = n;
        help.imprimeMensaje("Resultado utilizando ciclos for: " + calcCos(x,n) + "\n\n" +
                "Resultado utilizando recursion: " + calcCosR(x,n,i));
        resultR = 0;

    }

    public double calcCos(double x, double n) {
        double result = 0;

        for (int i = 0; i < n; i++) {
            result += (Math.pow(-1, n) / factorial(2 * n)) * Math.pow(x, 2 * n);
        }
        return result;
    }

    public double factorial(double num) {
        double result = 1.0;

        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
    public double calcCosR(double x, double n, double i){

        if (i > 0){
            factR = 1;
            resultR += (Math.pow(-1, n) / factorialR(2 * n)) * Math.pow(x, 2 * n);
            calcCosR(x,n, i-1 );
        }
        return resultR;
    }


    public double factorialR(double num) {

        if (num == 0){
            return 1 ;
        }else{
            return num * factorialR(num - 1);
        }

    }
}

