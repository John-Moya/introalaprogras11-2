package Libraries;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {





        boolean menu = true;
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("MENÚ" + "\n" + "1. Ejercicio con WHILE" + "\n" + "2. Ejercicio con DO WHILE" + "\n" + "3. Ejercicio con FOR" + "\n" + "4. SALIR"));
        while (menu){
            if (opcion == 1){

                int cuenta_par = 0, cuenta_impar = 0;


                int num = Integer.parseInt(JOptionPane.showInputDialog("Recuerde que la Lista de valores es de 10 números" + "\n" + " Favor ingrese el número 1: "));
                while (num <= 10) {

                    if(num%2==0){
                        cuenta_par = cuenta_par + 1;
                        System.out.println("El siguiente número es par: "+num);

                    }else {
                        cuenta_impar= cuenta_impar+1;
                        System.out.println("El siguiente número es impar: "+num);
                    }


                    num++;

                }System.out.println("Hay un total de: " + cuenta_par+ " números pares");
                System.out.println("Hay un total de: " +cuenta_impar+ " números impares");



                menu = false;
            }else if (opcion == 2){
                int cuenta_par = 0, cuenta_impar = 0;
                int num = Integer.parseInt(JOptionPane.showInputDialog("Recuerde que la Lista de valores es de 10 números" + "\n" + " Favor ingrese el número 1: "));
                do{

                    if(num%2==0){
                        cuenta_par = cuenta_par + 1;
                        System.out.println("El siguiente número es par: "+num);

                    }else {
                        cuenta_impar= cuenta_impar+1;
                        System.out.println("El siguiente número es impar: "+num);
                    }

                    num++;

                }while (num <= 10);
                System.out.println("Hay un total de: " + cuenta_par+ " números pares");
                System.out.println("Hay un total de: " +cuenta_impar+ " números impares");

                menu = false;




            } else if (opcion == 3){
                int cuenta_par = 0, cuenta_impar = 0;
                for (int i = 0; i < 10; i++ ){
                    int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor: "));

                    if(num%2==0){
                        cuenta_par = cuenta_par + 1;
                        System.out.println("El siguiente número es par: "+num);

                    }else {
                        cuenta_impar= cuenta_impar+1;
                        System.out.println("El siguiente número es impar: "+num);
                    }


                }System.out.println("Hay un total de: " + cuenta_par+ " números pares");
                System.out.println("Hay un total de: " +cuenta_impar+ " números impares");


                menu = false;
            }else if(opcion == 4){
                System.exit(0);

            }
        }
    }
}
