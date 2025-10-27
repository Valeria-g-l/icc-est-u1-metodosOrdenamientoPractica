import java.util.Scanner;

public class View {
    private final Scanner scanner;

    public View() {
        System.out.println("Métodos de Ordenamiento");
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("\n-- Menú de Métodos --");
        System.out.println("1 -> Selección");
        System.out.println("2 -> Inserción");
        System.out.println("3 -> Burbuja Mejorado");
        System.out.println("4 -> Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void showOrder() {
        System.out.println("\n-- Orden --");
        System.out.println("1 -> Ascendente");
        System.out.println("2 -> Descendente");
        System.out.print("Seleccione una opción: ");
    }

    public void showPasosMenu() {
        System.out.println("\n-- ¿Desea ver los pasos? --");
        System.out.println("1 -> Sí");
        System.out.println("2 -> No");
        System.out.print("Seleccione una opción: ");
    }

    public int inputOption(int max) {
        int option = -1;
        while (true) {
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                if (option >= 1 && option <= max)
                    break;
            } else {
                scanner.next(); 
            }
            System.out.print("Opción inválida, intente de nuevo: ");
        }
        return option;
    }

    public boolean inputBoolean(String mensaje) {
        System.out.print(mensaje);
        while (true) {
            if (scanner.hasNextBoolean()) {
                return scanner.nextBoolean();
            } else {
                scanner.next(); 
                System.out.print("Entrada inválida. Ingresar true o false: ");
            }
        }
    }

public boolean inputOrdenAD(String mensaje) {
    System.out.print(mensaje);
    while (true) {
        String input = scanner.next().trim().toUpperCase();
        if (input.equals("A")) return true;
        if (input.equals("D")) return false;
        System.out.print("Entrada inválida. Ingresar A o D: ");
    }
}

}
