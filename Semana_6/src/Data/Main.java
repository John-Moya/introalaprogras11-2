package Data;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Automovil toyota = new Automovil("2500","1929","4" );
        System.out.println(toyota.getMotor());
        toyota.setMotor("1800");
        System.out.println(toyota.getMotor());
        toyota.revision.getAprobado();
        System.out.println(toyota.revision.getAprobado());

        Micasa micasa = new Micasa("3","5","4");
        System.out.println(micasa.puertas);
        System.out.println(micasa.ventanas);
        System.out.println(micasa.cuartos);
        micasa.setPuertas("2");
        System.out.println(micasa.puertas);

        Restaurante local = new Restaurante(true,"Si","85000");
        boolean servi = local.getServicio();
        if (servi){

            System.out.println("Atendiendo");
        }

        System.out.println("Datos del cliente");
        System.out.println(local.ingreso.getId());
        System.out.println(local.ingreso.getNombre());
        System.out.println(local.ingreso.getApellido());





    }

}
