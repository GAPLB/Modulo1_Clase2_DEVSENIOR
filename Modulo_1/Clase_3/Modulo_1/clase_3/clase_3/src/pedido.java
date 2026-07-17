public class pedido {
    double calcularTotal(double subtotal, double porcentaje) {
        double propina = subtotal * porcentaje;
        return subtotal + propina;
    }

}
