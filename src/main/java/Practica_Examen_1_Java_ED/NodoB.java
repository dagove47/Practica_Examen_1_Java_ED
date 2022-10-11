/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_Examen_1_Java_ED;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class NodoB {
    
    private String id;
    private int paginas;
    private NodoB nodoAnterior;
    
    public NodoB() {
        this.nodoAnterior = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public NodoB getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(NodoB nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
    
    
}
