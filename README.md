# introalaprogras11-2

# Kenneth Alvarado Martinez 

## Semana 1 

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

    String name = JOptionPane.showInputDialog("Ingrese su nombre:");
    double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario:"));
    double neto = salario * 0.0934 ;
    JOptionPane.showInternalMessageDialog(null, "Estimado Trabajador " + name + ", El salario de este mes se desglosa de la siguiente manera: ");
    JOptionPane.showInternalMessageDialog(null, "Salario bruto: " + salario );
    JOptionPane.showInternalMessageDialog(null, "Deducciones: 9.34% ");
    JOptionPane.showInternalMessageDialog(null,"Salario neto "+ neto);

    }
}
