package Libraries;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
    int año;
    int horas;
    double precio;
    double bono;
    double salario;
    double dedu;

    año = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los años laborados en la empresa"));
    horas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de horas laboradas"));
    precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio por hora en dolares"));
    salario= horas * precio;


    if (año>10) {
        bono = salario * 0.20;
        salario = salario + bono;
    }
    if ((salario>1000) && (salario<=2000)){
        dedu= salario * 0.10;
        salario = salario - dedu;
        }

    else if (salario > 2000){
            dedu = salario * 0.15;
            salario = salario - dedu;

        }

    JOptionPane.showMessageDialog(null, "Su Salario neto es de: " + salario);


            }

    }

