/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author jtati
 */
public class ListaArray<T>  implements Iterable<T>{

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

        this.valores = (T[]) new Object[longitud];
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

        /* for (int i = 0; i < this.posicion; i++) {
            System.out.println("Elemento insertado: "+ this.valores[i].toString() + " ");
        }*/
    
    
    }
//</editor-fold>
    
    class ArrayIterator implements Iterator<T> {
        int current = 0;  // the current element we are looking at

   
        public boolean hasNext() {
            if (current < ListaArray.this.valores.length) {
                return true;
            } else {
                return false;
            }
        }

        // return the next element of the iteration and move the current
        // index to the element after that.
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return valores[current++];
        }
    }
    public T get(int index) {
        return valores[index];
    }

    // Set the value at a given index
    public void set(int index, T value) {
        valores[index] = value;
    }

    // Return the length of the array
    public int length() {
        return valores.length;
    }

    // Return an iterator over the elements in the array. This is generally not
    // called directly, but is called by Java when used in a "simple" for loop.
    public Iterator<T> iterator() {
        return new ArrayIterator();
    }
}

