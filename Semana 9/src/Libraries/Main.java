package Libraries;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Extras[] lasExtras = new Extras[2];
        Casa[] lasCasas = new Casa[2];
        for (int i = 0; i < lasExtras.length; i++) {
            lasExtras[i] = new Extras("");
            lasExtras[i].setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre de la extra"));
        }
        for (int i=0; i< lasCasas.length; i++){
            lasCasas[i] = new Casa();
            lasCasas[i].setMetros(JOptionPane.showInputDialog(null, "Ingrese los metros"));
            lasCasas[i].setPrecio(JOptionPane.showInputDialog(null, "Ingrese el precio"));
            lasCasas[i].setHabitaciones(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese las habitaciones")));
            lasCasas[i].setLasExtras(lasExtras);
        }
        for (int i = 0;i< lasCasas.length; i++){
            JOptionPane.showMessageDialog(null,lasCasas[i].getHabitaciones() + " " + lasCasas[i].getMetros() + " " + lasCasas[i].getPrecio());
            JOptionPane.showMessageDialog(null, lasCasas[i].getLasExtras());
    }
}
