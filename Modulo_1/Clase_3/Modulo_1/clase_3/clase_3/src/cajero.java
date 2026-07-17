//import java.util.Scanner;

import java.util.Scanner;

public class cajero {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        
        //System.out.println("Subtotal de la cuenta es:" );
        //double subtotal = sc.nextDouble();

        //if (subtotal >= 200000) {
            //System.out.println("Descuento VIP agregado");
    
        //}else if (subtotal > 100000) {
                //System.out.println("Descuento normal aplicado");
            //}else {
                //System.out.println("Sin descuento");
            //}

            Scanner sc = new Scanner(System.in);
            pedido pedido = new Pedido();
            int opcion;

            do {
                System.out.println("\n ---- CAJERO ----");
                System.out.println("1. Nuevo pedido");
                System.out.println("2. Cerrar Caja");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Subtotal: ");
                        double subtotal = sc.nextDouble();
                        double total = pedido.calcularTotal(subtotal, 0.10);
                        System.out.println("Total de propina: "+ total);
                        break;

                    case 2:
                        System.out.println("Caja cerrada");
                        break;    
                
                    default:
                        System.out.println("Opcion invalida");
                        break;
                }
            }while (opcion != 2);
    }
    static double calcularTotal(double subtotal, double porcentaje) {
        double propina = subtotal * porcentaje;
        return subtotal + propina;
    }        
            
    }



