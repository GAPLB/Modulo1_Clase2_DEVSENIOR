import java.util.Scanner;

public class operaciones {

    static String nombre = "";
    static int cantidad = 0;
    static double precio = 0.0;
    static boolean hayProducto = false;


    public static void registrar(Scanner sc) {
        nombre = validador.leerTexto(sc, "Nombre del producto: ");
        cantidad = validador.leerEntero(sc, "Cantidad: ");
        precio = validador.leerDecimal(sc, "Precio unitario: ");
        hayProducto = true;
        System.out.println("Producto registrado correctamente.");
    }

        public static void ver() {
        if (!hayProducto) {
            System.out.println("Aun no hay ningun producto registrado.");
            return;
        }
        System.out.println("Producto: " + nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio:   " + precio);
    }

        public static void actualizarCantidad(Scanner sc) {
        if (!hayProducto) {
            System.out.println("Aun no hay ningun producto registrado.");
            return;
        }
        cantidad = validador.leerEntero(sc, "Nueva cantidad: ");
        System.out.println("Cantidad actualizada.");
    }

    public static void verValorTotal() {
        if (!hayProducto) {
            System.out.println("Aun no hay ningun producto registrado.");
            return;
        }
        double total = cantidad * precio;
        System.out.println("Valor total en inventario: " + total);
    }
}


