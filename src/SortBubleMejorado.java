public class SortBubleMejorado {

    public int[] sort(int[] arreglo, boolean ascendente, boolean pasos) {
        System.out.print("Arreglo original -> ");
        imprimirArreglo(arreglo);

        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        int[] arregloCopia = arreglo.clone();

        for (int i = 0; i < n - 1; i++) {
            if (pasos) {
                System.out.println("Iteración " + (i + 1) + ":");
            }

            boolean intercambioRealizado = false;

            for (int j = 0; j < n - 1 - i; j++) {
                contComparaciones++;
                if (pasos) {
                    System.out.println("Comparación " + contComparaciones + ": valor mínimo encontrado " + arregloCopia[j] + " en posición " + arregloCopia[j + 1]);
                }

                if ((ascendente && arregloCopia[j] > arregloCopia[j + 1]) || (!ascendente && arregloCopia[j] < arregloCopia[j + 1])) {
                    contCambios++;
                    if (pasos) {
                        System.out.println("Intercambio: " + arregloCopia[j] + " <-> " + arregloCopia[j + 1]);
                    }

                    int aux = arregloCopia[j];
                    arregloCopia[j] = arregloCopia[j + 1];
                    arregloCopia[j + 1] = aux;
                    intercambioRealizado = true;

                    if (pasos) {
                        System.out.print("Estado actual -> ");
                        imprimirArreglo(arregloCopia);
                    }
                }
            }

            if (!intercambioRealizado)
            break;
        }

        System.arraycopy(arregloCopia, 0, arreglo, 0, n);

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
