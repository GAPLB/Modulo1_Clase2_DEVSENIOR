import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            menu.mostrar();
            opcion = menu.leerOpcion(sc);

            switch (opcion) {
                case 1:
                    operaciones.registrar(sc);
                    break;
                case 2:
                    operaciones.ver();
                    break;
                case 3:
                    operaciones.actualizarCantidad(sc);
                    break;
                case 4:
                    operaciones.verValorTotal();
                    break;
                case 5:
                    System.out.println("Gracias por usar el gestor. Hasta pronto.");
                    break;
                default:
                    System.out.println("Opcion no valida. Elige entre 1 y 5.");
            }
        }
        sc.close();
    }
}