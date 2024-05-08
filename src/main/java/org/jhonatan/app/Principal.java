package org.jhonatan.app;

import org.jhonatan.app.MetodosOrdenamiento.MergetSort;
import org.jhonatan.app.MetodosOrdenamiento.QuickShort;

/**
 *
 * @author Jhonatan
 */
public class Principal {

    private static final int arregloEnteros[] = {5, 7, 3, 10, 1, -45, 2, 4, 9, 0, 5, 6, 7, 8};

    public static void main(String[] args) {
        //  ordenandoArregloQuickShort();
        ordenandoArregloMergetSort();
    }

    private static void ordenandoArregloMergetSort() {
        System.out.println("\nArreglo Original: ");
        mostrarArreglo(arregloEnteros);
        System.out.println("\nArreglo ordenado por el metodo MergetSort");
        MergetSort.mergetShortNumeros(arregloEnteros);
        mostrarArreglo(arregloEnteros);
    }

    private static void ordenandoArregloQuickShort() {
        System.out.println("\nArreglo Original");
        mostrarArreglo(arregloEnteros);
        System.out.println("\nArreglo ordenado por el metodo QuickShort: ");
        QuickShort.quickShortNumeros(arregloEnteros);
        mostrarArreglo(arregloEnteros);
    }

    private static void mostrarArreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]  ");
        }
    }

}
