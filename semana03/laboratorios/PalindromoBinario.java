package semana03.laboratorios;

import java.util.*;

public class PalindromoBinario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int elNumero = Integer.parseInt(scan.next());
        if (esPalindromo(convertirBinario(elNumero))) {
            System.out.println("Es palindromo en su forma binaria.");
        } else { System.out.println("No es palindromo en su forma binaria."); }
    }

    private static String convertirBinario(int valor) {
        String resultado = "";
        int residuo;
        while (valor > 0) {
            residuo = valor % 2;
            resultado = residuo + resultado;
            valor = (valor - residuo) / 2;
        }
        return resultado;
    }

    private static boolean esPalindromo(String valor) {
        String resultado = "";
        for (int i = 0; i < valor.length(); i++) {
            resultado = valor.substring(i, i+1) + resultado;
        }
        System.out.println(valor);
        System.out.println(resultado);
        return resultado.equals(valor);
    }
}
