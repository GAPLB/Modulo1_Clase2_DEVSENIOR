package Modulo_1.Clase_2;

import java.util.Scanner;

public class RepasoClase {
    public static void main(String[] args) {
        String nombre;
        int edad;
        double estatura;

        Scanner entrada = new Scanner(System.in);

        System.out.println("El nombre de la estudiante es: ");
        
        nombre = entrada.nextLine();

        System.out.println(" La edad del estudiante es: ");
        edad = entrada.nextInt();

        System.out.println(" La estatura del estudiante es: ");
        estatura = entrada.nextDouble();


        System.out.println("El nombre de la estudiante es: "+nombre);

        System.out.println("La edad del estudiante es: "+edad);

        System.out.println("La estatura del estudiante: "+estatura);
    }
    
}
