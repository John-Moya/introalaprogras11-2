package Libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

       int ultimo_digito;

       ultimo_digito=Integer.parseInt(JOptionPane.showInputDialog("Ultimo digito"));

       if (ultimo_digito== 1 || ultimo_digito == 2) {
           JOptionPane.showMessageDialog(null, "No puede circular el Lunes");
       } else if (ultimo_digito == 3 || ultimo_digito == 4) {
           JOptionPane.showMessageDialog(null, "No puede circular el Martes");
       } else if (ultimo_digito == 5 || ultimo_digito == 6) {
           JOptionPane.showMessageDialog(null, "No puede circular el Miercoles");
    }    else if (ultimo_digito == 5 || ultimo_digito == 6) {
           JOptionPane.showMessageDialog(null, "No puede circular el Miercoles");
}
