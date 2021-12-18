package Libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        public static void main(String[] args){

            Automovil toyota = new Automovil("2500", "1995", "4", 4);

            //gett muestra
            System.out.println(toyota.getMotor());

            //set modifica
            toyota.setMotor("1800");
            System.out.println(toyota.getMotor());

            for  (int i = 0; i < 3; i++  ){
                System.out.println(toyota.getMotor());
                toyota.setMotor("1900");
            }

            //RTV
            Boolean aprobado =  toyota.revision.getAprobado();
            if (aprobado){
                System.out.println("Aprobó RTV");
            }else{
                System.out.println("No aprobó RTV");
            }

            //CON VARIABLE
            String mes = JOptionPane.showInputDialog("Ingrese el mes de la revisión");
            toyota.revision.setMes("mes");
            System.out.println(toyota.revision.getMes());

            //Con variable Estática
            toyota.placa = "xmr256";
            System.out.println(toyota.placa);


            // animales perro = new animales("Pomerania", "Dog Chow", "6 meses");
            //
            // //Get
            // System.out.println(perro.getRaza());
            //
            // //set
            // perro.setEdad("10 meses");
            // System.out.println(perro.getEdad());



    }
}
