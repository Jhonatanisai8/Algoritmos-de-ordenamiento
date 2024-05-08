package org.jhonatan.app.MetodosOrdenamiento;

/**
 *
 * @author Jhonatan
 */
public class MergetSort {

    public static void mergetShortNumeros(int numeros[]) {
        numeros = mergetSortNumeros(numeros, 0, numeros.length - 1);
    }

    public static int[] mergetSortNumeros(int arreglo[], int izq, int dere) {
        int mitad;
        if (izq < dere) {
            mitad = (dere + izq) / 2;
            mergetSortNumeros(arreglo, izq, mitad);
            mergetSortNumeros(arreglo, mitad + 1, dere);
            mergetSort(arreglo, izq, mitad, dere);
        }
        return arreglo;
    }

    private static void mergetSort(int arreglo[], int izquierdo, int mitad, int derecha) {
        int auxiliar[] = new int[arreglo.length];
        int i, j, k;
        for (i = izquierdo; i <= derecha; i++) {
            auxiliar[i] = arreglo[i];
        }
        i = izquierdo;
        j = mitad + 1;
        k = izquierdo;
        while (i <= mitad && j <= derecha) {
            if (auxiliar[i] <= auxiliar[j]) {
                arreglo[k++] = auxiliar[i++];
            } else {
                arreglo[k++] = auxiliar[j++];
            }
        }
        while (i <= mitad) {
            arreglo[k++] = auxiliar[i++];
        }
    }
}
