
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        JOptionPane.showInternalMessageDialog(null,"Hola Usuario");
        String name = JOptionPane.showInputDialog("Ingrese su nombre:");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario:"));

        JOptionPane.showInternalMessageDialog(null,"Su nombre es :" + name);
        JOptionPane.showInternalMessageDialog(null,"Su edad es de: " + age);
        JOptionPane.showInternalMessageDialog(null,"Su salario es de: " + salary);

        JOptionPane.showInternalMessageDialog(null,"Hola "+ name + "¿Cómo estás?");

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo numero: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("DIgire un tercer numero: "));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Digite un Cuarto numero: "));
        int sum = a+b+c+d;
        int prome = sum/4;

        JOptionPane.showMessageDialog(null, "La suma de los numeros es : "+ sum);
        JOptionPane.showMessageDialog(null, "El promedio de los numeros es : "+ prome);


    }
}
