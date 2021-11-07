package Data;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {


        //instancia es un clon de un objeto

       /* Automovil toyota = new  Automovil();
        toyota.motor = "2500";
        toyota.modelo = "lan cruiser";
        toyota.pasajeros = 7;
        toyota.puertas = 4;

        System.out.println(toyota.motor);
        System.out.println(toyota.modelo);
        toyota.encerder();
        toyota.apagar();

        boolean agua = toyota.tieneagua();

        if (agua){
            System.out.println("Tiene agua");

        }else{
            System.out.println("no Tiene agua");

        }
*/
    Medicamentos medi = new Medicamentos();
    medi.codigo=52969;
    medi.nombre="Paracetamol";
    medi.Fabricante="Opel";

    Clientes usuario = new Clientes();
    usuario.cedula= 54895;
    usuario.nombre= "kenneth";
    usuario.factura= 1;
    Boolean pedir = usuario.solicitar();

    Empleados empleados = new Empleados();
    empleados.cedula= 8999;
    empleados.nombre="ashe";
    empleados.area="cajas";
    empleados.horario= "Noche";
    boolean ser =empleados.servicio();


    Clientes.entrada();
    Empleados.Bienvenido();

    if(pedir && ser ){
        System.out.println("Atendiendo");
        System.out.println("Mi nombre es, " + empleados.nombre + " En que le puedo ayudar? ");
        System.out.println(medi.nombre);
        Medicamentos.entregar();
        System.out.println("Su numero de factur1es :" + usuario.factura);
        Clientes.salir();


    }else{
        System.out.println("Espere para ser atendido");
    }








    }
}
