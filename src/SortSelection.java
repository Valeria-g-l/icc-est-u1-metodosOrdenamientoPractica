public class SortSelection {

    public void sort(int[] arreglo, boolean ascendente, boolean pasos) {
        System.out.print("Arreglo original -> ");
        imprimirArreglo(arreglo);

        if (ascendente) {
            ordenarAscendente(arreglo, pasos);
        } else {
            ordenarDescendente(arreglo, pasos);
        }
    }

    private void ordenarAscendente(int[] arreglo, boolean pasos) {
        int contComparaciones = 0;
        int contCambios = 0;
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                contComparaciones++;
                if (arreglo[minIdx] > arreglo[j]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                contCambios++;
                if (pasos) {
                    System.out.println("Comparación " + contComparaciones + ": valor mínimo encontrado " + arreglo[minIdx] + " en posición " + minIdx);
                    System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[minIdx]);
                    int aux = arreglo[minIdx];
                    arreglo[minIdx] = arreglo[i];
                    arreglo[i] = aux;
                    System.out.print("Estado actual -> ");
                    imprimirArreglo(arreglo);
                } else {
                    int aux = arreglo[minIdx];
                    arreglo[minIdx] = arreglo[i];
                    arreglo[i] = aux;
                }
            }
        }

        System.out.println("-- FIN DEL MÉTODO --");
        System.out.print("Arreglo ordenado -> ");
        imprimirArreglo(arreglo);
        System.out.println("Comparaciones Totales -> " + contComparaciones);
        System.out.println("Cambios Totales -> " + contCambios);
    }

    private void ordenarDescendente(int[] arreglo, boolean pasos) {
        int contComparaciones = 0;
        int contCambios = 0;
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                contComparaciones++;
                if (arreglo[maxIdx] < arreglo[j]) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                contCambios++;
                if (pasos) {
                    System.out.println("Comparación " + contComparaciones + ": valor máximo encontrado " + arreglo[maxIdx] + " en posición " + maxIdx);
                    System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[maxIdx]);
                    int aux = arreglo[maxIdx];
                    arreglo[maxIdx] = arreglo[i];
                    arreglo[i] = aux;
                    System.out.print("Estado actual -> ");
                    imprimirArreglo(arreglo);
                } else {
                    int aux = arreglo[maxIdx];
                    arreglo[maxIdx] = arreglo[i];
                    arreglo[i] = aux;
                }
            }
        }

        System.out.println("-- FIN DEL MÉTODO --");
        System.out.print("Arreglo ordenado -> ");
        imprimirArreglo(arreglo);
        System.out.println("Comparaciones Totales -> " + contComparaciones);
        System.out.println("Cambios Totales -> " + contCambios);
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
