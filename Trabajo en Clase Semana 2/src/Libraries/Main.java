package Libraries;

import javax.swing.*;

public class Main<edad> {

    public static void main(String[] args) {
	// write your code here

        //Trabajo 1

        int SAT = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese a su nota"));
        if (SAT >= 800) {
            JOptionPane.showMessageDialog(null, "Puede elegir Medicina, Informatica o Enfermeria");
        } else {
            JOptionPane.showMessageDialog(null, "Puede elegir un Tecnico");}

        //Trabajo 2

        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "La persona puede votar");
        } else{
            JOptionPane.showMessageDialog(null,"La persona no puede votar");

            //Trabajo 3

            int num;
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
            if (num == 1){
                JOptionPane.showMessageDialog(null,"La provincia es de San Jose");
            }else if (num==2){
                JOptionPane.showMessageDialog(null,"La provincia es Cartago");
            }else if (num== 3){
                JOptionPane.showMessageDialog(null, "La provincia es Heredia");
            }else if (num==4){
                JOptionPane.showMessageDialog(null,"La provincia es Alajuela");
            }else if (num==5){
                JOptionPane.showMessageDialog(null,"La provincia es Guanacaste");
            }else if (num==6){
                JOptionPane.showMessageDialog(null,"La provincia es Puntarenas");
            }else if (num==7)
                JOptionPane.showMessageDialog(null, "La provincia es Limon");


            //Trabajo 4

            int dia;
            dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero: 1.Lunes 2.Martes 3.Miercoles 4.Jueves 5.Viernes 6.Sabado 7.Domingo"));
            if (dia == 1) {
                JOptionPane.showMessageDialog(null, "El lunes es un dia laboral");
            }else if (dia == 2) {
                JOptionPane.showMessageDialog(null, "El Martes es un dia laborarl");
            }else if (dia == 3) {
                JOptionPane.showMessageDialog(null,"El Miercoles es un dia laboral");
            }else if (dia == 4) {
                JOptionPane.showMessageDialog(null,"El Jueves es un dia laboral");
            }else if (dia == 5) {
                JOptionPane.showMessageDialog(null,"El Viernes es un dia laboral");
            }else if (dia == 6) {
                JOptionPane.showMessageDialog(null,"El Sabado no es un dia laboral");
            }else if (dia == 7) {
                JOptionPane.showMessageDialog(null,"El Domingo no es un dia laboral");





            }
}
