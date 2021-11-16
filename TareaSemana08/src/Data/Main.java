package Data;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Excelente uso de los arrays
        int cantidadAutomovil = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Automoviles: "));
        Automovil[] automoviles = new Automovil[cantidadAutomovil];

        for (int i = 0; i < automoviles.length; i++){
            // Tiene Sentido Pero no se para que se usa
            // Falto darle espacio en la memoria (Inicializar)
            automoviles[i] = new Automovil();
            JOptionPane.showMessageDialog(null, "Automovil " + i);
            // Lo que se arreglo aqui es que igualaba variables y no las asignaba al objeto
            automoviles[i].setPlaca(JOptionPane.showInputDialog("Ingese la placa del automovil: "));
            automoviles[i].setModelo(JOptionPane.showInputDialog("Ingese el modelo del automovil: "));
            automoviles[i].setCapacidadPasajeros(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Pasajeros")));
        }

        for (int i = 0; i < automoviles.length; i++) {
            // Solo imprima los atributos
            JOptionPane.showMessageDialog(null, "Automovil: " + i + " La placa es: " + automoviles[i].getPlaca() +  " El modelo es: " + automoviles[i].getModelo() +  " La cantidad de pasajeros es de: " + automoviles[i].getCapacidadPasajeros());
        }
    }
}
