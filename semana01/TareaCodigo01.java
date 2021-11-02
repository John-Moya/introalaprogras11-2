package semana01;

import javax.swing.*;

public class TareaCodigo01 {
    public static void main(String[] args) {
        String nombreTrabajador = JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        float salarioSemanal = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su salario: "));
        float salarioDeducido = salarioSemanal * 0.934F;
        float deducciones = salarioSemanal - salarioDeducido;
        JOptionPane.showMessageDialog(null, "Estimado " + nombreTrabajador + ", el salario de este mes se le"
        + " desglosa de la siguiente manera: \nSalario bruto: " + salarioSemanal + "\nDeducciones: " + deducciones
        + "\nSalario neto: " + salarioDeducido);
    }
}