package Data;

import javax.swing.*;
import java.util.concurrent.CancellationException;

public class Main {

    public static void main(String[] args) {
	/*2.	Securitas S.A. Le ha contratado para que se desarrolle un programa donde
	 se pueda almacenar la información de los camiones de valores, estos tienen varias
	  características, como la placa, la marca, el modelo y el peso que puede llevar,
	   recuerde usar encapsulación, debe mostrar por lo menos un camión haciendo uso de JOptionPane */

        Camiones numero01 = new Camiones("Mercedes Benz", "Actros", "8,705 kg");

        //Mostrar la placa
        numero01.placa = "MNJ472";

        //get
        JOptionPane.showMessageDialog(null, " La marca del camión es : "+numero01.getMarca());
        JOptionPane.showMessageDialog(null, " El modelo del camión es : "+numero01.getModelo());
        JOptionPane.showMessageDialog(null, " El peso del camión es : "+numero01.getPeso());
        JOptionPane.showMessageDialog(null, "La placa del Camión es: "+ numero01.placa);
    }
}
