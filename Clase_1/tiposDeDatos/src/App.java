
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        //declarar variables
        int edad; 
        double salario;
        float promedio;
        char sexo;
        boolean estado;
        String nombres;

        //entrada de datos por ventana emergente
        nombres = JOptionPane.showInputDialog("digite el nombre del estudiente: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("digite la edad del estudiante: "));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario del estudiante: "));
        promedio = Float.parseFloat(JOptionPane.showInputDialog("Digite el promedio del estudiante: "));
        sexo = JOptionPane.showInputDialog("digite el sexo del estudiante: ").charAt(0);
        estado = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite el estado del estudiante: "));







        //salida de datos por ventana emergente
        JOptionPane.showMessageDialog(null, "nombre: "+nombres);
        JOptionPane.showMessageDialog(null, "estado: "+estado);
        JOptionPane.showMessageDialog(null, "sexo: "+sexo);
        JOptionPane.showMessageDialog(null, "promedio: "+promedio);
        JOptionPane.showMessageDialog(null, "Salario:  "+salario);
        JOptionPane.showMessageDialog(null, "edad: "+edad);









    }
}
