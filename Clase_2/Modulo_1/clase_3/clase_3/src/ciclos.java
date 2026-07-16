import java.util.Scanner;

public class ciclos {

    public static void main(String[] args) {
        //uso del "for"
        //for (int i = 1; i <= 5; i++){
        //System.out.println("Plato #" + i + "impresion de recivo");
        //}



        //uno del "while"
        //int mesasPorLimpiar = 3;
        //while (mesasPorLimpiar>0) {
        //    System.out.println("Faltan " + mesasPorLimpiar + "mesas");
        //    mesasPorLimpiar--;
            
        //}
        //System.out.println("todo limpio!");

        //uno del do while
        Scanner sc = new Scanner(System.in);

    int opcion; 
    do {
        System.out.println("1. Continuar   2. Salir");
        System.out.println("Elige: ");
        opcion = sc.nextInt();

    }while (opcion != 2);

    System.out.println("Saliste del menu");

    }
    }

