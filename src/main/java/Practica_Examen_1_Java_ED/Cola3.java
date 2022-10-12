/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Examen_1_Java_ED;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Cola3 {
    private Dispositivo frente;
    private Dispositivo ultimo;

    public Cola3() {
    }

    public boolean empty() {
        return this.frente == null;
    }

    public void encola(Dispositivo newDispositivo) {
        if (this.frente == null) {
            this.frente = newDispositivo;
            this.ultimo = newDispositivo;
        } else {
            this.ultimo.setSiguiente(newDispositivo);
            this.ultimo = newDispositivo;
        }

    }

    public void Calidadfill(int calidad) {
        Dispositivo newDispositivo = new Dispositivo();
        newDispositivo.setCalidad(calidad);
        if (this.empty()) {
            this.frente = newDispositivo;
        } else {
            newDispositivo.setSiguiente(this.frente);
            this.frente = newDispositivo;
        }

    }

    public void list() {
        for(Dispositivo aux = this.frente; aux != null; aux = aux.getSiguiente()) {
            System.out.println("-----------------");
            System.out.println("|\t" + aux.getCalidad() + "\t|");
            System.out.println("-----------------");
        }

    }

    public Dispositivo Next() {
        Dispositivo aux = this.frente;
        if (this.frente == null) {
            this.frente = this.frente.getSiguiente();
            aux.setSiguiente((Dispositivo)null);
        }

        return aux;
    }
}
