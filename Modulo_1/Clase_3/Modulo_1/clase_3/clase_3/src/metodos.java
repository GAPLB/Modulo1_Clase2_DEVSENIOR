public class metodos {

    public static void main(String[] args) {
        double propina = calcularPropina(subtotal: 80000, porcentaje: 0.10);
        System.out.println("Propina: "+ propina);
    }

    static double calcularPropina(double subtotal, double porcentaje){
        return subtotal*porcentaje;
    }
}
