# introalaprogras11-2

# Kenneth Alvarado Martinez 

## Semana 2

package Libraries;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {

        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        if (nota >= 80) {
            JOptionPane.showMessageDialog(null, "El estudiante Aprovo");
        } else {
            JOptionPane.showMessageDialog(null, "El estudiante Reprobo");
        }

        //sat
        int sat;
        int carrera;
        sat = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese sus puntos"));
        if (sat >= 800) {
            carrera = Integer.parseInt(JOptionPane.showInputDialog(null, "Puede elegir Medicina(1),Informatica(2),Enfermeria(3)"));
            if (carrera == 1) {
                JOptionPane.showMessageDialog(null, "Eligio Medicina");
            } else if (carrera == 2) {
                JOptionPane.showMessageDialog(null, "Eligio Informatica");
            } else if (carrera == 3) {
                JOptionPane.showMessageDialog(null, "Eligio Enfermeria");

            } else {
                JOptionPane.showMessageDialog(null, "Solo tiene absceso a carreras tecnicas");
            }
        }

        int fsd;
        fsd = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un su edad"));
        if (fsd >= 18) {
            JOptionPane.showMessageDialog(null, "El usuario puede votar");
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no puede votar ");

        }

// las || es un or
// && son and
// ! negacion
        int provincia;
        provincia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de provincia"));
        if (provincia == 1) {
            JOptionPane.showMessageDialog(null, "Usted es de Cartago");
        } else if (provincia == 2) {
            JOptionPane.showMessageDialog(null, "Usted es de San jose");
        } else if (provincia == 3) {
            JOptionPane.showMessageDialog(null, "Usted es de Limon");
        } else if (provincia == 4) {
            JOptionPane.showMessageDialog(null, "Usted es de Heredia");
        } else if (provincia == 5) {
            JOptionPane.showMessageDialog(null, "Usted es de Puntarenas");
        } else if (provincia == 6) {
            JOptionPane.showMessageDialog(null, "Usted es de guanacaste");
        } else if (provincia == 7) {
            JOptionPane.showMessageDialog(null, "Usted es de Alajuela");
        }

        int dia;
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite un dia de la semana: \n1- Domingo. \n2- Lunes. \n3- Martes. \n4- Miercoles." +
                "\n5- Jueves. \n6- Viernes. \n7- Sabado."));
        if ( dia == 1) {
            JOptionPane.showMessageDialog(null, "El dia es Domingo, Ese dia es libre");
        } else if (dia == 2) {
            JOptionPane.showMessageDialog(null, "El dia es lunes, Ese dia es laboral");
        } else if (dia == 3) {
            JOptionPane.showMessageDialog(null, "El dia es Martes, Ese dia es laboral");
        } else if (dia == 4) {
            JOptionPane.showMessageDialog(null, "El dia es Miercoles, Ese dia es laboral");
        } else if (dia == 5) {
            JOptionPane.showMessageDialog(null, "El dia es Jueves, Ese dia es laboral");
        } else if (dia == 6) {
            JOptionPane.showMessageDialog(null, "El dia es Viernes, Ese dia es laboral");
        } else if (dia == 7) {
            JOptionPane.showMessageDialog(null, "El dia es Sabado, Ese dia es libre");
        }

        switch (casa) {
            case 0:
                System.out.println("La casa 0");
                break;
            case 1:
                System.out.println("La casa 1");
                break;
            default:
                System.out.println("Por defecto");
        }

        
    }
}
