public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();
        view.showMenu();
        view.inputOption(4);

        while (true) {
            view.showMenu();
            int option = view.inputOption(4);

            switch (option) {
                case 1:
                    System.out.println("Metodo Seleccion");
                    break;

                case 2:
                    System.out.println("Metodo Insercion");
                    break;
                case 3:
                    System.out.println("Metodo Burbuja");
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
            
                default:
                    break;
            }
        }
      
    }
}
