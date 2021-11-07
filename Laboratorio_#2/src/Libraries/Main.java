package Libraries;
import javax.swing.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showInternalConfirmDialog;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int opc = Integer.parseInt(showInputDialog("Ingrese su opcion \n (1) Ejercicio con While \n (2) Ejercicio con Do While \n (3) Ejercicio con For \n (4) Salir"));
        do {
            if (opc == 1){
                JOptionPane.showMessageDialog(null,"Ejercicio con While");

                int par =0, impar = 0;
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a digitar"));
                int i = 1;
                while (i<=cantidad) {

                            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
                            System.out.println(numero);


                            if (numero % 2 == 0 ){
                                par++;

                            }else {
                                impar++;

                            }

                    i++;

                      }

                JOptionPane.showMessageDialog(null,"La lista de numeros pares es de :" + par);
                JOptionPane.showMessageDialog(null,"La lista de numeros impares  es de " + impar );
                break;

            } else if(opc == 2) {
                JOptionPane.showMessageDialog(null, "Ejercicio con Do while");
                int par =0, impar = 0;
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a digitar"));
                int i = 1;

                do { int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
                    System.out.println(numero);


                    if (numero % 2 == 0 ){
                        par++;

                    }else {
                        impar++;

                    }

                    i++;

                }while (i<=cantidad);


                JOptionPane.showMessageDialog(null,"La lista de numeros pares es de :" + par);
                JOptionPane.showMessageDialog(null,"La lista de numeros impares  es de " + impar );
                break;



            } else if (opc == 3){
                JOptionPane.showMessageDialog(null,"Ejercicio con For");
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a digitar"));
                int par = 0, impar = 0;

                for( int j = 1; j<=cantidad;j++){
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero : "));
                    System.out.println(numero);

                    if (numero % 2 == 0 ){
                        par++;


                    }else {
                        impar++;

                    }

                    }


                JOptionPane.showMessageDialog(null,"La lista de numeros pares es de :" + par);
                JOptionPane.showMessageDialog(null,"La lista de numeros impares  es de " + impar );

                break;
            }
        } while (opc != 4);

    }
}
