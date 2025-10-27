public class SortInsertion {

    public int[] sort(int[] arreglo, boolean ascendente, boolean pasos) {
        System.out.print("Arreglo original -> ");
        imprimirArreglo(arreglo);

        int contComparaciones = 0;
        int contCambios = 0;
        int n = arreglo.length;

        for (int i = 1; i < n; i++) {
            int aux = arreglo[i];
            int j = i - 1;

            if (pasos) {
                contComparaciones ++;
                System.out.println("Comparación " + contComparaciones + ": aux = " + aux);
            }

            while (j >= 0 && (ascendente ? aux < arreglo[j] : aux > arreglo[j])) {
                contComparaciones++;
                if (pasos) {
                    System.out.println("Compara aux: " + aux + " con arreglo[" + j + "]: " + arreglo[j]);
                    System.out.println("Intercambio: " + arreglo[j + 1] + " <-> " + arreglo[j]);
                }

                arreglo[j + 1] = arreglo[j];
                contCambios++;
                j--;

                if (pasos) {
                    System.out.print("Estado actual -> ");
                    imprimirArreglo(arreglo);
                }
            }

            arreglo[j + 1] = aux;

            if (pasos) {
                System.out.println("Inserta aux en posición " + (j + 1));
                System.out.print("Estado actual -> ");
                imprimirArreglo(arreglo);
            }
        }

        System.out.println("-- FIN DEL MÉTODO --");
        System.out.print("Arreglo ordenado -> ");
        imprimirArreglo(arreglo);
        System.out.println("Comparaciones Totales -> " + contComparaciones);
        System.out.println("Cambios Totales -> " + contCambios);

        return new int[]{contComparaciones, contCambios};
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
