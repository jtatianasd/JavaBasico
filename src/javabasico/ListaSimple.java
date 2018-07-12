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
public class ListaSimple {

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    protected Node root;
    private Node nodo_Actual;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Propiedades">
    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getNodo_Actual() {
        return nodo_Actual;
    }

    public void setNodo_Actual(Node nodo_Actual) {
        this.nodo_Actual = nodo_Actual;
    }
    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Constructor">

    public ListaSimple() {
        this.nodo_Actual = null;
        this.root = null;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    public void insertar(Object dato) {
        Node temporal = new Node(dato, null);
        temporal.setSiguiente(nodo_Actual);
        nodo_Actual = temporal;
    }

    public void imprimir(int n) {

        if (!Vacio()) {
            Node temporal = nodo_Actual;

            for (int i = 0; i < n; i++) {
                temporal = temporal.getSiguiente();
                if (temporal == null) {
                    return;
                }
            }
            System.out.print(temporal.getValor() + " "+"\n");
        } else {
            root = nodo_Actual;
        }
    }

    public boolean Vacio() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }
    //</editor-fold>
}
