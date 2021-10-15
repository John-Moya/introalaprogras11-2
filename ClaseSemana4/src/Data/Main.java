package Data;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
	// write your code here

        // Instancia Clon de un Objeto

        Automovil toyota = new Automovil();
        toyota.motor = "2500";
        toyota.modelo = "Land Cruiser";
        toyota.puertas = 4;
        toyota.pasajeros = 7;
        System.out.println(toyota.motor);
        System.out.println(toyota.modelo);
        toyota.encender();
        toyota.apagar();
        boolean agua = toyota.tieneAgua();
        if (agua){
            System.out.println("Tiene agua");
        } else {
            System.out.println("No tiene agua");
        }

    }
}
