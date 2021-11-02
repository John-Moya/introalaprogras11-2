package semana02;

import java.util.*;

public class TareaCodigo02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese sus anhos de antiguedad en la organizacion: ");
        int anhosAntiguedad = Integer.parseInt(scan.next());
        System.out.println("Ingrese la cantidad de horas laboradas en la semana: ");
        int horasLaboradas = Integer.parseInt(scan.next());
        System.out.println("Ingrese el monto que se le paga por hora trabajada: ");
        int montoHora = Integer.parseInt(scan.next());
        float salarioSemanal = horasLaboradas * montoHora;
        float salarioMensualBruto = salarioSemanal * 4;
        if (anhosAntiguedad > 10) {
            float bono = salarioMensualBruto * 0.20F;
            salarioMensualBruto += bono;
            if (salarioMensualBruto > 1000) {
                float deduccion = salarioMensualBruto * 0.10F;
                salarioMensualBruto -= deduccion;
            } else  if (salarioMensualBruto > 2000) {
                float deduccion = salarioMensualBruto * 0.15F;
                salarioMensualBruto -= deduccion;
            }
        }
        float deduccionRegular = salarioMensualBruto * 0.934F;
        float salarioMensualNeto = salarioMensualBruto - deduccionRegular;
        System.out.println("Salario mensual neto: " + salarioMensualNeto);
    }
}
