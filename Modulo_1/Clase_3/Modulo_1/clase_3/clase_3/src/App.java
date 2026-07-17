import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("NOMBRE DEL CLIENTE: ");
        String nombre = sc.nextLine();

        System.out.println("Cuantas personas en la mesa?: ");
        int personas = sc.nextInt();

        System.out.println("mesa de:" + nombre + "," + "personas: "+ personas);


        //descuento aplicable? 
        double subtotal = 120000;
        boolean tieneCupon = true;

        boolean aplicaDescuento = subtotal > 100000 && tieneCupon;
        System.out.println("Aplica el descuento?: " + aplicaDescuento);

        int unidades = 5; 
        double comoDecimal = unidades;
        System.out.println("Implicita: " + comoDecimal);

        double precio = 19990.75;

        int precioRecortado = (int) precio;
        System.out.println("Casting: " + precioRecortado);

    }
}
