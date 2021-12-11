package Libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        String nombre = JOptionPane.showInputDialog(null,"Cual es su nombre");
        int salario_semanal = Integer.parseInt(JOptionPane.showInputDialog("Cual es su salario mensual"));
        int salario_bruto = salario_semanal *4;
        double Deducciones = (9.34 *salario_bruto /100);
        double salario_neto = salario_bruto -Deducciones;

        JOptionPane.showMessageDialog(null, "Hola"+ nombre +"Su salario bruto es"+ salario_bruto +"Sus deducciones son"+ Deducciones +"Su salario neto es"+ salario_neto);

    }
}
