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
public class Main {

    ListaSimple objListaSimple = new ListaSimple();
    ListaArray objListaArray = new ListaArray();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main objMain = new Main();
        objMain.insertarListaSimple();
        objMain.imprimirListaSimple();
        System.out.println("----------- Array ----------");

        objMain.insertarListaArray();
        objMain.imprimirListaArray();
        objMain.imprimirLongitudArray();

    }

    public void insertarListaSimple() {
        for (int i = 1; i <= 10; i++) {
            objListaSimple.insertar(Integer.toString(i));
        }
    }

    public void imprimirListaSimple() {
        for (int i = 0; i <= 10; i++) {
            objListaSimple.imprimir(i);
        }
    }

    public void insertarListaArray() {
        for (int i = 1; i <= 10; i++) {
            objListaArray.insertarNuevoElemento(Integer.toString(i));
             System.out.println("Tamaño :" + objListaArray.getLongitud() + " En la posicion: "+ i);
        }
    }
    public void imprimirListaArray()
    {
        objListaArray.mostrarElementos();
    }

    public void imprimirLongitudArray() {
        System.out.println("\n"+ "Tamaño :" + objListaArray.getLongitud());
    }
}
