package Libraries;

import javax.swing.*;

public class Main {
    public static void main(String args[] ) {
        int elNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            if (EsPalindromo(ConvertirBinario(elNumero))){
                JOptionPane.showMessageDialog(null, "Es Palíndromo en su forma binaria");
            }else{
                JOptionPane.showMessageDialog(null, "No es Palíndromo en su forma binaria");
            }

    }

    public static String ConvertirBinario(int valor) {
        String resultado = "";
        int residuo;

        while (valor > 0){
            residuo = valor % 2;
            resultado = residuo + resultado;
            valor = (valor - residuo) / 2;
        }

        return resultado;
    }

    public static boolean EsPalindromo(String valor) {
        String resultado = "";
        for (int i = 0; i < valor.length(); i++ ){
            resultado = valor.substring(i, i+1) + resultado;

        }
        System.out.println(valor);
        System.out.println(resultado);
        return resultado.equals(valor);
    }
}
