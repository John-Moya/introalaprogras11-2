package Data;

public class Main {

    public static void main(String[] args) {
	/* 6. Parqueos S.A. desea desarrollar un programa que pueda registrar los automóviles
	entrantes, recuerde que la información mínima que se desea almacenar es la placa, el nombre
	del propietario y el precio por hora, en este caso debe de por lo menos almacenar dos automóviles
	puede mostrar los automóviles almacenados usando System.out . */

        Automoviles auto01 = new Automoviles ("MNJ47200", "Carlos", "500");
        Automoviles auto02 = new Automoviles("RJK422", "Sandra", "1000");



        //Primer cliente
        System.out.println("El nombre del cliente es: "+ auto01.getNombre_clientes());
        System.out.println("El precio por hora a pagar es: "+ auto01.getPrecio_hora());
        System.out.println("La placa del Vehículo es: "+ auto01.getPlaca() );

        System.out.println("");

        //Segundo Cliente
        System.out.println("El nombre del cliente es: "+ auto02.getNombre_clientes());
        System.out.println("El precio por hora a pagar es: "+ auto02.getPrecio_hora());
        System.out.println("La placa del Vehículo es: "+ auto02.getPlaca());
    }
}
