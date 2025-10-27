public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();
        view.showMenu();
        
        int[ ] numeros = new int[] {1,2,3,4,4};
        while (true) {
            view.showMenu();
            int option = view.inputOption(4);

            view.showOrder();
            int orden = view.inputOption(2);
            boolean ordenOpt = orden == 1;
            view.showPasosMenu();
            int pasos = view.inputOption(2);
                  

            switch (option) {
                case 1:
                    System.out.println("Metodo Seleccion");
                    SortSelection sortSelection = new SortSelection();
                    sortSelection.sort(numeros, orden, pasos);
                    break;

                case 2:
                    System.out.println("Metodo Insercion");
                    SortInsertion sortInsertion = new SortInsertion();
                    sortInsertion.sort(numeros, orden, pasos);
                    break;
                case 3:
                    System.out.println("Metodo Burbuja");
                    break;
                case 4:
                    System.out.println("Adios");
                    System.exit(option);
                    break;
            
                default:
                    break;
            }
        }
      
    }
}
