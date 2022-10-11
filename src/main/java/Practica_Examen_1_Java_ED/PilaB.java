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
public class PilaB {
    private NodoB topNodo;
    private NodoB lastNodo;
    private int clasificados = 0;
    private int noClasificados = 0;

    public boolean vacia() {
        return this.topNodo == null && this.lastNodo == null;
    }

    public void push() {
        NodoB newNodo = new NodoB();
        newNodo.setId(JOptionPane.showInputDialog("Digite el codigo"
                + " del documento asociado"));
        newNodo.setPaginas(Integer.parseInt(JOptionPane.showInputDialog(
         "Digite la cantidad de paginas que tiene el documento")));

        if(this.topNodo == null) {
            this.topNodo = newNodo;
        } else {
            newNodo.setNodoAnterior(this.topNodo);
            this.topNodo = newNodo;
        }
        this.noClasificados++;
    }
    
    public void pushLast() {
        
        NodoB newNodo = new NodoB();
        newNodo.setId(JOptionPane.showInputDialog("Digite el codigo"
                + " del documento asociado"));
        newNodo.setPaginas(Integer.parseInt(JOptionPane.showInputDialog(
         "Digite la cantidad de paginas que tiene el documento")));
        
        // Crea una pila auxiliar para guardar los valuees que se 
        // vayan desapilando de la pila original.
        NodoB cimapPilaAux = null;
        // Recoore la pila hasta llegar al node que tenga el value
        // igual que el de reference.
        while(this.topNodo != null){
            // Crea un node temporal para agregarlos a la pila auxiliar.
            NodoB temp = new NodoB();
            // Ingresa el value al node temporal.
            temp.setId(topNodo.getId());
            temp.setPaginas(topNodo.getPaginas());
            // Consulta si la pila auxiliar no a sido inicializada.
            if(cimapPilaAux == null){
                // Inicializa la pila auxiliar.
                cimapPilaAux = temp;
            }
            // Caso contrario si la pila auxiliar ya contiene elementos
            // los agrega al start.
            else{
                temp.setNodoAnterior(cimapPilaAux);
                cimapPilaAux = temp;
            }
            // Elimina el node del tope de la pila hasta llegar al node
            // que se desea eliminar.
            pop();
        }
        pop();
        if(cimapPilaAux == null) {
            cimapPilaAux = newNodo;
        } else {
            newNodo.setNodoAnterior(cimapPilaAux);
            cimapPilaAux = newNodo;
        }
        // Regresa los valuees de la pila auxiliar a la pila original
        // mientras la pila auxiliar tenga elementos.
        while(cimapPilaAux != null){
            // Utiliza el metodo push para regresar los elementos a 
            // la pila original.
            
            NodoB newNodoB = new NodoB();
            newNodoB.setId(cimapPilaAux.getId());
            newNodoB.setPaginas(cimapPilaAux.getPaginas());

            if(this.topNodo == null) {
                this.topNodo = newNodoB;
            } else {
                newNodoB.setNodoAnterior(this.topNodo);
                this.topNodo = newNodoB;
            }
            // Avansa al siguiente node de la pila auxiliar.
            cimapPilaAux = cimapPilaAux.getNodoAnterior();
        }
        // Libera la memoria utilizada por la pila auxiliar.
        cimapPilaAux = null;
        this.clasificados++;
    }
    
    public void pop(){
        if (this.topNodo != null) {
            this.topNodo = this.topNodo.getNodoAnterior();
        }
    }

    public String listarPila(){
        String listaFinal = "";
        if(this.topNodo != null) {
            NodoB aux = this.topNodo;
            while(aux != null){
                listaFinal += aux.getId() + " - " + aux.getPaginas() +
                        " paginas\n";
                aux = aux.getNodoAnterior();
            }
        }
        return listaFinal;
    }
    
    public String listarCantidad() {
        String listaCantidad;
        if(this.topNodo == null) {
            listaCantidad = "**No se han agregado documentos**";
        } else {
            listaCantidad = "**Archivos clasificados: " + this.clasificados + "\n"
                + "**Archivos no clasificados: " + this.noClasificados + "\n";
        }
        return listaCantidad;
    }
    
}
