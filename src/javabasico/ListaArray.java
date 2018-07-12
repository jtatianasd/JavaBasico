/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author jtati
 */
public class ListaArray<T> {


    private T[] valores;
    private int longitud = 2;
    private int posicion;
    private final static int INCREMENTO = 2;
    //</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Propiedades">
    public int getLongitud() {
        return longitud;
    }
        public T[] getValores() {
        return valores;
    }

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    public void setValores(T[] valores) {
        this.valores = valores;
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public ListaArray() {
        this.valores = (T[])new Object[this.longitud];
        this.posicion = 0;
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Metodos">

    public void insertarNuevoElemento(T objeto) {

        if ((posicion) == (this.longitud / INCREMENTO)) {

            this.valores = Arrays.copyOf(valores, this.longitud * INCREMENTO);

            this.longitud = this.longitud * INCREMENTO;
        }
        this.valores[this.posicion] = objeto;

        this.posicion++;
    }

    public void mostrarElementos() {

        for (int i = 0; i < this.posicion; i++) {
            System.out.println("Elemento insertado: "+ this.valores[i].toString() + " ");
        }

    }
//</editor-fold>
}
