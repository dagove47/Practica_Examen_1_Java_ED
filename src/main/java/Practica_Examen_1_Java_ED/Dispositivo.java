/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Examen_1_Java_ED;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Dispositivo {
    private int calidad;
    private int serie;
    private Dispositivo siguiente;

    public int getCalidad() {
        return this.calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public int getSerie() {
        return this.serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Dispositivo getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(Dispositivo siguiente) {
        this.siguiente = siguiente;
    }

    public Dispositivo(int calidad, int serie) {
        this.calidad = calidad;
        this.serie = serie;
    }

    public Dispositivo() {
    }
}
