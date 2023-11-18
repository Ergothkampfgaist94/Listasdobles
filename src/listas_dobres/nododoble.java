/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas_dobres;

/**
 *
 * @author salak405
 */
public class nododoble {

    private int elemento;
    private nododoble siguiente;//ubicacion de memora
    private nododoble anterior;//ubicacion de memora

    public nododoble(int elemento, nododoble siguiente, nododoble anterior) {
        this.elemento = elemento;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public nododoble() {
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public nododoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nododoble siguiente) {
        this.siguiente = siguiente;
    }

    public nododoble getAnterior() {
        return anterior;
    }

    public void setAnterior(nododoble anterior) {
        this.anterior = anterior;
    }

}
