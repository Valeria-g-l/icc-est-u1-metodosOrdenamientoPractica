public class App {
    public static void main(String[] args) {
        View view = new View();
        int[] original = {19, 24, -19, -28, 5, 30, -12, 34, -9, 52, 0, 45};

        while (true) {
            view.showMenu();
            int option = view.inputOption(4);

            if (option == 4) {
                System.out.println("Adiós");
                break;
            }

            boolean mostrarPasos = view.inputBoolean("¿Desea ver los pasos? (true/false): ");
            boolean ascendente = view.inputOrdenAD("¿Desea ordenar ascendentemente (A) o descendentemente (D)?: ");


            int[] arreglo = original.clone();

            switch (option) {
                case 1:
                    System.out.println("Método Selección");
                    SortSelection sortSelection = new SortSelection();
                    sortSelection.sort(arreglo, ascendente, mostrarPasos);
                    break;

                case 2:
                    System.out.println("Método Inserción");
                    SortInsertion sortInsertion = new SortInsertion();
                    int[] resultadosInsercion = sortInsertion.sort(arreglo, ascendente, mostrarPasos);
                    System.out.println("Comparaciones: " + resultadosInsercion[0] + " Cambios: " + resultadosInsercion[1]);
                    break;

                case 3:
                    System.out.println("Método Burbuja Mejorado");
                    SortBubleMejorado sortBuble = new SortBubleMejorado();
                    int[] resultadosBurbuja = sortBuble.sort(arreglo, ascendente, mostrarPasos);
                    System.out.println("Comparaciones: " + resultadosBurbuja[0] + " Cambios: " + resultadosBurbuja[1]);
                    break;
            }

            System.out.print("Arreglo ordenado: ");
            for (int num : arreglo) {
                System.out.print(num + " ");
            }
            System.out.println("\n");
        }
    }
}
