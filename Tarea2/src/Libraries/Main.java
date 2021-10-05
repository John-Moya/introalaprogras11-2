package Libraries;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int experiencia = Integer.parseInt(JOptionPane.showInputDialog("Cuántos años tiene la compañía"));
        int horas_laborales = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuántas horas ha laborado?"));
        int pago_hora = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuánto es su pago por hora?"));
        int salario_bruto = horas_laborales * pago_hora;
        int adicional = 20 * salario_bruto / 100;

        int salario_final;
        if (experiencia >= 10 ){
            salario_final = salario_bruto + adicional;
            JOptionPane.showMessageDialog(null, "Su salario final es de: " +salario_final);
        }else if (salario_bruto > 1000){
             salario_final = salario_bruto * 10 / 100;
            JOptionPane.showMessageDialog(null, "Su salario final es de: " +salario_final);
        }else if (salario_bruto > 2000){
             salario_final = salario_bruto * 20 / 100;
            JOptionPane.showMessageDialog(null, "Su salario final es de: " +salario_final);
        }

    }
}
