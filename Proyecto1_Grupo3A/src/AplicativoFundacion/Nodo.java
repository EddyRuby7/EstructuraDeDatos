/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplicativoFundacion;

/**
 *
 * @author USUARIO
 */
public class Nodo {
    //Declaracion de Atributos
    private RegistroFamilia familia;
    private RegistroDatos dato;
    private Nodo siguiente;

    //Constructor
    public Nodo(RegistroFamilia familia) {
        this.familia = familia;
        siguiente=null;
    }

    public Nodo(RegistroDatos dato) {
        this.dato = dato;
        siguiente=null;
    }

    public Nodo(RegistroFamilia familia, Nodo siguiente) {
        this.familia = familia;
        this.siguiente = siguiente;
    }

    public Nodo(RegistroDatos dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    //Getter and Setter
    public RegistroDatos getDato() {
        return dato;
    }

    public void setDato(RegistroDatos dato) {
        this.dato = dato;
    }

    public RegistroFamilia getFamilia() {
        return familia;
    }

    public void setFamilia(RegistroFamilia familia) {
        this.familia = familia;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
   
}
