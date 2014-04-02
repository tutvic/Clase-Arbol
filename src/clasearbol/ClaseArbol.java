/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clasearbol;

/**
 *
 * @author Victor
 */
public class ClaseArbol {

 private NodoArbol raiz;

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public ClaseArbol() {
        raiz = null;
    }

    public ClaseArbol(NodoArbol raizArbol) {
        raiz = raizArbol;
    }

    public void insertar(char letra, Integer d) {
        NodoArbol nuevo = new NodoArbol(letra, d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol aux = raiz;
            NodoArbol ant = null;
            while (aux != null) {
                ant = aux;
                if (d <= aux.getDato()) {
                    aux = aux.getIzq();
                } else {
                    aux.getDer();
                }
            }
            if (d <= ant.getDato()) {
                ant.setIzq(nuevo);
            } else {
                ant.setDer(nuevo);
            }
        }
    }

    public String toString() {
        return raiz.toString();
    }

    public void enOrder(NodoArbol r) {
        if (r != null) {
            enOrder(r.getIzq());
            System.out.println(r.toString());
            enOrder(r.getDer());
        }
    }
}
