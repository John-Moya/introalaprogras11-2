package semana06;

public class Main {
    public static void main(String[] args) {
        // Clase Automovil
        Automovil toyota = new Automovil("2500", "1995", "4", 4);
        System.out.println(toyota.getMotor());
        toyota.setMotor("1800");
        for (int i = 0; i < 3; i++) {
            System.out.println(toyota.getMotor());
            toyota.setMotor("1900");
        }

        // Clase Persona
        Persona p = new Persona("Alexey", "19", "Software Engineer");
        System.out.println(p.lugarDeTrabajo.getNombre());

    }
}
