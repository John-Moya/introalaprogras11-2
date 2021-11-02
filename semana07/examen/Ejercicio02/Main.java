package semana07.examen.Ejercicio02;

import java.util.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Camion> camiones = new ArrayList<>();
        
        for (int i = 1; i < 4; i++) {
            System.out.println("Ingrese la placa del camion: " + i);
            String placaCamion = scan.next();
            System.out.println("Marca: ");
            String marca = scan.next();
            System.out.println("Modelo: ");
            String modelo = scan.next();
            System.out.println("Peso de carga: ");
            String pesoDeCarga = scan.next();
            Camion camion = new Camion(placaCamion);
            camion.setMarca(marca);
            camion.setModelo(modelo);
            camion.setPesoDeCarga(pesoDeCarga);
            camiones.add(camion);
        }
        
        for (int i = 0; i < camiones.size(); i++) {
            Camion infoCamion = camiones.get(i);
            JOptionPane.showMessageDialog(null, infoCamion);
            // ADVERTENCIA - se obtienen los pointers de la 
        }
    }
}
