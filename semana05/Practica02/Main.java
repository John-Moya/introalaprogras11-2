package semana05.Practica02;

import java.util.*;

public class Main {
    Scanner scan = new Scanner(System.in);
    Casa casa;
    Vendedor[] vendedores;
    
    public static void main(String[] args) {
        
    }
    
    public void agregarVendedores() {
        for (int i = 0; i < vendedores.length; i++) {
            vendedores[i] = new Vendedor();
        }
        // asignar info a los vendedores
        for (int i = 0; i < vendedores.length; i++) {
            System.out.println("Ingrese el nombre del vendedor: ");
            String nombre = scan.next();
            System.out.println("Ingrese el tipo de licencia que el vendedor posee: ");
            String licencia = scan.next();
            //double casasVendidas = Math.random() * 15;
            //int cv = (int)casasVendidas; // cv = casas vendidas int
            vendedores[i].setNombre(nombre);
            vendedores[i].setLicenciaDeBR(licencia);
            //vendedores[i].setCasasVendidas(cv);
        }
    }
}
