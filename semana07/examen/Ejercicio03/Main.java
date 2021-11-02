package semana07.examen.Ejercicio03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Medico medico = new Medico();
        System.out.println("Numero de medico: ");
        int id = Integer.parseInt(scan.next()); medico.setId(id);
        System.out.println("Nombre del medico: ");
        String nombre = scan.next(); medico.setNombre(nombre);
        System.out.println("Especialidad del medico: ");
        String especialidad = scan.next(); medico.setEspecialidad(especialidad);
        ArrayList<Paciente> pacientes = new ArrayList<>();
        for (int i = 1; i < 3; i++) {
            Paciente paciente = new Paciente();
            System.out.println("Nombre del paciente: ");
            String nombrePaciente = scan.next(); paciente.setNombre(nombre);
            System.out.println("Cedula del paciente: ");
            String cedula = scan.next(); paciente.setCedula(cedula);
            System.out.println("Estadia del paciente: ");
            String estadia = scan.next(); paciente.setEstadia(estadia);
            paciente.setMedico(medico);
            pacientes.add(paciente);
        }
        
        System.out.println(Arrays.toString(pacientes.toArray()));
    }
}
