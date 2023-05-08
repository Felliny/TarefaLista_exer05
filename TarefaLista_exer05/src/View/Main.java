package View;

import Controller.ListaMaior;
import model.Lista;

public class Main {
    public static void main(String[] args) {
        Lista listaL= new Lista();

        listaL.addFirst(16);
        listaL.addFirst(7);
        listaL.addFirst(3);
        listaL.addFirst(2);
        listaL.addFirst(6);
        listaL.addFirst(7);
        listaL.addFirst(9);
        listaL.addFirst(12);
        listaL.addFirst(8);
        listaL.addFirst(5);
        listaL.addFirst(3);

        ListaMaior listaMaior= new ListaMaior();

        listaMaior.checarMaiores(listaL);

    }
}
