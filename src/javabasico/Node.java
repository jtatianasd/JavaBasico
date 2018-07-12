/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

/**
 *
 * @author jtati
 */
public class Node {

        private Object valor;
    private Node siguiente;
    
    public Node(Object valor, Node siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }
    public Node()
    {
        
    }


    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }
}
