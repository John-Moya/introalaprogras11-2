package Data;

public class Main {

    public static void main(String[] args) {
        // write your code here
    Automovil nissan = new Automovil("89784","Roy","974","2020","MAL ESTADO","G800");
    Mecanico empleado = new Mecanico("Alberto","Completas");
    System.out.println();
    System.out.println("---------------------------------------------------------");
    System.out.println("------------------------DATOS----------------------------");
    System.out.println("El nombre del dueno es : "+ nissan.getDueno());
    System.out.println("Numero de placa : "+ nissan.getPlaca());
    System.out.println("Modelo : " + nissan.getModelo());
    System.out.println("Ultimo vez en RTV : " + nissan.control.getDia()+"/"+nissan.control.getMes()+"/"+nissan.control.getAno()) ;
    System.out.println("Modelo : " + nissan.getModelo());
    System.out.println("Mecanico a cargo :"+ empleado.getNombre());
    System.out.println("---------------------------------------------------------");
    String status = nissan.getEstado();

    if (status=="MAL ESTADO"){
        System.out.println("El mecanico encontro fallos en el automovil");
        System.out.println("ARREGLANDOO......");
        nissan.setEstado("BUEN ESTADO");
        System.out.println("El estado del automovil es:"  +  nissan.getEstado());
    }else {
        System.out.println("El mecanico no encontro ningun fallo");

    }

    



        }
    }



//automotores S.A necesita un programa para el control de los automoviles
//que ingresan los cuales cuentan con los atributos de
//motor, año, estado, estos automoviles debe contener la informacion de RTV
//y son atendidos por un mecanico