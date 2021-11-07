package Libraries;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int elnumero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

     if (EsPalindromo(convertirBinario((elnumero)))) {
         JOptionPane.showMessageDialog(null,"Es palindromo en su forma binaria");
     }else{
         JOptionPane.showMessageDialog(null,"No es palindromo en su forma binaria");
        }
     if (EsPalindromo(convertirOctal((elnumero)))) {
         JOptionPane.showMessageDialog(null,"Es palindromo en su forma octal");
     }else{
         JOptionPane.showMessageDialog(null,"No es palindromo en su forma octal");

        }
     if (EsPalindromo(convertirHexa((elnumero)))) {
         JOptionPane.showMessageDialog(null,"Es palindromo en su forma Hexadecimal");
     }else{
         JOptionPane.showMessageDialog(null,"No es palindromo en su forma Hexadecimal");

        }

    }

    private static String convertirBinario(int valor){
        String resultado ="";
        int residuo;
        while (valor > 0 ) {
            residuo = valor % 2;
            resultado = residuo + resultado;
            valor = (valor-residuo) / 2;
        }

        return resultado;

    }

    private static String convertirOctal(int valor){
        String resultado ="";
        int residuo;
        while (valor > 0 ) {
            residuo = valor % 8;
            resultado = residuo + resultado;
            valor = (valor-residuo) / 8;
        }
        return resultado;

    }

    private static String convertirHexa(int valor){
        String resultado ="";
        int residuo;
        char[] hexa = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','F'};
        while (valor > 0 ) {
            residuo = valor % 16;
            resultado = hexa[residuo] + resultado;
            valor = (valor-residuo) / 16;
        }


        return resultado;

    }


    private static boolean EsPalindromo(String valor ){
        String resultado="";
        for (int i = 0; i < valor.length(); i++) {
            resultado = valor.substring(i,i+1) + resultado;



        }
        System.out.println(valor);
        System.out.println(resultado);

        return resultado.equals(valor);

    }

}
