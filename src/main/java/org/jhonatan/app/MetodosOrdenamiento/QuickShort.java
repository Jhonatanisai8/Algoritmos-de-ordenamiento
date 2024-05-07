package org.jhonatan.app.MetodosOrdenamiento;

/**
 *
 * @author Jhonatan
 */
public class QuickShort {
    
    private static void quickShortNumeros(int arreglo[], int primero, int ultimo) {
        int i, j, pivote, auxiliar, central;
        i = primero;
        j = ultimo;
        central = (primero + ultimo) / 2;
        pivote = arreglo[central];
        
        do {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }

            //aqui hacemos el intercambio
            if (i <= j) {
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
                i++;
                j--;
            }
        } while (i <= j);
        
        if (primero < j) {
            quickShortNumeros(arreglo, primero, j);
        }
        if (i < ultimo) {
            quickShortNumeros(arreglo, i, ultimo);
        }
    }
    
    public static void quickShortNumeros(int arreglo[]) {
        quickShortNumeros(arreglo, 0, arreglo.length - 1);
    }
}
